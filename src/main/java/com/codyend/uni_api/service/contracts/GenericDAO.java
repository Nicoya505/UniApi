package com.codyend.uni_api.service.contracts;

import java.util.List;
import java.util.Optional;

public interface GenericDAO<E>{
    Optional<E> findById(Long id);
    List<E> findAll();
    E save(E entidad);
    void deleteById(Long id);
}
