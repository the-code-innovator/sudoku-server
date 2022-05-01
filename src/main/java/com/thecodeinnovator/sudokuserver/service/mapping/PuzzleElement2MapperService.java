package com.thecodeinnovator.sudokuserver.service.mapping;

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
}
