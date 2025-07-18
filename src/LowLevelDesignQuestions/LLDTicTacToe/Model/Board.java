package LowLevelDesignQuestions.LLDTicTacToe.Model;

import LowLevelDesignQuestions.LLDTicTacToe.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {

    public int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }


    public boolean addPiece(int row, int col, PlayingPiece playingPiece){
        if(board[row][col] != null){
            return false ; // Cell is already occupied
        }
        board[row][col] = playingPiece;
        return true;
    }

    public List<Pair<Integer,Integer>> getFreeCells(){
            List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    if(board[i][j] == null){
                        Pair<Integer,Integer> rowColumn = new Pair<>(i,j);
                        freeCells.add(rowColumn);
                    }
                }
            }

            return freeCells;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print(" . ");
                } else {
                    System.out.print(" " + board[i][j].pieceType + " ");
                }
            }
            System.out.println();
        }
    }
}
