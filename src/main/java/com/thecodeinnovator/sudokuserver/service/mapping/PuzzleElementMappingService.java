package com.thecodeinnovator.sudokuserver.service.mapping;

import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSizeN;

import org.springframework.stereotype.Service;

@Service
public class PuzzleElementMappingService {

    public SudokuElementSizeN getMappedPuzzleElementEnum(String jthColumn, int size) {
        switch (size) {
            case 1: 
                return this.getMappedPuzzleElementEnumForSize1(jthColumn);
            case 2:
                return this.getMappedPuzzleElementEnumForSize2(jthColumn);
            case 3:
                return this.getMappedPuzzleElementEnumForSize3(jthColumn);
            case 4:
                return this.getMappedPuzzleElementEnumForSize4(jthColumn);
            case 5:
                return this.getMappedPuzzleElementEnumForSize5(jthColumn);
        }
        return SudokuElementSizeN.ELEMENT_0;
    }
    
    private SudokuElementSizeN getMappedPuzzleElementEnumForSize1(String jthColumn) {
        switch (jthColumn) {
            case "0": 
            case "_":
            case "":
                return SudokuElementSizeN.ELEMENT_0;
            case "1":
                return SudokuElementSizeN.ELEMENT_1;
        }
        return SudokuElementSizeN.ELEMENT_0;
    }

    private SudokuElementSizeN getMappedPuzzleElementEnumForSize2(String jthColumn) {
        switch (jthColumn) {
            case "0": 
            case "_":
            case "":
                return SudokuElementSizeN.ELEMENT_0;
            case "1":
                return SudokuElementSizeN.ELEMENT_1;
            case "2":
                return SudokuElementSizeN.ELEMENT_2;
            case "3":
                return SudokuElementSizeN.ELEMENT_3;
            case "4":
                return SudokuElementSizeN.ELEMENT_4;
        }
        return SudokuElementSizeN.ELEMENT_0;
    }

    private SudokuElementSizeN getMappedPuzzleElementEnumForSize3(String jthColumn) {
        switch (jthColumn) {
            case "0": 
            case "_":
            case "":
                return SudokuElementSizeN.ELEMENT_0;
            case "1":
                return SudokuElementSizeN.ELEMENT_1;
            case "2":
                return SudokuElementSizeN.ELEMENT_2;
            case "3":
                return SudokuElementSizeN.ELEMENT_3;
            case "4":
                return SudokuElementSizeN.ELEMENT_4;
            case "5":
                return SudokuElementSizeN.ELEMENT_5;
            case "6":
                return SudokuElementSizeN.ELEMENT_6;
            case "7":
                return SudokuElementSizeN.ELEMENT_7;
            case "8":
                return SudokuElementSizeN.ELEMENT_8;
            case "9":
                return SudokuElementSizeN.ELEMENT_9;
        }
        return SudokuElementSizeN.ELEMENT_0;
    }

    private SudokuElementSizeN getMappedPuzzleElementEnumForSize4(String jthColumn) {
        switch (jthColumn) {
            case "0": 
            case "_":
            case "":
                return SudokuElementSizeN.ELEMENT_0;
            case "1":
                return SudokuElementSizeN.ELEMENT_1;
            case "2":
                return SudokuElementSizeN.ELEMENT_2;
            case "3":
                return SudokuElementSizeN.ELEMENT_3;
            case "4":
                return SudokuElementSizeN.ELEMENT_4;
            case "5":
                return SudokuElementSizeN.ELEMENT_5;
            case "6":
                return SudokuElementSizeN.ELEMENT_6;
            case "7":
                return SudokuElementSizeN.ELEMENT_7;
            case "8":
                return SudokuElementSizeN.ELEMENT_8;
            case "9":
                return SudokuElementSizeN.ELEMENT_9;
            case "10":
                return SudokuElementSizeN.ELEMENT_10;
            case "11":
                return SudokuElementSizeN.ELEMENT_11;
            case "12":
                return SudokuElementSizeN.ELEMENT_12;
            case "13":
                return SudokuElementSizeN.ELEMENT_13;
            case "14":
                return SudokuElementSizeN.ELEMENT_14;
            case "15":
                return SudokuElementSizeN.ELEMENT_15;
            case "16":
                return SudokuElementSizeN.ELEMENT_16;
        }
        return SudokuElementSizeN.ELEMENT_0;
    }

    private SudokuElementSizeN getMappedPuzzleElementEnumForSize5(String jthColumn) {
        switch (jthColumn) {
            case "0": 
            case "_":
            case "":
                return SudokuElementSizeN.ELEMENT_0;
            case "1":
                return SudokuElementSizeN.ELEMENT_1;
            case "2":
                return SudokuElementSizeN.ELEMENT_2;
            case "3":
                return SudokuElementSizeN.ELEMENT_3;
            case "4":
                return SudokuElementSizeN.ELEMENT_4;
            case "5":
                return SudokuElementSizeN.ELEMENT_5;
            case "6":
                return SudokuElementSizeN.ELEMENT_6;
            case "7":
                return SudokuElementSizeN.ELEMENT_7;
            case "8":
                return SudokuElementSizeN.ELEMENT_8;
            case "9":
                return SudokuElementSizeN.ELEMENT_9;
            case "10":
                return SudokuElementSizeN.ELEMENT_10;
            case "11":
                return SudokuElementSizeN.ELEMENT_11;
            case "12":
                return SudokuElementSizeN.ELEMENT_12;
            case "13":
                return SudokuElementSizeN.ELEMENT_13;
            case "14":
                return SudokuElementSizeN.ELEMENT_14;
            case "15":
                return SudokuElementSizeN.ELEMENT_15;
            case "16":
                return SudokuElementSizeN.ELEMENT_16;
            case "17":
                return SudokuElementSizeN.ELEMENT_17;
            case "18":
                return SudokuElementSizeN.ELEMENT_18;
            case "19":
                return SudokuElementSizeN.ELEMENT_19;
            case "20":
                return SudokuElementSizeN.ELEMENT_20;
            case "21":
                return SudokuElementSizeN.ELEMENT_21;
            case "22":
                return SudokuElementSizeN.ELEMENT_22;
            case "23":
                return SudokuElementSizeN.ELEMENT_23;
            case "24":
                return SudokuElementSizeN.ELEMENT_24;
            case "25":
                return SudokuElementSizeN.ELEMENT_25;
        }
        return SudokuElementSizeN.ELEMENT_0;
    }

    

}
