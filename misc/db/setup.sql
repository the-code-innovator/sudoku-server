DROP TABLE sudoku.puzzle;

DROP SEQUENCE sudoku.puzzle_sequence;

CREATE SEQUENCE sudoku.puzzle_sequence;

CREATE TABLE sudoku.puzzle (
    "id" VARCHAR(20) NOT NULL DEFAULT NEXTVAL('sudoku.puzzle_sequence') UNIQUE PRIMARY KEY,
    "slug_id" VARCHAR(40) NOT NULL UNIQUE,
    "size" INTEGER NOT NULL,
    "position_hash" BYTEA NOT NULL,
    "hole_hash" BYTEA NOT NULL,
    "puzzle_hash" BYTEA NOT NULL,
    "puzzle_data" BYTEA NOT NULL,
    "solved_flag" BOOLEAN NOT NULL,
    "difficulty" INTEGER NOT NULL,
    "solved_on" DATE,
    "solved_by" VARCHAR(80),
    "created_on" DATE NOT NULL DEFAULT CURRENT_DATE,
    "created_by" VARCHAR(80) NOT NULL
);

SELECT * FROM sudoku.puzzle;

DELETE FROM sudoku.puzzle;