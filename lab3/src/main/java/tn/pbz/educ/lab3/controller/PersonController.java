package tn.pbz.educ.lab3.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.pbz.educ.lab3.model.dto.PersonDto;
import tn.pbz.educ.lab3.service.PersonService;

@RestController
@AllArgsConstructor
public class PersonController {

  private PersonService personService;

  @GetMapping("/api/person/{id}")
  public PersonDto getPersonById(@PathVariable("id") Long id) {
    return new PersonDto(personService.getById(id));
  }

  @PostMapping("/api/person")
  public PersonDto createPerson(@RequestBody PersonDto personDto) {
    return new PersonDto(personService.save(personDto));
  }

  @PutMapping("/api/person")
  public PersonDto updatePerson(@RequestBody PersonDto personDto) {
    return new PersonDto(personService.update(personDto));
  }

  @DeleteMapping("/api/person/{id}")
  public PersonDto deletePersonById(@PathVariable("id") Long id) {
    return new PersonDto(personService.deleteById(id));
  }
}
