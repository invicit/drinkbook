package pl.drinkbook.service;

import java.util.List;
import java.util.stream.Collectors;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.drinkbook.converter.DrinkConverter;
import pl.drinkbook.dto.DrinkDto;
import pl.drinkbook.dto.DrinkLightDto;
import pl.drinkbook.repository.DrinkRepository;


@Service
public class DrinkService {

  @Setter(onMethod = @__({@Autowired}))
  private DrinkRepository drinkRepository;

  @Setter(onMethod = @__({@Autowired}))
  private DrinkConverter drinkConverter;


  public List<DrinkLightDto> getDrinksDto() {
    return drinkConverter.entityListToLightDtoList(drinkRepository.findAll());
  }

  public List<DrinkDto> getDrinks() {
    return drinkConverter.entityListToDtoList(drinkRepository.findAll());
  }

  public List<DrinkLightDto> findDrinksByName(String drinkName) {
    return drinkConverter.entityListToLightDtoList(drinkRepository.findByName(drinkName));
  }

  public boolean hasEnoughtComponents(DrinkDto drink) {
    return drink.getRelationList().stream().allMatch(r -> r.getNeededResources() < r.getComponent().getAvailableResources());
  }

  public List<DrinkLightDto> findAvailable() {
    return getDrinks().stream().filter(this::hasEnoughtComponents).map(drinkConverter::dtoToLightDto).collect(Collectors.toList());
  }


  //TODO
  public void save(){}

}
