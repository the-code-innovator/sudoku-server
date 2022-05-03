package com.thecodeinnovator.sudokuserver.service;

import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.List;
import java.util.Optional;

import com.thecodeinnovator.sudokuserver.model.db.Puzzle;
import com.thecodeinnovator.sudokuserver.model.request.SavePuzzleRequestModel;
import com.thecodeinnovator.sudokuserver.model.ui.PuzzleUIModel;

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

    public PuzzleUIModel getPuzzleBySlugID(String slugID) {
        Puzzle puzzle = puzzleRepositoryServiceImpl.findBySlugId(slugID);

        byte[] puzzleData = puzzle.getPuzzleData();
        int items = puzzleData.length / 3;
        int size = puzzle.getSize();
        int rowLength = size * size;

        int[][] puzzleDataInt = new int[rowLength][rowLength];
        for (int i = 0; i < items; i++) {
            int rowIndex = puzzleData[(i * 3) + 0];
            int columnIndex = puzzleData[(i * 3) + 1];
            int data = puzzleData[(i * 3) + 2];
            puzzleDataInt[rowIndex][columnIndex] = data;
        }

        String puzzleHashString = this.byteArray2Hex(puzzle.getPuzzleHash());

        PuzzleUIModel model = new PuzzleUIModel();
        model.setCreatedBy(puzzle.getCreatedBy());
        model.setCreatedOn(puzzle.getCreatedOn());
        model.setDifficulty(puzzle.getDifficulty());
        
        model.setPuzzleData(puzzleDataInt);
        
        model.setPuzzleHash(puzzleHashString);
        model.setSize(puzzle.getSize());
        model.setSlugId(puzzle.getSlugId());
        model.setSolvedBy(puzzle.getSolvedBy());
        model.setSolvedOn(puzzle.getSolvedOn());
        model.setSolvedFlag(puzzle.isSolvedFlag());

        return model;
    }

    private String byteArray2Hex(byte[] hash) {
        try (Formatter formatter = new Formatter()) {
            for (byte b : hash) {
                formatter.format("%02x", b);
            }
            return formatter.toString();
        }
    }
}