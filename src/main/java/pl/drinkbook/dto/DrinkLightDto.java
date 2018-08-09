package pl.drinkbook.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.drinkbook.common.Drinkable;

@Getter
@Setter
@NoArgsConstructor
public class DrinkLightDto implements Drinkable {

  private Long id;
  private String name;
  private String recipe;


  public DrinkLightDto(Long id, String name, String recipe) {
    this.id = id;
    this.name = name;
    this.recipe = recipe;
  }

}
