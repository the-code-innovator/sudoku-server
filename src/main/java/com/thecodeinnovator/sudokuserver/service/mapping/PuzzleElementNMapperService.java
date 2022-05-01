package com.thecodeinnovator.sudokuserver.service.mapping;

import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize1;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize2;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize3;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize4;
import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize5;

import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSizeN;

import org.springframework.stereotype.Service;

@Service
public class PuzzleElementNMapperService {
    public SudokuElementSizeN getSudokuElementSizeNForSudokuElementSize1(SudokuElementSize1 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSizeN.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSizeN.ELEMENT_1;
        }
        return SudokuElementSizeN.ELEMENT_0;
    }

    public SudokuElementSizeN gSudokuElementSizeNForSudokuElementSize2(SudokuElementSize2 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSizeN.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSizeN.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSizeN.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSizeN.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSizeN.ELEMENT_4;
        }
        return SudokuElementSizeN.ELEMENT_0;
    }

    public SudokuElementSizeN gSudokuElementSizeNForSudokuElementSize3(SudokuElementSize3 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSizeN.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSizeN.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSizeN.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSizeN.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSizeN.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSizeN.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSizeN.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSizeN.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSizeN.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSizeN.ELEMENT_9;
        }
        return SudokuElementSizeN.ELEMENT_0;
    }

    public SudokuElementSizeN gSudokuElementSizeNForSudokuElementSize4(SudokuElementSize4 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSizeN.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSizeN.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSizeN.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSizeN.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSizeN.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSizeN.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSizeN.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSizeN.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSizeN.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSizeN.ELEMENT_9;
            case ELEMENT_10:
                return SudokuElementSizeN.ELEMENT_10;
            case ELEMENT_11:
                return SudokuElementSizeN.ELEMENT_11;
            case ELEMENT_12:
                return SudokuElementSizeN.ELEMENT_12;
            case ELEMENT_13:
                return SudokuElementSizeN.ELEMENT_13;
            case ELEMENT_14:
                return SudokuElementSizeN.ELEMENT_14;
            case ELEMENT_15:
                return SudokuElementSizeN.ELEMENT_15;
            case ELEMENT_16:
                return SudokuElementSizeN.ELEMENT_16;
        }
        return SudokuElementSizeN.ELEMENT_0;
    }

    public SudokuElementSizeN gSudokuElementSizeNForSudokuElementSize5(SudokuElementSize5 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSizeN.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSizeN.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSizeN.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSizeN.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSizeN.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSizeN.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSizeN.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSizeN.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSizeN.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSizeN.ELEMENT_9;
            case ELEMENT_10:
                return SudokuElementSizeN.ELEMENT_10;
            case ELEMENT_11:
                return SudokuElementSizeN.ELEMENT_11;
            case ELEMENT_12:
                return SudokuElementSizeN.ELEMENT_12;
            case ELEMENT_13:
                return SudokuElementSizeN.ELEMENT_13;
            case ELEMENT_14:
                return SudokuElementSizeN.ELEMENT_14;
            case ELEMENT_15:
                return SudokuElementSizeN.ELEMENT_15;
            case ELEMENT_16:
                return SudokuElementSizeN.ELEMENT_16;
            case ELEMENT_17:
                return SudokuElementSizeN.ELEMENT_17;
            case ELEMENT_18:
                return SudokuElementSizeN.ELEMENT_18;
            case ELEMENT_19:
                return SudokuElementSizeN.ELEMENT_19;
            case ELEMENT_20:
                return SudokuElementSizeN.ELEMENT_20;
            case ELEMENT_21:
                return SudokuElementSizeN.ELEMENT_21;
            case ELEMENT_22:
                return SudokuElementSizeN.ELEMENT_22;
            case ELEMENT_23:
                return SudokuElementSizeN.ELEMENT_23;
            case ELEMENT_24:
                return SudokuElementSizeN.ELEMENT_24;
            case ELEMENT_25:
                return SudokuElementSizeN.ELEMENT_25;
        }
        return SudokuElementSizeN.ELEMENT_0;
    }
}
