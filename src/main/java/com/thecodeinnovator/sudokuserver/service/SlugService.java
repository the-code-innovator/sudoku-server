package com.thecodeinnovator.sudokuserver.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.thecodeinnovator.sudokuserver.model.access.PuzzleElement;
import com.thecodeinnovator.sudokuserver.service.mapping.PuzzleElementMappingService;


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

    public List<PuzzleElement> getPuzzleElementList(String[][] puzzle, int puzzleSize) {
        List<PuzzleElement> puzzleSegmentation = new ArrayList<PuzzleElement>();
        int i = 0;
        int j = 0;
        for (String[] ithRow: puzzle) {
            for (String jthColumn: ithRow) {
                PuzzleElement element = new PuzzleElement();
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