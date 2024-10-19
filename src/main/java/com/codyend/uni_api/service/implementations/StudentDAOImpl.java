package com.codyend.uni_api.service.implementations;

import com.codyend.uni_api.model.Person;
import com.codyend.uni_api.repository.PersonRepository;
import com.codyend.uni_api.repository.StudentRepository;
import com.codyend.uni_api.service.contracts.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDAOImpl extends PersonDAOImpl implements StudentDAO {
    @Autowired
    public StudentDAOImpl(@Qualifier("studentRepository") PersonRepository repository) {
        super(repository);
    }

    @Override
    public List<Person> findStudentsByNameDegree(String nameDegree) {
        return ((StudentRepository)repository).findStudentsByNameDegree(nameDegree);
    }
}
