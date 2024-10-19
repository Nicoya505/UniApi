package com.codyend.uni_api.service.implementations;

import com.codyend.uni_api.service.contracts.GenericDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class GenericDAOImpl <E, R extends JpaRepository<E, Long>> implements GenericDAO<E> {

    protected final R repository;

    public GenericDAOImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public Optional<E> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<E> findAll() {
        return repository.findAll();
    }

    @Override
    public E save(E entidad) {
        return repository.save(entidad);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
