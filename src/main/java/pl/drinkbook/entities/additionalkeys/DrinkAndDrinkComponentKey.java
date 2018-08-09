package pl.drinkbook.entities.additionalkeys;

import java.io.Serializable;
import pl.drinkbook.entities.Drink;
import pl.drinkbook.entities.DrinkComponent;

public class DrinkAndDrinkComponentKey implements Serializable {
  private Drink drink;
  private DrinkComponent component;
}
