package tn.pbz.educ.lab3.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.pbz.educ.lab3.model.dto.PersonDto;
import tn.pbz.educ.lab3.model.entity.Person;
import tn.pbz.educ.lab3.repository.PersonJpaRepository;
import tn.pbz.educ.lab3.service.PersonService;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

  private PersonJpaRepository personJpaRepository;

  @Override
  public Person save(PersonDto personDto) {
    Person person = new Person(personDto);
    return personJpaRepository.save(person);
  }

  @Override
  public Person update(PersonDto personDto) {
    Person person = getById(personDto.getId());

    person.setName(personDto.getName());
    person.setAge(personDto.getAge());

    return personJpaRepository.save(person);
  }

  @Override
  public Person getById(Long id) {
    return personJpaRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No person found with the data id"));
  }

  @Override
  public Person deleteById(Long id) {
    Person person = getById(id);

    personJpaRepository.delete(person);

    return person;
  }
}
