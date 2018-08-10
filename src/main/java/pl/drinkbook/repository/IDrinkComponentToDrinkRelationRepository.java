package pl.drinkbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.drinkbook.entities.DrinkComponentToDrinkRelationBo;

public interface IDrinkComponentToDrinkRelationRepository extends
    JpaRepository<DrinkComponentToDrinkRelationBo, Long> {

}
