package pl.drinkbook.converter;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.drinkbook.dto.DrinkComponentToDrinkRelationDto;
import pl.drinkbook.dto.DrinkDto;
import pl.drinkbook.entities.DrinkComponentToDrinkRelationBo;

@Component
public class DrinkComponentToDrinkRelationConverter {

  @Setter(onMethod = @__({@Autowired}))
  DrinkComponentConverter componentConverter;

  public DrinkComponentToDrinkRelationDto entityToDto(DrinkComponentToDrinkRelationBo in,
      DrinkDto owner) {
    DrinkComponentToDrinkRelationDto out = new DrinkComponentToDrinkRelationDto();
    out.setDrink(owner);
    out.setNeededResources(in.getNeededReosurces());
    out.setComponent(componentConverter.entityToDto(in.getComponent()));
    return out;
  }


}
