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
        puzzle.setCreatedBy(
            model.getCreated_by()
        );
        puzzle.setCreatedOn(
            model.getCreated_on()
        );
        puzzle.setSize(
            model.getSize()
        );
        puzzle.setSolvedBy("");
        puzzle.setSolvedFlag(false);

        puzzle.setHoleHash(
            mappedPuzzleElementHashService.generateHoleHashFromPuzzle(
                model.getPuzzle(),
                model.getSize()
            )
        );
        puzzle.setPositionHash(
            mappedPuzzleElementHashService.generatePositionHashFromPuzzle(
                model.getPuzzle(),
                model.getSize()
            )
        );
        puzzle.setPuzzleHash(
            mappedPuzzleElementHashService.generatePuzzleHashFromPuzzle(
                model.getPuzzle(),
                model.getSize()
            )
        );

        puzzle.setPuzzleData(
            mappedPuzzleElementHashService.generatePuzzleDataFromPuzzle(
                model.getPuzzle(),
                model.getSize()
            )
        );

        puzzle.setSlugId(
            slugService.generateSlugIDFromHash(
                puzzle.getPuzzleHash(),
                puzzle.getPositionHash(),
                puzzle.getHoleHash(),
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
        puzzle.setCreatedBy(
            model.getCreated_by()
        );
        puzzle.setCreatedOn(
            model.getCreated_on()
        );
        puzzle.setSize(
            model.getSize()
        );
        puzzle.setSolvedBy("");
        puzzle.setSolvedFlag(false);

        puzzle.setHoleHash(
            mappedPuzzleElementHashService.generateHoleHashFromPuzzle(
                model.getPuzzle(),
                model.getSize()
            )
        );
        puzzle.setPositionHash(
            mappedPuzzleElementHashService.generatePositionHashFromPuzzle(
                model.getPuzzle(),
                model.getSize()
            )
        );
        puzzle.setPuzzleHash(
            mappedPuzzleElementHashService.generatePuzzleHashFromPuzzle(
                model.getPuzzle(),
                model.getSize()
            )
        );
        
        puzzle.setSlugId(
            slugService.generateSlugIDFromHash(
                puzzle.getPuzzleHash(),
                puzzle.getPositionHash(),
                puzzle.getHoleHash(),
                model.getSize()
            )
        );
        return puzzle.getSlugId();
    }

    public Puzzle getPuzzleBySlugID(String slugID) {
        Puzzle puzzle = puzzleRepositoryServiceImpl.findBySlugId(slugID);

        System.out.println(puzzle.toString());

        return puzzle;
    }
}