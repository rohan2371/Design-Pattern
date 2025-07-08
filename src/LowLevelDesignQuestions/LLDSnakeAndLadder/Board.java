package LowLevelDesignQuestions.LLDSnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell [][] cells;

    Board(int size, int numberOfSnakes, int numberOfLadders){

        initializeCells(size);
        addSnakesAndLadders(numberOfSnakes,numberOfLadders);
    }

    private void initializeCells(int size){
        cells = new Cell[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }

    private void addSnakesAndLadders(int numberOfSnakes, int numberOfLadders){
        // Logic to add snakes and ladders
        // This can be random or predefined based on the game design

        while(numberOfSnakes>0){

            int snakeHead = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);

            // in snake the end should be less than start
            // player should go down once snake bit
            if(snakeTail>= snakeHead){
                continue;
            }

            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;
            Cell cells = getCell(snakeHead);
            cells.jump = snakeObj;
            numberOfSnakes--;
        }

        while (numberOfLadders > 0){
            int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);

            // in ladder the end should be greater than start
            // player should go up once ladder is climbed

            if(ladderEnd<= ladderStart){
                continue;
            }

            Jump ladderObj = new Jump();
            ladderObj.start = ladderStart;
            ladderObj.end = ladderEnd;
            Cell cells = getCell(ladderStart);

            if(cells.jump != null){
                // if there is already a snake or ladder on this cell, skip this ladder
                continue;
            }
            cells.jump = ladderObj;
            numberOfLadders--;

        }



    }

    Cell getCell(int playerPosition){
        int boardRow = playerPosition/cells.length;
        int boardCol = playerPosition%cells.length;

        return cells[boardRow][boardCol];
    }


}
