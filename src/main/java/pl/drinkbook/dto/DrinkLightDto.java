package pl.drinkbook.dto;

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

}
