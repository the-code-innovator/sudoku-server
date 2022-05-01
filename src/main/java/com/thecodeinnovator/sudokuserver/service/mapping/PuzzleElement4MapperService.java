package com.thecodeinnovator.sudokuserver.service.mapping;

import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize1;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize2;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize3;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize4;

import org.springframework.stereotype.Service;

@Service
public class PuzzleElement4MapperService {
    public SudokuElementSize4 getSudokuElementSize4ForSudokuElementSize1(SudokuElementSize1 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize4.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize4.ELEMENT_1;
        }
        return SudokuElementSize4.ELEMENT_0;
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
        }
        return SudokuElementSize4.ELEMENT_0;
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
        }
        return SudokuElementSize4.ELEMENT_0;
    }
}
