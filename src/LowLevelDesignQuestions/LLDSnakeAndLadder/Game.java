package LowLevelDesignQuestions.LLDSnakeAndLadder;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Dice dice;
    private Deque<Player> playersList = new LinkedList<>();
    Player winner;
    public Game(){
        intializeGame();
    }

    private void intializeGame() {

        board = new Board(9,6,6);
        dice = new Dice(1);
        winner = null;
        // u can also add more players for simplicity we are adding only 2 players
        // also we can make player count dynamic
        addPlayers();
    }

    private void addPlayers(){
        Player player1 = new Player("P1",0);
        Player player2 = new Player("P2",0);
        playersList.add(player1);
        playersList.add(player2);

    }

    public void startGame(){

        while(winner == null){
            Player playerTurn = findPlayerTurn();
            System.out.println("Player Turn : " + playerTurn.id+" Current Position : " + playerTurn.currentPosition);

            // roll the dice
            int diceValue = dice.rollDice();
            int playerNewPosition = playerTurn.currentPosition + diceValue;
            int position = jumpCheck(playerNewPosition);
            playerTurn.currentPosition = position;

            System.out.println("Player turn is : " + playerTurn.id +  " new Position is  : " + playerTurn.currentPosition);

            if(playerNewPosition >= board.cells.length * board.cells.length-1){
                winner = playerTurn;

            }

        }

        System.out.println("Winner is : " + winner.id);
    }

    private Player findPlayerTurn() {
        Player playerTurns = playersList.removeFirst();
        playersList.addLast(playerTurns);
        return playerTurns;
    }


    private int jumpCheck(int playerNewPosition){

        if(playerNewPosition > board.cells.length * board.cells.length-1){
            return playerNewPosition;
        }

        Cell cell = board.getCell(playerNewPosition);

        if(cell.jump != null && cell.jump.start == playerNewPosition){
            String jumpBy = cell.jump.end > cell.jump.start ? "ladder" : "snake";
            System.out.println("Jump done by : "+ jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;
    }

}
