package pl.drinkbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.drinkbook.entities.DrinkComponentToDrinkRelation;
import pl.drinkbook.entities.additionalkeys.DrinkAndDrinkComponentKey;

public interface DrinkComponentToDrinkRelationRepository extends
    JpaRepository<DrinkComponentToDrinkRelation, DrinkAndDrinkComponentKey> {

}
