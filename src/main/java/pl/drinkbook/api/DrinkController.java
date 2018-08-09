package pl.drinkbook.api;

import java.util.List;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.drinkbook.dto.DrinkDto;
import pl.drinkbook.dto.DrinkLightDto;
import pl.drinkbook.service.DrinkService;

@RestController
@RequestMapping(value = "/drinks")
public class DrinkController {

  @Setter(onMethod = @__({@Autowired}))
  private DrinkService drinkService;


  @GetMapping(value = "/list")
  public List<DrinkLightDto> getDrinkNames() {

    return drinkService.getDrinksDto();
  }

  @GetMapping(value = "/findDrink/{drinkName}")
  public List<DrinkLightDto> findDrinksByName(@PathVariable("drinkName") String drinkName){
    return drinkService.findDrinksByName(drinkName);
  }

  @GetMapping(value = "/showAvailable")
  public List<DrinkLightDto> showAvailable(){
    return drinkService.findAvailable();
  }



}
