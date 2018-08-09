package pl.drinkbook.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import pl.drinkbook.entities.DrinkComponent;
import pl.drinkbook.enums.ComponentType;

public interface DrinkComponentRepository extends JpaRepository<DrinkComponent, Long> {

  List<DrinkComponent> findByComponentType(@Param("component_name") ComponentType name);


}
