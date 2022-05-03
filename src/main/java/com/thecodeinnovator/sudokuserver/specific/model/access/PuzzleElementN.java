package com.thecodeinnovator.sudokuserver.specific.model.access;

import com.thecodeinnovator.sudokuserver.enums.SudokuElementSizeN;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PuzzleElementN {
    private int row_index;
    private int column_index;
    private SudokuElementSizeN ijPuzzleElement;
}
