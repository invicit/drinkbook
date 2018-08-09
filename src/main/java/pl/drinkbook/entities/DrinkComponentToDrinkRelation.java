package pl.drinkbook.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import pl.drinkbook.entities.additionalkeys.DrinkAndDrinkComponentKey;


@Getter
@Setter
@Entity
//@IdClass(DrinkAndDrinkComponentKey.class)
@Table(name = "drink_componennt_drink")
public class DrinkComponentToDrinkRelation {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  //@Id
 // @Column(name = "drink_id")
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="drink_id")
  private Drink drink;

  //@Id
  @ManyToOne(fetch = FetchType.LAZY)
   //   cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  @JoinColumn(name="component_id")
  private DrinkComponent component;


  @Column(name = "needed_resources")
  private long neededReosurces;




}
