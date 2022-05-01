package com.thecodeinnovator.sudokuserver.service.mapping;

import java.util.ArrayList;
import java.util.List;

import com.thecodeinnovator.sudokuserver.model.access.elements.PuzzleElement1;
import com.thecodeinnovator.sudokuserver.model.access.elements.PuzzleElementN;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize1;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSizeN;

import org.springframework.stereotype.Service;

@Service
public class PuzzleElement1MapperService {
    public SudokuElementSize1 getSudokuElementSize1ForSudokuElementSizeN(SudokuElementSizeN element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize1.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize1.ELEMENT_1;
            default:
                return SudokuElementSize1.ELEMENT_0;
        }
    }

    List<PuzzleElement1> getPuzzleElement2List(List<PuzzleElementN> puzzleSegmentationN) {
        List<PuzzleElement1> puzzleSegmentation1 = new ArrayList<PuzzleElement1>();
        for (PuzzleElementN ithPuzzleElementN: puzzleSegmentationN) {
            int rowIndex = ithPuzzleElementN.getRow_index();
            int columnIndex = ithPuzzleElementN.getColumn_index();
            SudokuElementSizeN ithPuzzleElementNEnum = ithPuzzleElementN.getIjPuzzleElement();
            SudokuElementSize1 ithPuzzleElement1Enum = this.getSudokuElementSize1ForSudokuElementSizeN(ithPuzzleElementNEnum);
            PuzzleElement1 ithPuzzleElement1 = new PuzzleElement1();
            ithPuzzleElement1.setRow_index(rowIndex);
            ithPuzzleElement1.setColumn_index(columnIndex);
            ithPuzzleElement1.setIjPuzzleElement(ithPuzzleElement1Enum);
            puzzleSegmentation1.add(ithPuzzleElement1);
        }
        return puzzleSegmentation1;
    }
}
