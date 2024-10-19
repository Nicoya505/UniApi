package com.codyend.uni_api.service.contracts;

import com.codyend.uni_api.model.Degree;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DegreeDAO extends GenericDAO<Degree> {
    List<Degree> findDegreeByNameContains(String name);
    List<Degree> findDegreeByNumberYearAfter(int numberYear);
}
