package com.thecodeinnovator.sudokuserver.model.db;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "puzzle")
@Getter
@Setter
public class Puzzle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String slug_id;
    private int size;
    private byte[] position_hash;
    private byte[] hole_hash;
    private byte[] puzzle_hash;
    private boolean solved_flag;
    private int difficulty;
    private Date solved_on;
    private String solved_by;
    private Date created_on;
    private String created_by;
}