package pl.drinkbook.entities;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import pl.drinkbook.enums.ComponentType;
import pl.drinkbook.enums.UnitType;

@Getter
@Setter
@Entity
@Table(name = "drink_componennt")
@SequenceGenerator(allocationSize = 1, name = "SEQ1", sequenceName = "seq_component")
public class DrinkComponent {

  @Id
  @Column(name="component_id")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ1")
  private Long id;

  @Column(name = "available_resources")
  private Double availableResources;

  @Column(name = "component_name")
  @Enumerated(EnumType.STRING)
  private ComponentType componentType;

  @Column(name = "component_unit")
  @Enumerated(EnumType.STRING)
  private UnitType unitType;

  @Column(name = "coutable")
  private Boolean countable;

  @OneToMany(mappedBy = "component")
  private List<DrinkComponentToDrinkRelation> relationList;


}
