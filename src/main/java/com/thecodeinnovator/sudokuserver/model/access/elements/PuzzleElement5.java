package com.thecodeinnovator.sudokuserver.model.access.elements;

import com.thecodeinnovator.sudokuserver.puzzleenum.SudokuElementSize5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PuzzleElement5 {
    private int row_index;
    private int column_index;
    private SudokuElementSize5 ijPuzzleElement;
}