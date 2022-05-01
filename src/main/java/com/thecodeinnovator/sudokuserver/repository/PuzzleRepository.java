package com.thecodeinnovator.sudokuserver.repository;

import java.util.List;

import com.thecodeinnovator.sudokuserver.model.db.Puzzle;

import org.springframework.data.repository.CrudRepository;

public interface PuzzleRepository extends CrudRepository<Puzzle, String> {
    List<Puzzle> findByDifficulty(int difficulty);
    // Optional<Puzzle> findById(String id);
}