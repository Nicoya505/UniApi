package com.codyend.uni_api.repository;

import com.codyend.uni_api.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query("select p from Person p where p.name=?1 and p.lastName=?2")
    Optional<Person> findByNameAndLastName(String name, String lastName);
    @Query("select p from Person p where p.dni=?1")
    Optional<Person> findByDni(String dni);
    @Query("select p from Person p where p.lastName like %?1%")
    Optional<Person> findByLastName(String lastName);
}
