package com.thecodeinnovator.sudokuserver.specific.repository;

import java.util.List;

import com.thecodeinnovator.sudokuserver.specific.model.db.Puzzle;

import org.springframework.data.repository.CrudRepository;

public interface PuzzleRepository extends CrudRepository<Puzzle, String> {
    List<Puzzle> findByDifficulty(int difficulty);
    
    Puzzle findBySlugId(String slug_id);
}