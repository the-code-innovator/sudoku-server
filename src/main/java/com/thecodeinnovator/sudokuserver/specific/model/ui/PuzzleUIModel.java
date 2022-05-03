package com.thecodeinnovator.sudokuserver.specific.model.ui;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PuzzleUIModel {
    private String slugId;
    private String puzzleHash;
    private int[][] puzzleData;
    private Date createdOn;
    private String createdBy;
    private Date solvedOn;
    private String solvedBy;
    private boolean solvedFlag;
    private int difficulty;
    private int size;
}
