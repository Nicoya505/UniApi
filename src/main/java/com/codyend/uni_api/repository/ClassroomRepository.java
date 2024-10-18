package com.codyend.uni_api.repository;

import com.codyend.uni_api.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}
