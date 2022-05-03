package com.thecodeinnovator.sudokuserver.specific.model.request;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavePuzzleRequestModel {
    private int size;
    private int difficulty;
    private String[][] puzzle;
    private Date created_on;
    private String created_by;
}