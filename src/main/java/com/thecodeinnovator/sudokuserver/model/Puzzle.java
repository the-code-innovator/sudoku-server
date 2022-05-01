package com.thecodeinnovator.sudokuserver.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "puzzle")
public class Puzzle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String slug_id;
    private int size;
    private Byte[] position_hash;
    private Byte[] hole_hash;
    private Byte[] puzzle_hash;
    private boolean solved_flag;
    private int difficulty;
    private Date solved_on;
    private String solved_by;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getSlug_id() {
        return slug_id;
    }
    public void setSlug_id(String slug_id) {
        this.slug_id = slug_id;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public Byte[] getPosition_hash() {
        return position_hash;
    }
    public void setPosition_hash(Byte[] position_hash) {
        this.position_hash = position_hash;
    }
    public Byte[] getHole_hash() {
        return hole_hash;
    }
    public void setHole_hash(Byte[] hole_hash) {
        this.hole_hash = hole_hash;
    }
    public Byte[] getPuzzle_hash() {
        return puzzle_hash;
    }
    public void setPuzzle_hash(Byte[] puzzle_hash) {
        this.puzzle_hash = puzzle_hash;
    }
    public boolean isSolved_flag() {
        return solved_flag;
    }
    public void setSolved_flag(boolean solved_flag) {
        this.solved_flag = solved_flag;
    }
    public int getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
    public Date getSolved_on() {
        return solved_on;
    }
    public void setSolved_on(Date solved_on) {
        this.solved_on = solved_on;
    }
    public String getSolved_by() {
        return solved_by;
    }
    public void setSolved_by(String solved_by) {
        this.solved_by = solved_by;
    }   
}