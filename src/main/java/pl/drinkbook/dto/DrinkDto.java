package pl.drinkbook.dto;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DrinkDto {

  private Long id;
  private String name;
  private String recipe;
  private List<DrinkComponentToDrinkRelationDto> relationList;
}
