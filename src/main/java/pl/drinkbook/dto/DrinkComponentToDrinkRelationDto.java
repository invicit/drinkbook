package pl.drinkbook.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class DrinkComponentToDrinkRelationDto {

  private DrinkDto drink;
  private DrinkComponentDto component;
  private Long neededResources;

}
