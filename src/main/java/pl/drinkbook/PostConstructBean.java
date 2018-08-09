package pl.drinkbook;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.drinkbook.entities.Drink;
import pl.drinkbook.entities.DrinkComponent;
import pl.drinkbook.entities.DrinkComponentToDrinkRelation;
import pl.drinkbook.enums.ComponentType;
import pl.drinkbook.enums.UnitType;
import pl.drinkbook.repository.DrinkComponentRepository;
import pl.drinkbook.repository.DrinkComponentToDrinkRelationRepository;
import pl.drinkbook.repository.DrinkRepository;

@Component
public class PostConstructBean {

  private DrinkComponentRepository drinkComponentRepository;
  private DrinkRepository drinkRepository;
  private DrinkComponentToDrinkRelationRepository relationRepository;

  @Autowired
  public PostConstructBean(DrinkComponentRepository drinkComponentRepository,
      DrinkRepository drinkRepository,
      DrinkComponentToDrinkRelationRepository relationRepository) {
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

    Drink drink = new Drink();
    drink.setName("Wodka");
    drink.setRecipe("Nalej wodki do szklanki");


    DrinkComponent component = new DrinkComponent();
    component.setAvailableResources(12.0);
    component.setComponentType(ComponentType.VODKA);
    component.setCountable(false);
    component.setUnitType(UnitType.LITER);

    drinkComponentRepository.save(component);
    drinkRepository.save(drink);

    DrinkComponentToDrinkRelation drinkRelation = new DrinkComponentToDrinkRelation();
    drinkRelation.setNeededReosurces(4);
    drinkRelation.setComponent(component);
    drinkRelation.setDrink(drink);
    relationRepository.save(drinkRelation);



//    List<DrinkComponentToDrinkRelation> drinkComponentRelationList = new ArrayList<>();
//    drinkComponentRelationList.add(drinkRelation);
//    component.setRelationList(drinkComponentRelationList);
//    drinkComponentRepository.save(component);
//
//
//    List<DrinkComponentToDrinkRelation> drinkRelationList = new ArrayList<>();
//    drinkRelationList.add(drinkRelation);
//    drink.setRelationList(drinkRelationList);
//    drinkRepository.save(drink);
  }
  private void createDrink2() {

    Drink drink = new Drink();
    drink.setName("Whisky");
    drink.setRecipe("Nalej whisky do szklanki i wrzuc cytryne");
    drinkRepository.save(drink);


    DrinkComponent component = new DrinkComponent();
    component.setAvailableResources(1.0);
    component.setComponentType(ComponentType.WHISKY);
    component.setCountable(false);
    component.setUnitType(UnitType.LITER);
    drinkComponentRepository.save(component);

    DrinkComponent component1 = new DrinkComponent();
    component1.setAvailableResources(2.0);
    component1.setComponentType(ComponentType.LEMON);
    component1.setCountable(true);
    component1.setUnitType(UnitType.PIECE);
    drinkComponentRepository.save(component1);





    DrinkComponentToDrinkRelation drinkRelation = new DrinkComponentToDrinkRelation();
    drinkRelation.setNeededReosurces(4);
    drinkRelation.setComponent(component);
    drinkRelation.setDrink(drink);
    relationRepository.save(drinkRelation);

    DrinkComponentToDrinkRelation drinkRelation1 = new DrinkComponentToDrinkRelation();
    drinkRelation1.setNeededReosurces(1);
    drinkRelation1.setComponent(component1);
    drinkRelation1.setDrink(drink);
    relationRepository.save(drinkRelation1);
  }

}
