package pl.drinkbook.api;


import java.util.List;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.drinkbook.dto.DrinkComponentDto;
import pl.drinkbook.enums.ComponentType;
import pl.drinkbook.service.DrinkComponentService;

@RestController
@RequestMapping(value = "/components")
public class DrinkComponentController {

  @Setter(onMethod = @__({@Autowired}))
  public DrinkComponentService drinkComponentService;

  @PostMapping(value = "/availableComponents")
  private List<DrinkComponentDto> getAvailableResources(){
    return drinkComponentService.getAvailableResources();
  }

  @PostMapping(value = "/findComponent")
  private List<DrinkComponentDto> findComponentByName(@RequestParam("component_name") ComponentType type){
    return drinkComponentService.findComponentByName(type);
  }




}
