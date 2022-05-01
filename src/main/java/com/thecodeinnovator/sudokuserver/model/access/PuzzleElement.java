package com.thecodeinnovator.sudokuserver.model.access;

import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSizeN;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PuzzleElement {
    private int row_index;
    private int column_index;
    private SudokuElementSizeN ijPuzzleElement;
}
