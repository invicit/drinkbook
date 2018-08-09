package pl.drinkbook.common;

import pl.drinkbook.enums.ComponentType;
import pl.drinkbook.enums.UnitType;

public interface DrinkComponentable {
  Long getId();
  Double getAvailableResources();
  ComponentType getComponentType();
  UnitType getUnitType();
  Boolean getCountable();
}
