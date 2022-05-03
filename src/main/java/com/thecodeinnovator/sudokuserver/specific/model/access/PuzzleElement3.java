package com.thecodeinnovator.sudokuserver.specific.model.access;

import com.thecodeinnovator.sudokuserver.enums.SudokuElementSize3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PuzzleElement3 {
    private int row_index;
    private int column_index;
    private SudokuElementSize3 ijPuzzleElement;
}