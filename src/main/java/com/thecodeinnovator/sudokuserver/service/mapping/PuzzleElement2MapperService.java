package com.thecodeinnovator.sudokuserver.service.mapping;

import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize1;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize2;

public class PuzzleElement2MapperService {
    public SudokuElementSize2 getSudokuElementSize3ForSudokuElementSize1(SudokuElementSize1 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize2.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize2.ELEMENT_1;
        }
        return SudokuElementSize2.ELEMENT_0;
    }
}
