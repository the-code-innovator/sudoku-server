package com.thecodeinnovator.sudokuserver.service;

import java.util.ArrayList;
import java.util.List;

import com.thecodeinnovator.sudokuserver.model.access.elements.PuzzleElementN;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SlugService {

    @Autowired
    PuzzleElementMappingService puzzleElementMappingService;

    public String generateSlugIDFromHash(Byte[] hole_hash, Byte[] position_hash, Byte[] puzzle_hash) {
        return null;
    }

    public Byte[] generatePuzzleHashFromPuzzle(String[][] puzzle, int size) {
        return null;
    }

    public Byte[] generatePositionHashFromPuzzle(String[][] puzzle, int size) {
        return null;
    }

    public Byte[] generateHoleHashFromPuzzle(String[][] puzzle, int size) {
        return null;
    }

    public List<PuzzleElementN> getPuzzleElementList(String[][] puzzle, int puzzleSize) {
        List<PuzzleElementN> puzzleSegmentation = new ArrayList<PuzzleElementN>();
        int i = 0;
        int j = 0;
        for (String[] ithRow: puzzle) {
            for (String jthColumn: ithRow) {
                PuzzleElementN element = new PuzzleElementN();
                element.setRow_index(i);
                element.setColumn_index(j);
                element.setIjPuzzleElement(puzzleElementMappingService.getMappedPuzzleElementEnum(jthColumn, puzzleSize));
                puzzleSegmentation.add(element);
                j++;
            }
            i++;
        }
        return puzzleSegmentation;
    }
}