package pl.drinkbook.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import pl.drinkbook.entities.Drink;

public interface DrinkRepository extends JpaRepository<Drink, Long> {

  List<Drink> findByName(@Param("drink_name") String name);

}
