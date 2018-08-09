package pl.drinkbook.dto;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DrinkLightDto {

  private Long id;
  private String name;
  private String recipe;


  public DrinkLightDto(Long id, String name, String recipe) {
    this.id = id;
    this.name = name;
    this.recipe = recipe;
  }

}
