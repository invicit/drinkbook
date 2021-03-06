package pl.drinkbook.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "drink")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "seq_drink")
public class DrinkBo {

  @Id
  @Column(name = "drink_id")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
  private Long id;

  @Column(name = "drink_name")
  private String name;

  @Column(name = "recipe")
  private String recipe;

  @OneToMany(mappedBy = "drink")
  private List<DrinkComponentToDrinkRelationBo> relationList;

}
