package pl.drinkbook.service;

import java.util.List;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.drinkbook.converter.DrinkComponentConverter;
import pl.drinkbook.dto.DrinkComponentDto;
import pl.drinkbook.enums.ComponentType;
import pl.drinkbook.repository.DrinkComponentRepository;

//TODO
@Service
public class DrinkComponentService {

  @Setter(onMethod = @__({@Autowired}))
  private DrinkComponentRepository drinkComponentRepository;

  @Setter(onMethod = @__({@Autowired}))
  private DrinkComponentConverter componentConverter;

  public List<DrinkComponentDto> getAvailableResources() {
    return componentConverter.entityListToDtoList(drinkComponentRepository.findAll());
  }

  public List<DrinkComponentDto> findComponentByName(ComponentType name) {
    return componentConverter.entityListToDtoList(drinkComponentRepository.findByComponentType(name));
  }
}
