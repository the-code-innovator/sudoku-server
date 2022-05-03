package com.thecodeinnovator.sudokuserver.service.generic;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

// @Service
// public class GenericPuzzleService<V extends GenericPuzzleEntityInterface<V>> {
//     @Autowired
//     private final GenericPuzzleRepository<V> repository;
    
//     public GenericPuzzleService(GenericPuzzleRepository<V> repository) {
//         this.repository = repository;
//     }

//     public Page<V> getPage(Pageable pageable) {
//         return repository.findAll(pageable);
//     }

//     public Optional<V> get(Long id) {
//         return repository.findById(id);
//     }
// }
