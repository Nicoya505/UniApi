package com.codyend.uni_api.service.implementations;

import com.codyend.uni_api.model.Degree;
import com.codyend.uni_api.repository.DegreeRepository;
import com.codyend.uni_api.service.contracts.DegreeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DegreeDAOImpl extends GenericDAOImpl<Degree, DegreeRepository> implements DegreeDAO{
    @Autowired
    public DegreeDAOImpl(DegreeRepository repository) {
        super(repository);
    }

    @Override
    public List<Degree> findDegreeByNameContains(String name) {
        return repository.findDegreeByNameContains(name);
    }

    @Override
    public List<Degree> findDegreeByNumberYearAfter(int numberYear) {
        return repository.findDegreeByNumberYearAfter(numberYear);
    }
}
