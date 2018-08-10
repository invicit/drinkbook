package pl.drinkbook.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import pl.drinkbook.entities.DrinkComponentBo;
import pl.drinkbook.enums.EComponentType;

public interface IDrinkComponentRepository extends JpaRepository<DrinkComponentBo, Long> {

  List<DrinkComponentBo> findByComponentType(@Param("component_name") EComponentType name);


}