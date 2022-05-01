package com.thecodeinnovator.sudokuserver.service.mapping;

import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize1;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize2;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize3;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize4;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize5;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSizeN;

import java.util.ArrayList;
import java.util.List;

import com.thecodeinnovator.sudokuserver.model.access.elements.PuzzleElement5;
import com.thecodeinnovator.sudokuserver.model.access.elements.PuzzleElementN;

import org.springframework.stereotype.Service;

@Service
public class PuzzleElement5MapperService {
    public SudokuElementSize5 getSudokuElementSize5ForSudokuElementSize1(SudokuElementSize1 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize5.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize5.ELEMENT_1;
            default:
                return SudokuElementSize5.ELEMENT_0;
        }
    }

    public SudokuElementSize5 getSudokuElementSize5ForSudokuElementSize2(SudokuElementSize2 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize5.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize5.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize5.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize5.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize5.ELEMENT_4;
            default:
                return SudokuElementSize5.ELEMENT_0;
        }
    }

    public SudokuElementSize5 getSudokuElementSize5ForSudokuElementSize3(SudokuElementSize3 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize5.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize5.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize5.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize5.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize5.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSize5.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSize5.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSize5.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSize5.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSize5.ELEMENT_9;
            default:
                return SudokuElementSize5.ELEMENT_0;
        }
    }

    public SudokuElementSize5 getSudokuElementSize5ForSudokuElementSize4(SudokuElementSize4 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize5.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize5.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize5.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize5.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize5.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSize5.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSize5.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSize5.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSize5.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSize5.ELEMENT_9;
            case ELEMENT_10:
                return SudokuElementSize5.ELEMENT_10;
            case ELEMENT_11:
                return SudokuElementSize5.ELEMENT_11;
            case ELEMENT_12:
                return SudokuElementSize5.ELEMENT_12;
            case ELEMENT_13:
                return SudokuElementSize5.ELEMENT_13;
            case ELEMENT_14:
                return SudokuElementSize5.ELEMENT_14;
            case ELEMENT_15:
                return SudokuElementSize5.ELEMENT_15;
            case ELEMENT_16:
                return SudokuElementSize5.ELEMENT_16;
            default:
                return SudokuElementSize5.ELEMENT_0;
        }
    }

    public SudokuElementSize5 getSudokuElementSize5ForSudokuElementSizeN(SudokuElementSizeN element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize5.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize5.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize5.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize5.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize5.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSize5.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSize5.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSize5.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSize5.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSize5.ELEMENT_9;
            case ELEMENT_10:
                return SudokuElementSize5.ELEMENT_10;
            case ELEMENT_11:
                return SudokuElementSize5.ELEMENT_11;
            case ELEMENT_12:
                return SudokuElementSize5.ELEMENT_12;
            case ELEMENT_13:
                return SudokuElementSize5.ELEMENT_13;
            case ELEMENT_14:
                return SudokuElementSize5.ELEMENT_14;
            case ELEMENT_15:
                return SudokuElementSize5.ELEMENT_15;
            case ELEMENT_16:
                return SudokuElementSize5.ELEMENT_16;
            case ELEMENT_17:
                return SudokuElementSize5.ELEMENT_17;
            case ELEMENT_18:
                return SudokuElementSize5.ELEMENT_18;
            case ELEMENT_19:
                return SudokuElementSize5.ELEMENT_19;
            case ELEMENT_20:
                return SudokuElementSize5.ELEMENT_20;
            case ELEMENT_21:
                return SudokuElementSize5.ELEMENT_21;
            case ELEMENT_22:
                return SudokuElementSize5.ELEMENT_22;
            case ELEMENT_23:
                return SudokuElementSize5.ELEMENT_23;
            case ELEMENT_24:
                return SudokuElementSize5.ELEMENT_24;
            case ELEMENT_25:
                return SudokuElementSize5.ELEMENT_25;
            default:
                return SudokuElementSize5.ELEMENT_0;
        }
    }

    List<PuzzleElement5> getPuzzleElement5List(List<PuzzleElementN> puzzleSegmentationN) {
        List<PuzzleElement5> puzzleSegmentation5 = new ArrayList<PuzzleElement5>();
        for (PuzzleElementN ithPuzzleElementN: puzzleSegmentationN) {
            int rowIndex = ithPuzzleElementN.getRow_index();
            int columnIndex = ithPuzzleElementN.getColumn_index();
            SudokuElementSizeN ithPuzzleElementNEnum = ithPuzzleElementN.getIjPuzzleElement();
            SudokuElementSize5 ithPuzzleElement5Enum = this.getSudokuElementSize5ForSudokuElementSizeN(ithPuzzleElementNEnum);
            PuzzleElement5 ithPuzzleElement5 = new PuzzleElement5();
            ithPuzzleElement5.setRow_index(rowIndex);
            ithPuzzleElement5.setColumn_index(columnIndex);
            ithPuzzleElement5.setIjPuzzleElement(ithPuzzleElement5Enum);
            puzzleSegmentation5.add(ithPuzzleElement5);
        }
        return puzzleSegmentation5;
    }
}