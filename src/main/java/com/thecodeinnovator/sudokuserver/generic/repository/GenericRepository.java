package com.thecodeinnovator.sudokuserver.generic.repository;

import com.thecodeinnovator.sudokuserver.generic.entity.GenericEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository <T extends GenericEntity<T>> {

    Page<T> findAll(Pageable pageable);

    T save(T dbDomain);

    void deleteById(Long id);

    Object findById(Long id);

}