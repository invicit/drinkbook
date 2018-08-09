package pl.drinkbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "drink_componennt_drink")
public class DrinkComponentToDrinkRelation {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "drink_id")
  private Drink drink;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "component_id")
  private DrinkComponent component;


  @Column(name = "needed_resources")
  private long neededReosurces;


}
