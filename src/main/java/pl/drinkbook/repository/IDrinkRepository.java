package pl.drinkbook.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.drinkbook.entities.DrinkBo;

public interface IDrinkRepository extends JpaRepository<DrinkBo, Long> {

  List<DrinkBo> findByName(String name);

}
