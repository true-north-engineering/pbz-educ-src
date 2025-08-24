package tn.pbz.educ.lab3.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.pbz.educ.lab3.model.entity.Person;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonDto {

  private Long id;
  private String name;
  private Integer age;

  public PersonDto(Person person) {
    this.id = person.getId();
    this.name = person.getName();
    this.age = person.getAge();
  }
}
