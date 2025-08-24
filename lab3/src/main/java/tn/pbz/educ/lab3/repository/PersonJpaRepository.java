package tn.pbz.educ.lab3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.pbz.educ.lab3.model.entity.Person;

@Repository
public interface PersonJpaRepository extends JpaRepository<Person, Long> {

}
