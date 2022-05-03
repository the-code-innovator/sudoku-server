package com.thecodeinnovator.sudokuserver.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

// @NoRepositoryBean
// public interface GenericPuzzleRepository<T extends GenericPuzzleEntityInterface<T>> extends CrudRepository<T, Long> {
//     Page<T> findAll(Pageable pageable);
// }