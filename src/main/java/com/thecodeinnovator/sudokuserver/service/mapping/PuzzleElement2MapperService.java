package com.thecodeinnovator.sudokuserver.service.mapping;

import java.util.ArrayList;
import java.util.List;

import com.thecodeinnovator.sudokuserver.model.access.elements.PuzzleElement2;
import com.thecodeinnovator.sudokuserver.model.access.elements.PuzzleElementN;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize1;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize2;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSizeN;

import org.springframework.stereotype.Service;

@Service
public class PuzzleElement2MapperService {
    public SudokuElementSize2 getSudokuElementSize3ForSudokuElementSize1(SudokuElementSize1 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize2.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize2.ELEMENT_1;
            default:
                return SudokuElementSize2.ELEMENT_0;
        }
    }

    public SudokuElementSize2 getSudokuElementSize2ForSudokuElementSizeN(SudokuElementSizeN element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize2.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize2.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize2.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize2.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize2.ELEMENT_4;
            default:
                return SudokuElementSize2.ELEMENT_0;
        }
    }

    public List<PuzzleElement2> getPuzzleElement2List(List<PuzzleElementN> puzzleSegmentationN) {
        List<PuzzleElement2> puzzleSegmentation2 = new ArrayList<PuzzleElement2>();
        for (PuzzleElementN ithPuzzleElementN: puzzleSegmentationN) {
            int rowIndex = ithPuzzleElementN.getRow_index();
            int columnIndex = ithPuzzleElementN.getColumn_index();
            SudokuElementSizeN ithPuzzleElementNEnum = ithPuzzleElementN.getIjPuzzleElement();
            SudokuElementSize2 ithPuzzleElement2Enum = this.getSudokuElementSize2ForSudokuElementSizeN(ithPuzzleElementNEnum);
            PuzzleElement2 ithPuzzleElement2 = new PuzzleElement2();
            ithPuzzleElement2.setRow_index(rowIndex);
            ithPuzzleElement2.setColumn_index(columnIndex);
            ithPuzzleElement2.setIjPuzzleElement(ithPuzzleElement2Enum);
            puzzleSegmentation2.add(ithPuzzleElement2);
        }
        return puzzleSegmentation2;
    }

    public Byte[] generatePuzzleHashFromPuzzleElement2List(List<PuzzleElement2> puzzleElement2List) {
        return null;
    }

    public Byte[] generatePositionHashFromPuzzleElement2List(List<PuzzleElement2> puzzleElement2List) {
        return null;
    }

    public Byte[] generateHoleHashFromPuzzleElement2List(List<PuzzleElement2> puzzleElement2List) {
        return null;
    }
}
