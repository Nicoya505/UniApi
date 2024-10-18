package com.codyend.uni_api.repository;

import com.codyend.uni_api.model.Person;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends PersonRepository{
    @Query("select s from Student s join fetch s.degree d where d.name = ?1")
    List<Person>findStudentsByNameDegree(String nameDegree);
}
