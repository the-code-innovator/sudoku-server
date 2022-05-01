DROP TABLE sudoku.puzzle;

DROP SEQUENCE sudoku.puzzle_sequence;

CREATE SEQUENCE sudoku.puzzle_sequence;

CREATE TABLE sudoku.puzzle (
    "id" VARCHAR(20) NOT NULL DEFAULT NEXTVAL('sudoku.puzzle_sequence') UNIQUE PRIMARY KEY,
    "slug_id" VARCHAR(20) NOT NULL,
    "size" INTEGER NOT NULL,
    "position_hash" BYTEA NOT NULL,
    "hole_hash" BYTEA NOT NULL,
    "puzzle_hash" BYTEA NOT NULL,
    "solved_flag" BOOLEAN NOT NULL,
    "difficulty" INTEGER NOT NULL,
    "solved_on" DATE NOT NULL DEFAULT CURRENT_DATE,
    "solved_by" VARCHAR(80) NOT NULL
);

INSERT INTO sudoku.puzzle (slug_id, size, position_hash, hole_hash, puzzle_hash, solved_flag, difficulty, solved_on, solved_by) VALUES ('abcd', 9, '\x00000000', '\x00000000', '\x00000000', false, 0, TO_DATE('2022-05-04', 'YYYY-MM-DD'), 'aravind');

SELECT * FROM sudoku.puzzle;

DELETE FROM sudoku.puzzle;

GRANT ALL ON SCHEMA sudoku to sudokuapp;