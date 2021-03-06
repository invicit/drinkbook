package pl.drinkbook.converter;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import pl.drinkbook.dto.DrinkComponentDto;
import pl.drinkbook.entities.DrinkComponentBo;

@Component
public class DrinkComponentConverter {

  public List<DrinkComponentDto> entityListToDtoList(List<DrinkComponentBo> ins) {
    return ins.stream().map(this::entityToDto).collect(Collectors.toList());
  }

  public DrinkComponentDto entityToDto(DrinkComponentBo in) {
    DrinkComponentDto out = new DrinkComponentDto();
    out.setId(in.getId());
    out.setAvailableResources(in.getAvailableResources());
    out.setComponentType(in.getComponentType());
    out.setUnitType(in.getUnitType());
    out.setCountable(in.getCountable());
    return out;
  }


}
