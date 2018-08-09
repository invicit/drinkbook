package pl.drinkbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.drinkbook.entities.DrinkComponentToDrinkRelation;

public interface DrinkComponentToDrinkRelationRepository extends
    JpaRepository<DrinkComponentToDrinkRelation, Long> {

}
