package com.codyend.uni_api.service.implementations;

import com.codyend.uni_api.model.Building;
import com.codyend.uni_api.repository.BuildingRepository;
import com.codyend.uni_api.service.contracts.BuildingDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingDAOImpl extends GenericDAOImpl<Building, BuildingRepository> implements BuildingDAO {
    @Autowired
    public BuildingDAOImpl(BuildingRepository repository) {
        super(repository);
    }
}
