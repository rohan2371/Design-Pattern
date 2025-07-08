package LowLevelDesignQuestions.LLDTicTacToe;

import LowLevelDesignQuestions.LLDTicTacToe.Model.*;
import LowLevelDesignQuestions.LLDTicTacToe.util.Pair;

import javax.swing.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    public Deque<Player> players;
    Board gameBboard;

    TicTacToeGame(){
        initialzeGame();
    }

    public void initialzeGame(){

        // creating 2 players
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player 1",crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player 2",noughtsPiece);

        players.add(player1);
        players.add(player2);

        gameBboard = new Board(3); // 3x3 board for Tic Tac Toe
    }

    public String startGame(){
        boolean noWinner = true;

        while (noWinner){

            // take out the player whose turn is and also put the player in the list back;
            Player playerTurn = players.removeFirst(); // Get the player whose turn it is

            // Print the current board
            gameBboard.printBoard();

            // get the free space from the board
            List<Pair<Integer,Integer>> freeCells = gameBboard.getFreeCells();
            if(freeCells.isEmpty()){
                noWinner = false;
                continue;
            }

            // read the user input
            System.out.print("Player : " + playerTurn.name + " Enter the row and column: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);

            // place the piece on the board
            boolean pieceAddedSuccessfully = gameBboard.addPiece(inputRow,inputCol,playerTurn.playingPiece);
            if(!pieceAddedSuccessfully){
                System.out.println("Cell is already occupied,Incorrect position , please try again.");
                players.addFirst(playerTurn);
                continue;
            }

            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputCol, playerTurn.playingPiece.pieceType);
            if(winner){
                return playerTurn.name + " is the winner!";
            }

        }

        return "tie";
    }

    boolean isThereWinner(int row, int col , PieceType pieceType){
        boolean rowCheck = true;
        boolean colCheck = true;
        boolean diagonalCheck = true;
        boolean antiDiagonalCheck = true;


        // Check the row
        for(int i=0;i<gameBboard.size;i++){
            if(gameBboard.board[row][i] == null || gameBboard.board[row][i].pieceType != pieceType){
                rowCheck = false;
                break;
            }
        }

        // Check the column
        for(int i=0;i<gameBboard.size;i++){
            if(gameBboard.board[i][col] == null || gameBboard.board[i][col].pieceType != pieceType){
                colCheck = false;
                break;
            }
        }

        // Check the diagonal
        for(int i=0;i<gameBboard.size;i++){
            if(gameBboard.board[i][i] == null || gameBboard.board[i][i].pieceType != pieceType){
                diagonalCheck = false;
                break;
            }
        }
        // Check the anti-diagonal
        for(int i=0;i<gameBboard.size;i++){
            if(gameBboard.board[i][gameBboard.size - 1 - i] == null || gameBboard.board[i][gameBboard.size - 1 - i].pieceType != pieceType){
                antiDiagonalCheck = false;
                break;
            }
        }

        return rowCheck || colCheck || diagonalCheck || antiDiagonalCheck;
    }

}
