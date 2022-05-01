package com.thecodeinnovator.sudokuserver.service.mapping;

import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize1;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize2;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize3;

public class PuzzleElement3MapperService {
    public SudokuElementSize3 getSudokuElementSize3ForSudokuElementSize1(SudokuElementSize1 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize3.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize3.ELEMENT_1;
        }
        return SudokuElementSize3.ELEMENT_0;
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
        }
        return SudokuElementSize3.ELEMENT_0;
    }
}
