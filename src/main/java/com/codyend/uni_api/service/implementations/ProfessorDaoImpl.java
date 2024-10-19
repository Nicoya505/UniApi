package com.codyend.uni_api.service.implementations;

import com.codyend.uni_api.repository.PersonRepository;
import com.codyend.uni_api.service.contracts.ProfessorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProfessorDaoImpl extends PersonDAOImpl implements ProfessorDAO {
    @Autowired
    public ProfessorDaoImpl(@Qualifier("professorRepository") PersonRepository repository) {
        super(repository);
    }
}
