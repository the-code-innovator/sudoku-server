package com.thecodeinnovator.sudokuserver.model.access;

import com.thecodeinnovator.sudokuserver.enums.SudokuElementSize2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PuzzleElement2 {
    private int row_index;
    private int column_index;
    private SudokuElementSize2 ijPuzzleElement;
}