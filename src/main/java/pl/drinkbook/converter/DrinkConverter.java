package pl.drinkbook.converter;


import java.util.List;
import java.util.stream.Collectors;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.drinkbook.dto.DrinkDto;
import pl.drinkbook.dto.DrinkLightDto;
import pl.drinkbook.entities.DrinkBo;

@Component
public class DrinkConverter {

  @Setter(onMethod = @__({@Autowired}))
  DrinkComponentToDrinkRelationConverter converter;


  public List<DrinkDto> entityListToDtoList(List<DrinkBo> ins) {
    return ins.stream().map(this::entityToDto).collect(Collectors.toList());
  }

  public List<DrinkLightDto> entityListToLightDtoList(List<DrinkBo> ins) {
    return ins.stream().map(this::entityToLightDto).collect(Collectors.toList());
  }

  public DrinkLightDto entityToLightDto(DrinkBo in) {
    DrinkLightDto out = new DrinkLightDto();
    out.setId(in.getId());
    out.setName(in.getName());
    out.setRecipe(in.getRecipe());
    return out;
  }

  public DrinkLightDto drinkableToLightDto(DrinkDto in) {
    DrinkLightDto out = new DrinkLightDto();
    out.setId(in.getId());
    out.setName(in.getName());
    out.setRecipe(in.getRecipe());
    return out;
  }


  public DrinkDto entityToDto(DrinkBo in) {
    DrinkDto out = new DrinkDto();
    out.setId(in.getId());
    out.setName(in.getName());
    out.setRecipe(in.getRecipe());
    out.setRelationList(in.getRelationList().stream().map(r -> converter.entityToDto(r, out))
        .collect(Collectors.toList()));
    return out;
  }


}
