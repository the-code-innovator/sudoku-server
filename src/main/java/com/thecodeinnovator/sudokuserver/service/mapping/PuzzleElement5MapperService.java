package com.thecodeinnovator.sudokuserver.service.mapping;

import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize1;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize2;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize3;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize4;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize5;

import org.springframework.stereotype.Service;

@Service
public class PuzzleElement5MapperService {
    public SudokuElementSize5 getSudokuElementSize5ForSudokuElementSize1(SudokuElementSize1 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize5.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize5.ELEMENT_1;
        }
        return SudokuElementSize5.ELEMENT_0;
    }

    public SudokuElementSize5 gSudokuElementSize5ForSudokuElementSize2(SudokuElementSize2 element) {
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
        }
        return SudokuElementSize5.ELEMENT_0;
    }

    public SudokuElementSize5 gSudokuElementSize5ForSudokuElementSize3(SudokuElementSize3 element) {
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
        }
        return SudokuElementSize5.ELEMENT_0;
    }

    public SudokuElementSize5 gSudokuElementSize5ForSudokuElementSize4(SudokuElementSize4 element) {
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
        }
        return SudokuElementSize5.ELEMENT_0;
    }
}