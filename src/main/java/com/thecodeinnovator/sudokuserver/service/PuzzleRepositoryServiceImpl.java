package com.thecodeinnovator.sudokuserver.service;

import java.util.List;
import java.util.Optional;

import com.thecodeinnovator.sudokuserver.model.db.Puzzle;
import com.thecodeinnovator.sudokuserver.repository.PuzzleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PuzzleRepositoryServiceImpl {
    
    @Autowired
    PuzzleRepository puzzleRepository;
    
    Optional<Puzzle> findById(String id) {
        return puzzleRepository.findById(id);
    }

    List<Puzzle> findByDifficulty(int difficulty) {
        return puzzleRepository.findByDifficulty(difficulty);
    }

    void save(Puzzle puzzle) {
        puzzleRepository.save(puzzle);
    }
}
