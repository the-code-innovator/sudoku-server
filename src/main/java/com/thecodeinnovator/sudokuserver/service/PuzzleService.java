package com.thecodeinnovator.sudokuserver.service;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

import com.thecodeinnovator.sudokuserver.model.db.Puzzle;
import com.thecodeinnovator.sudokuserver.model.request.SavePuzzleRequestModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PuzzleService {
    @Autowired
    PuzzleRepositoryServiceImpl puzzleRepositoryServiceImpl;

    @Autowired
    SlugService slugService;

    @Autowired
    MappedPuzzleElementHashService mappedPuzzleElementHashService;

    public Optional<Puzzle> fetchPuzzleWithID(String id) {
        return puzzleRepositoryServiceImpl.findById(id);
    }

    public List<Puzzle> fetchByDifficulty(int difficulty) {
        return puzzleRepositoryServiceImpl.findByDifficulty(difficulty);
    }

    public void savePuzzleToDatabase(SavePuzzleRequestModel model) throws NoSuchAlgorithmException {
        Puzzle puzzle = new Puzzle();
        puzzle.setDifficulty(
            model.getDifficulty()
        );
        puzzle.setCreated_by(
            model.getCreated_by()
        );
        puzzle.setCreated_on(
            model.getCreated_on()
        );
        puzzle.setSize(
            model.getSize()
        );
        puzzle.setSolved_by("");
        puzzle.setSolved_flag(false);

        puzzle.setHole_hash(
            mappedPuzzleElementHashService.generateHoleHashFromPuzzle(
                model.getPuzzle(),
                model.getSize()
            )
        );
        puzzle.setPosition_hash(
            mappedPuzzleElementHashService.generatePositionHashFromPuzzle(
                model.getPuzzle(),
                model.getSize()
            )
        );
        puzzle.setPuzzle_hash(
            mappedPuzzleElementHashService.generatePuzzleHashFromPuzzle(
                model.getPuzzle(),
                model.getSize()
            )
        );
        
        puzzle.setSlug_id(
            slugService.generateSlugIDFromHash(
                puzzle.getHole_hash(),
                puzzle.getPosition_hash(),
                puzzle.getPuzzle_hash(),
                model.getSize()
            )
        );
        puzzleRepositoryServiceImpl.save(puzzle);
    }

    public String getSlugID(SavePuzzleRequestModel model) throws NoSuchAlgorithmException {
        Puzzle puzzle = new Puzzle();
        puzzle.setDifficulty(
            model.getDifficulty()
        );
        puzzle.setCreated_by(
            model.getCreated_by()
        );
        puzzle.setCreated_on(
            model.getCreated_on()
        );
        puzzle.setSize(
            model.getSize()
        );
        puzzle.setSolved_by("");
        puzzle.setSolved_flag(false);

        puzzle.setHole_hash(
            mappedPuzzleElementHashService.generateHoleHashFromPuzzle(
                model.getPuzzle(),
                model.getSize()
            )
        );
        puzzle.setPosition_hash(
            mappedPuzzleElementHashService.generatePositionHashFromPuzzle(
                model.getPuzzle(),
                model.getSize()
            )
        );
        puzzle.setPuzzle_hash(
            mappedPuzzleElementHashService.generatePuzzleHashFromPuzzle(
                model.getPuzzle(),
                model.getSize()
            )
        );
        
        puzzle.setSlug_id(
            slugService.generateSlugIDFromHash(
                puzzle.getHole_hash(),
                puzzle.getPosition_hash(),
                puzzle.getPuzzle_hash(),
                model.getSize()
            )
        );
        return puzzle.getSlug_id();
    }
}