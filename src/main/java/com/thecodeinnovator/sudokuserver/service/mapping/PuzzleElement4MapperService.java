package com.thecodeinnovator.sudokuserver.service.mapping;

import java.util.ArrayList;
import java.util.List;

import com.thecodeinnovator.sudokuserver.model.access.elements.PuzzleElement4;
import com.thecodeinnovator.sudokuserver.model.access.elements.PuzzleElementN;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize1;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize2;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize3;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize4;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSizeN;

import org.springframework.stereotype.Service;

@Service
public class PuzzleElement4MapperService {
    public SudokuElementSize4 getSudokuElementSize4ForSudokuElementSize1(SudokuElementSize1 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize4.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize4.ELEMENT_1;
            default:
                return SudokuElementSize4.ELEMENT_0;
        }
    }

    public SudokuElementSize4 gSudokuElementSize4ForSudokuElementSize2(SudokuElementSize2 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize4.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize4.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize4.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize4.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize4.ELEMENT_4;
            default:
                return SudokuElementSize4.ELEMENT_0;
        }
    }

    public SudokuElementSize4 gSudokuElementSize4ForSudokuElementSize3(SudokuElementSize3 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize4.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize4.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize4.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize4.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize4.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSize4.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSize4.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSize4.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSize4.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSize4.ELEMENT_9;
            default:
                return SudokuElementSize4.ELEMENT_0;
        }
    }

    public SudokuElementSize4 getSudokuElementSize4ForSudokuElementSizeN(SudokuElementSizeN element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize4.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize4.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize4.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize4.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize4.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSize4.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSize4.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSize4.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSize4.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSize4.ELEMENT_9;
            case ELEMENT_10:
                return SudokuElementSize4.ELEMENT_10;
            case ELEMENT_11:
                return SudokuElementSize4.ELEMENT_11;
            case ELEMENT_12:
                return SudokuElementSize4.ELEMENT_12;
            case ELEMENT_13:
                return SudokuElementSize4.ELEMENT_13;
            case ELEMENT_14:
                return SudokuElementSize4.ELEMENT_14;
            case ELEMENT_15:
                return SudokuElementSize4.ELEMENT_15;
            case ELEMENT_16:
                return SudokuElementSize4.ELEMENT_16;
            default:
                return SudokuElementSize4.ELEMENT_0;  
        }
    }

    public List<PuzzleElement4> getPuzzleElement4List(List<PuzzleElementN> puzzleSegmentationN) {
        List<PuzzleElement4> puzzleSegmentation4 = new ArrayList<PuzzleElement4>();
        for (PuzzleElementN ithPuzzleElementN: puzzleSegmentationN) {
            int rowIndex = ithPuzzleElementN.getRow_index();
            int columnIndex = ithPuzzleElementN.getColumn_index();
            SudokuElementSizeN ithPuzzleElementNEnum = ithPuzzleElementN.getIjPuzzleElement();
            SudokuElementSize4 ithPuzzleElement4Enum = this.getSudokuElementSize4ForSudokuElementSizeN(ithPuzzleElementNEnum);
            PuzzleElement4 ithPuzzleElement4 = new PuzzleElement4();
            ithPuzzleElement4.setRow_index(rowIndex);
            ithPuzzleElement4.setColumn_index(columnIndex);
            ithPuzzleElement4.setIjPuzzleElement(ithPuzzleElement4Enum);
            puzzleSegmentation4.add(ithPuzzleElement4);
        }
        return puzzleSegmentation4;
    }

    public Byte[] generatePuzzleHashFromPuzzleElement4List(List<PuzzleElement4> puzzleElement4List) {
        return null;
    }

    public Byte[] generatePositionHashFromPuzzleElement4List(List<PuzzleElement4> puzzleElement4List) {
        return null;
    }

    public Byte[] generateHoleHashFromPuzzleElement4List(List<PuzzleElement4> puzzleElement4List) {
        return null;
    }
}
