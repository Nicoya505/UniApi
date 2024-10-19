package com.codyend.uni_api.service.contracts;

import com.codyend.uni_api.model.Person;

import java.util.List;

public interface StudentDAO extends PersonDAO{
    List<Person> findStudentsByNameDegree(String nameDegree);
}
