package com.thecodeinnovator.sudokuserver.service;

import java.util.List;
import java.util.Optional;

import com.thecodeinnovator.sudokuserver.model.Puzzle;
import com.thecodeinnovator.sudokuserver.repository.PuzzleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PuzzleService {
    @Autowired
    PuzzleRepository puzzleRepository;

    public Optional<Puzzle> fetchPuzzleWithID(String id) {
        return puzzleRepository.findById(id);
    }

    public List<Puzzle> fetchByDifficulty(int difficulty) {
        return puzzleRepository.findByDifficulty(difficulty);
    }
}