package pl.drinkbook.dto;

import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.drinkbook.entities.Drink;
import pl.drinkbook.entities.DrinkComponentToDrinkRelation;
import pl.drinkbook.enums.ComponentType;
import pl.drinkbook.enums.UnitType;


@Getter
@Setter
@NoArgsConstructor
public class DrinkComponentDto {

  private Long id;
  private Double availableResources;
  private ComponentType componentType;
  private UnitType unitType;
  private Boolean countable;
  private List<DrinkComponentToDrinkRelationDto> relationList;


  public DrinkComponentDto(Long id, Double availableResources,
      ComponentType componentType, UnitType unitType, Boolean countable,
      List<DrinkComponentToDrinkRelationDto> relationList) {
    this.id = id;
    this.availableResources = availableResources;
    this.componentType = componentType;
    this.unitType = unitType;
    this.countable = countable;
    this.relationList = relationList;
  }
}
