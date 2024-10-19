package com.codyend.uni_api.service.implementations;

import com.codyend.uni_api.model.Classroom;
import com.codyend.uni_api.repository.ClassroomRepository;
import com.codyend.uni_api.service.contracts.ClassroomDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomDAOImpl extends GenericDAOImpl<Classroom, ClassroomRepository> implements ClassroomDAO {
    @Autowired
    public ClassroomDAOImpl(ClassroomRepository repository) {
        super(repository);
    }
}
