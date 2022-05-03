package com.thecodeinnovator.sudokuserver.model.access;

import com.thecodeinnovator.sudokuserver.enums.SudokuElementSize1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PuzzleElement1 {
    private int row_index;
    private int column_index;
    private SudokuElementSize1 ijPuzzleElement;
}