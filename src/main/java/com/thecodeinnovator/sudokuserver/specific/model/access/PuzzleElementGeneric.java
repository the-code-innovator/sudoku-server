package com.thecodeinnovator.sudokuserver.specific.model.access;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PuzzleElementGeneric <T> {
    private int row_index;
    private int column_index;
    private T ijPuzzleElement;
}
