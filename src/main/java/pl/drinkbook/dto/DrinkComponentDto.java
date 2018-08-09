package pl.drinkbook.dto;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.drinkbook.common.DrinkComponentable;
import pl.drinkbook.enums.ComponentType;
import pl.drinkbook.enums.UnitType;


@Getter
@Setter
@NoArgsConstructor
public class DrinkComponentDto implements DrinkComponentable {

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
