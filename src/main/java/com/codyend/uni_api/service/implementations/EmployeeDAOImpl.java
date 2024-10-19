package com.codyend.uni_api.service.implementations;

import com.codyend.uni_api.repository.PersonRepository;
import com.codyend.uni_api.service.contracts.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDAOImpl  extends PersonDAOImpl implements EmployeeDAO{
    @Autowired
    public EmployeeDAOImpl(@Qualifier("employeeRepository") PersonRepository repository) {
        super(repository);
    }
}
