package pl.drinkbook.dto;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.drinkbook.enums.EComponentType;
import pl.drinkbook.enums.EUnitType;


@Getter
@Setter
@NoArgsConstructor
public class DrinkComponentDto {

  private Long id;
  private Double availableResources;
  private EComponentType componentType;
  private EUnitType unitType;
  private Boolean countable;
  private List<DrinkComponentToDrinkRelationDto> relationList;


}
