package pl.drinkbook;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.drinkbook.entities.DrinkBo;
import pl.drinkbook.entities.DrinkComponentBo;
import pl.drinkbook.entities.DrinkComponentToDrinkRelationBo;
import pl.drinkbook.enums.EComponentType;
import pl.drinkbook.enums.EUnitType;
import pl.drinkbook.repository.IDrinkComponentRepository;
import pl.drinkbook.repository.IDrinkComponentToDrinkRelationRepository;
import pl.drinkbook.repository.IDrinkRepository;

@Component
public class PostConstructBean {

  private IDrinkComponentRepository drinkComponentRepository;
  private IDrinkRepository drinkRepository;
  private IDrinkComponentToDrinkRelationRepository relationRepository;

  @Autowired
  public PostConstructBean(IDrinkComponentRepository drinkComponentRepository,
      IDrinkRepository drinkRepository,
      IDrinkComponentToDrinkRelationRepository relationRepository) {
    this.drinkComponentRepository = drinkComponentRepository;
    this.drinkRepository = drinkRepository;
    this.relationRepository = relationRepository;
  }

  @PostConstruct
  public void init() {
    createDrink1();
    createDrink2();
  }

  private void createDrink1() {

    DrinkBo drink = new DrinkBo();
    drink.setName("Wodka");
    drink.setRecipe("Nalej wodki do szklanki");

    DrinkComponentBo component = new DrinkComponentBo();
    component.setAvailableResources(12.0);
    component.setComponentType(EComponentType.VODKA);
    component.setCountable(false);
    component.setUnitType(EUnitType.LITER);

    drinkComponentRepository.save(component);
    drinkRepository.save(drink);

    DrinkComponentToDrinkRelationBo drinkRelation = new DrinkComponentToDrinkRelationBo();
    drinkRelation.setNeededReosurces(4);
    drinkRelation.setComponent(component);
    drinkRelation.setDrink(drink);
    relationRepository.save(drinkRelation);

//    List<DrinkComponentToDrinkRelationBo> drinkComponentRelationList = new ArrayList<>();
//    drinkComponentRelationList.add(drinkRelation);
//    component.setRelationList(drinkComponentRelationList);
//    drinkComponentRepository.save(component);
//
//
//    List<DrinkComponentToDrinkRelationBo> drinkRelationList = new ArrayList<>();
//    drinkRelationList.add(drinkRelation);
//    drink.setRelationList(drinkRelationList);
//    drinkRepository.save(drink);
  }

  private void createDrink2() {

    DrinkBo drink = new DrinkBo();
    drink.setName("Whisky");
    drink.setRecipe("Nalej whisky do szklanki i wrzuc cytryne");
    drinkRepository.save(drink);

    DrinkComponentBo component = new DrinkComponentBo();
    component.setAvailableResources(1.0);
    component.setComponentType(EComponentType.WHISKY);
    component.setCountable(false);
    component.setUnitType(EUnitType.LITER);
    drinkComponentRepository.save(component);

    DrinkComponentBo component1 = new DrinkComponentBo();
    component1.setAvailableResources(2.0);
    component1.setComponentType(EComponentType.LEMON);
    component1.setCountable(true);
    component1.setUnitType(EUnitType.PIECE);
    drinkComponentRepository.save(component1);

    DrinkComponentToDrinkRelationBo drinkRelation = new DrinkComponentToDrinkRelationBo();
    drinkRelation.setNeededReosurces(4);
    drinkRelation.setComponent(component);
    drinkRelation.setDrink(drink);
    relationRepository.save(drinkRelation);

    DrinkComponentToDrinkRelationBo drinkRelation1 = new DrinkComponentToDrinkRelationBo();
    drinkRelation1.setNeededReosurces(1);
    drinkRelation1.setComponent(component1);
    drinkRelation1.setDrink(drink);
    relationRepository.save(drinkRelation1);
  }

}
