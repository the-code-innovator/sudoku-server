package com.thecodeinnovator.sudokuserver.service.mapping;

import java.util.ArrayList;
import java.util.List;

import com.thecodeinnovator.sudokuserver.model.access.elements.PuzzleElement3;
import com.thecodeinnovator.sudokuserver.model.access.elements.PuzzleElementN;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize1;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize2;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize3;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSizeN;

import org.springframework.stereotype.Service;

@Service
public class PuzzleElement3MapperService {
    public SudokuElementSize3 getSudokuElementSize3ForSudokuElementSize1(SudokuElementSize1 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize3.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize3.ELEMENT_1;
            default:
                return SudokuElementSize3.ELEMENT_0;
        }
    }

    public SudokuElementSize3 gSudokuElementSize3ForSudokuElementSize2(SudokuElementSize2 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize3.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize3.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize3.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize3.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize3.ELEMENT_4;
            default:
                return SudokuElementSize3.ELEMENT_0;
        }
    }

    public SudokuElementSize3 getSudokuElementSize3ForSudokuElementSizeN(SudokuElementSizeN element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize3.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize3.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize3.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize3.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize3.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSize3.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSize3.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSize3.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSize3.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSize3.ELEMENT_9;
            default:
                return SudokuElementSize3.ELEMENT_0;
        }
    }

    public int getIntegerRepresentationForSudokuElementsSize3(SudokuElementSize3 element) {
        switch (element) {
            case ELEMENT_0:
                return 0;
            case ELEMENT_1:
                return 1;
            case ELEMENT_2:
                return 2;
            case ELEMENT_3:
                return 3;
            case ELEMENT_4:
                return 4;
            case ELEMENT_5:
                return 5;
            case ELEMENT_6:
                return 6;
            case ELEMENT_7:
                return 7;
            case ELEMENT_8:
                return 8;
            case ELEMENT_9:
                return 9;
            default:
                return 0;
        }
    }

    public List<PuzzleElement3> getPuzzleElement3List(List<PuzzleElementN> puzzleSegmentationN) {
        List<PuzzleElement3> puzzleSegmentation3 = new ArrayList<PuzzleElement3>();
        for (PuzzleElementN ithPuzzleElementN: puzzleSegmentationN) {
            int rowIndex = ithPuzzleElementN.getRow_index();
            int columnIndex = ithPuzzleElementN.getColumn_index();
            SudokuElementSizeN ithPuzzleElementNEnum = ithPuzzleElementN.getIjPuzzleElement();
            SudokuElementSize3 ithPuzzleElement3Enum = this.getSudokuElementSize3ForSudokuElementSizeN(ithPuzzleElementNEnum);
            PuzzleElement3 ithPuzzleElement3 = new PuzzleElement3();
            ithPuzzleElement3.setRow_index(rowIndex);
            ithPuzzleElement3.setColumn_index(columnIndex);
            ithPuzzleElement3.setIjPuzzleElement(ithPuzzleElement3Enum);
            puzzleSegmentation3.add(ithPuzzleElement3);
        }
        return puzzleSegmentation3;
    }

    public Byte[] generatePuzzleHashFromPuzzleElement3List(List<PuzzleElement3> puzzleElement3List) {
        return null;
    }

    public Byte[] generatePositionHashFromPuzzleElement3List(List<PuzzleElement3> puzzleElement3List) {
        return null;
    }

    public Byte[] generateHoleHashFromPuzzleElement3List(List<PuzzleElement3> puzzleElement3List) {
        return null;
    }
}
