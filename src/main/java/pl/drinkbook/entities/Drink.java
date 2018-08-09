package pl.drinkbook.entities;

import java.util.List;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import pl.drinkbook.common.Drinkable;

@Getter
@Setter
@Entity
@Table(name = "drink")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "seq_drink")
public class Drink implements Drinkable {

  @Id
  @Column(name = "drink_id")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
  private Long id;

  @Column(name = "drink_name")
  private String name;

  @Column(name = "recipe")
  private String recipe;

 // @OneToMany(mappedBy = "DrinkComponentToDrinkRelation")
//  @JoinColumn(name = "drink_id")
 @OneToMany(mappedBy = "drink")
 private List<DrinkComponentToDrinkRelation> relationList;

}
