package com.thecodeinnovator.sudokuserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import com.thecodeinnovator.sudokuserver.model.access.elements.PuzzleElementN;
import com.thecodeinnovator.sudokuserver.service.mapping.PuzzleElement1MapperService;
import com.thecodeinnovator.sudokuserver.service.mapping.PuzzleElement2MapperService;
import com.thecodeinnovator.sudokuserver.service.mapping.PuzzleElement3MapperService;
import com.thecodeinnovator.sudokuserver.service.mapping.PuzzleElement4MapperService;
import com.thecodeinnovator.sudokuserver.service.mapping.PuzzleElement5MapperService;
import com.thecodeinnovator.sudokuserver.service.mapping.PuzzleElementNMapperService;

@Service
public class MappedPuzzleElementHashService {
    
    @Autowired
    PuzzleElementMappingService puzzleElementMappingService;

    @Autowired
    PuzzleElement1MapperService puzzleElement1MapperService;

    @Autowired
    PuzzleElement2MapperService puzzleElement2MapperService;

    @Autowired
    PuzzleElement3MapperService puzzleElement3MapperService;

    @Autowired
    PuzzleElement4MapperService puzzleElement4MapperService;

    @Autowired
    PuzzleElement5MapperService puzzleElement5MapperService;

    @Autowired
    PuzzleElementNMapperService puzzleElementNMapperService;

    public byte[] generatePuzzleHashFromPuzzle(String[][] puzzle, int size) throws NoSuchAlgorithmException {
        switch (size) {
            case 1:
                return puzzleElement1MapperService.generatePuzzleHashFromPuzzleElement1List(
                    puzzleElement1MapperService.getPuzzleElement1List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 2:
                return puzzleElement2MapperService.generatePuzzleHashFromPuzzleElement2List(
                    puzzleElement2MapperService.getPuzzleElement2List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 3:
                return puzzleElement3MapperService.generatePuzzleHashFromPuzzleElement3List(
                    puzzleElement3MapperService.getPuzzleElement3List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 4:
                return puzzleElement4MapperService.generatePuzzleHashFromPuzzleElement4List(
                    puzzleElement4MapperService.getPuzzleElement4List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 5:
                return puzzleElement5MapperService.generatePuzzleHashFromPuzzleElement5List(
                    puzzleElement5MapperService.getPuzzleElement5List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
        }
        return new byte[1];
    }

    public byte[] generatePositionHashFromPuzzle(String[][] puzzle, int size) throws NoSuchAlgorithmException {
        switch (size) {
            case 1:
                return puzzleElement1MapperService.generatePositionHashFromPuzzleElement1List(
                    puzzleElement1MapperService.getPuzzleElement1List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 2:
                return puzzleElement2MapperService.generatePositionHashFromPuzzleElement2List(
                    puzzleElement2MapperService.getPuzzleElement2List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 3:
                return puzzleElement3MapperService.generatePositionHashFromPuzzleElement3List(
                    puzzleElement3MapperService.getPuzzleElement3List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 4:
                return puzzleElement4MapperService.generatePositionHashFromPuzzleElement4List(
                    puzzleElement4MapperService.getPuzzleElement4List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 5:
                return puzzleElement5MapperService.generatePositionHashFromPuzzleElement5List(
                    puzzleElement5MapperService.getPuzzleElement5List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
        }
        return new byte[1];
    }

    public byte[] generateHoleHashFromPuzzle(String[][] puzzle, int size) throws NoSuchAlgorithmException {
        switch (size) {
            case 1:
                return puzzleElement1MapperService.generateHoleHashFromPuzzleElement1List(
                    puzzleElement1MapperService.getPuzzleElement1List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 2:
                return puzzleElement2MapperService.generateHoleHashFromPuzzleElement2List(
                    puzzleElement2MapperService.getPuzzleElement2List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 3:
                return puzzleElement3MapperService.generateHoleHashFromPuzzleElement3List(
                    puzzleElement3MapperService.getPuzzleElement3List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 4:
                return puzzleElement4MapperService.generateHoleHashFromPuzzleElement4List(
                    puzzleElement4MapperService.getPuzzleElement4List(
                        this.getPuzzleElementList(puzzle, size)   
                    )
                );
            case 5:
                return puzzleElement5MapperService.generateHoleHashFromPuzzleElement5List(
                    puzzleElement5MapperService.getPuzzleElement5List(
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
}
