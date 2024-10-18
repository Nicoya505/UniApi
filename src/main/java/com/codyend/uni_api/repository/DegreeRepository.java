package com.codyend.uni_api.repository;

import com.codyend.uni_api.model.Degree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DegreeRepository extends JpaRepository<Degree, Long> {
    @Query("select d from Degree d where d.name like %?1%")
    List<Degree> findDegreeByNameContains(String name);
    @Query("select d from Degree d where  d.numberOfYears > ?1")
    List<Degree> findDegreeByNumberYearAfter(int numberYear);
}
