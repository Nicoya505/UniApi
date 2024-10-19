package com.codyend.uni_api.service.implementations;

import com.codyend.uni_api.model.Person;
import com.codyend.uni_api.repository.PersonRepository;
import com.codyend.uni_api.service.contracts.PersonDAO;

import java.util.List;
import java.util.Optional;

public class PersonDAOImpl extends GenericDAOImpl<Person, PersonRepository> implements PersonDAO {
    public PersonDAOImpl(PersonRepository repository) {
        super(repository);
    }

    @Override
    public Optional<Person> findByNameAndLastName(String name, String lastName) {
        return repository.findByNameAndLastName(name, lastName);
    }

    @Override
    public Optional<Person> findByDni(String dni) {
        return repository.findByDni(dni);
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }
}
