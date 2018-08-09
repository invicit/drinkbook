package pl.drinkbook.dto;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.drinkbook.common.Drinkable;

@Getter
@Setter
@NoArgsConstructor
public class DrinkDto implements Drinkable {

  private Long id;
  private String name;
  private String recipe;
  private List<DrinkComponentToDrinkRelationDto> relationList;


  public DrinkDto(Long id, String name, String recipe,
      List<DrinkComponentToDrinkRelationDto> relationList) {
    this.id = id;
    this.name = name;
    this.recipe = recipe;
    this.relationList = relationList;
  }
}
