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
    "solved_on" DATE,
    "solved_by" VARCHAR(80),
    "created_on" DATE NOT NULL DEFAULT CURRENT_DATE,
    "created_by" VARCHAR(80) NOT NULL
);

INSERT INTO sudoku.puzzle (slug_id, size, position_hash, hole_hash, puzzle_hash, solved_flag, difficulty, created_on, created_by) VALUES ('abcd', 9, '\x00000000', '\x00000000', '\x00000000', false, 0, TO_DATE('2022-05-01 19:48:20.000+05:30', 'yyyy-MM-dd'), 'aravind');

SELECT * FROM sudoku.puzzle;

DELETE FROM sudoku.puzzle;