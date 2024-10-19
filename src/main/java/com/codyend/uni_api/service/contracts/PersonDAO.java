package com.codyend.uni_api.service.contracts;

import com.codyend.uni_api.model.Person;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PersonDAO extends GenericDAO<Person>{
    Optional<Person> findByNameAndLastName(String name, String lastName);
    Optional<Person> findByDni(String dni);
    List<Person> findByLastName(String lastName);
}
