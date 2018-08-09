package pl.drinkbook.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.drinkbook.entities.Drink;
import pl.drinkbook.entities.DrinkComponent;


@Getter
@Setter
@NoArgsConstructor
public class DrinkComponentToDrinkRelationDto {


  private DrinkDto drink;
  private DrinkComponentDto component;
  private long neededResources;


  public DrinkComponentToDrinkRelationDto(DrinkDto drink, DrinkComponentDto component,
      long neededResources) {
    this.drink = drink;
    this.component = component;
    this.neededResources = neededResources;
  }
}
