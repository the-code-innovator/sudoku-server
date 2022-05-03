package com.thecodeinnovator.sudokuserver.specific.model.db;

import java.util.Date;

import javax.persistence.Column;
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
    @Column(name = "slug_id")
    private String slugId;
    private int size;
    private byte[] positionHash;
    private byte[] holeHash;
    private byte[] puzzleHash;
    private byte[] puzzleData;
    private boolean solvedFlag;
    private int difficulty;
    private Date solvedOn;
    private String solvedBy;
    private Date createdOn;
    private String createdBy;
}