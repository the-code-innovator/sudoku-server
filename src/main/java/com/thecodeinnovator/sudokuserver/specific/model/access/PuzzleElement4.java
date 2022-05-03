package com.thecodeinnovator.sudokuserver.specific.model.access;

import com.thecodeinnovator.sudokuserver.enums.SudokuElementSize4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PuzzleElement4 {
    private int row_index;
    private int column_index;
    private SudokuElementSize4 ijPuzzleElement;
}