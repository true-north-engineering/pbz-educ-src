package tn.pbz.educ.lab3.service;

import tn.pbz.educ.lab3.model.dto.PersonDto;
import tn.pbz.educ.lab3.model.entity.Person;

public interface PersonService {

  Person save(PersonDto personDto);

  Person update(PersonDto personDto);

  Person getById(Long id);

  Person deleteById(Long id);
}
