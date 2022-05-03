package com.thecodeinnovator.sudokuserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import com.thecodeinnovator.sudokuserver.model.access.PuzzleElementN;
import com.thecodeinnovator.sudokuserver.service.mapping.PuzzleElementNMapperService;
import com.thecodeinnovator.sudokuserver.service.mapping.PuzzleElementUtilityService;

@Service
public class MappedPuzzleElementHashService {
    
    @Autowired
    PuzzleElementMappingService puzzleElementMappingService;

    @Autowired
    PuzzleElementUtilityService puzzleElementUtilityService;

    @Autowired
    PuzzleElementNMapperService puzzleElementNMapperService;

    public byte[] generatePuzzleHashFromPuzzle(String[][] puzzle, int size) throws NoSuchAlgorithmException {
        switch (size) {
            case 1:
                return puzzleElementUtilityService.generatePuzzleHashFromPuzzleElement1List(
                    puzzleElementUtilityService.getPuzzleElement1List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 2:
                return puzzleElementUtilityService.generatePuzzleHashFromPuzzleElement2List(
                    puzzleElementUtilityService.getPuzzleElement2List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 3:
                return puzzleElementUtilityService.generatePuzzleHashFromPuzzleElement3List(
                    puzzleElementUtilityService.getPuzzleElement3List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 4:
                return puzzleElementUtilityService.generatePuzzleHashFromPuzzleElement4List(
                    puzzleElementUtilityService.getPuzzleElement4List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 5:
                return puzzleElementUtilityService.generatePuzzleHashFromPuzzleElement5List(
                    puzzleElementUtilityService.getPuzzleElement5List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
        }
        return new byte[1];
    }

    public byte[] generatePositionHashFromPuzzle(String[][] puzzle, int size) throws NoSuchAlgorithmException {
        switch (size) {
            case 1:
                return puzzleElementUtilityService.generatePositionHashFromPuzzleElement1List(
                    puzzleElementUtilityService.getPuzzleElement1List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 2:
                return puzzleElementUtilityService.generatePositionHashFromPuzzleElement2List(
                    puzzleElementUtilityService.getPuzzleElement2List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 3:
                return puzzleElementUtilityService.generatePositionHashFromPuzzleElement3List(
                    puzzleElementUtilityService.getPuzzleElement3List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 4:
                return puzzleElementUtilityService.generatePositionHashFromPuzzleElement4List(
                    puzzleElementUtilityService.getPuzzleElement4List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 5:
                return puzzleElementUtilityService.generatePositionHashFromPuzzleElement5List(
                    puzzleElementUtilityService.getPuzzleElement5List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
        }
        return new byte[1];
    }

    public byte[] generateHoleHashFromPuzzle(String[][] puzzle, int size) throws NoSuchAlgorithmException {
        switch (size) {
            case 1:
                return puzzleElementUtilityService.generateHoleHashFromPuzzleElement1List(
                    puzzleElementUtilityService.getPuzzleElement1List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 2:
                return puzzleElementUtilityService.generateHoleHashFromPuzzleElement2List(
                    puzzleElementUtilityService.getPuzzleElement2List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 3:
                return puzzleElementUtilityService.generateHoleHashFromPuzzleElement3List(
                    puzzleElementUtilityService.getPuzzleElement3List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 4:
                return puzzleElementUtilityService.generateHoleHashFromPuzzleElement4List(
                    puzzleElementUtilityService.getPuzzleElement4List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 5:
                return puzzleElementUtilityService.generateHoleHashFromPuzzleElement5List(
                    puzzleElementUtilityService.getPuzzleElement5List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
        }
        return new byte[1];
    }

    public List<PuzzleElementN> getPuzzleElementList(String[][] puzzle, int puzzleSize) {
        List<PuzzleElementN> puzzleSegmentation = new ArrayList<PuzzleElementN>();
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[0].length; j++) {
                PuzzleElementN element = new PuzzleElementN();
                element.setRow_index(i);
                element.setColumn_index(j);
                element.setIjPuzzleElement(puzzleElementMappingService.getMappedPuzzleElementEnum(puzzle[i][j], puzzleSize));
                puzzleSegmentation.add(element);
            }
        }
        return puzzleSegmentation;
    }

    public byte[] generatePuzzleDataFromPuzzle(String[][] puzzle, int size) {
        switch (size) {
            case 1:
                return puzzleElementUtilityService.generatePuzzleDataFromPuzzleElement1List(
                    puzzleElementUtilityService.getPuzzleElement1List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 2:
                return puzzleElementUtilityService.generatePuzzleDataFromPuzzleElement2List(
                    puzzleElementUtilityService.getPuzzleElement2List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 3:
                return puzzleElementUtilityService.generatePuzzleDataFromPuzzleElement3List(
                    puzzleElementUtilityService.getPuzzleElement3List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 4:
                return puzzleElementUtilityService.generatePuzzleDataFromPuzzleElement4List(
                    puzzleElementUtilityService.getPuzzleElement4List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 5:
                return puzzleElementUtilityService.generatePuzzleDataFromPuzzleElement5List(
                    puzzleElementUtilityService.getPuzzleElement5List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
        }
        return new byte[1];
    }
}
