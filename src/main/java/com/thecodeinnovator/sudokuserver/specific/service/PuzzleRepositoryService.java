package com.thecodeinnovator.sudokuserver.specific.service;

import java.util.List;
import java.util.Optional;

import com.thecodeinnovator.sudokuserver.specific.model.db.Puzzle;


public interface PuzzleRepositoryService {

    Optional<Puzzle> findById(String id);

    List<Puzzle> findByDifficulty(int difficulty);

    void save(Puzzle puzzle);

    Optional<Puzzle> findBySlugID(String slugID);
}
