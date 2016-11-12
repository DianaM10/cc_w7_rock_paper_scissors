package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 09/11/2016.
 */

public class Game {

    private String move;
    protected ArrayList<String> mComputerMove;

    public Game() {
        mComputerMove = new ArrayList<String>();
        setUpComputerMoves();
    }

    public void setUpComputerMoves() {
        String[] moves = {
                "Rock",
                "Paper",
                "Scissors"
        };
        for (String move : moves) {
            add(move);
        }
    }

    public void add(String newMove) {
        mComputerMove.add(newMove);
    }

    public String getMove() {
        return this.move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String computerMove() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(3);
        String randomMove = mComputerMove.get(randomIndex);

        return randomMove;

    }


    public String playGame(String move) {
        setMove(move);
        String turn = this.computerMove();
        if (move.equals(turn) )
        {
            return "DRAW!";
        }

        switch (move) {
            case "Rock":
                return winChecker("Rock", turn);
            //break;
            case "Scissors":
                return winChecker("Scissors", turn);
            //break;
            case "Paper":
                return winChecker("Paper", turn);
            //break;
            //return "LOSER!";
            //break;
            default:
                return "What are you doing, stop breaking our game!";
        }
    }


    public String winChecker(String playerMove, String computerMove) {
        if (playerMove == "Rock" && computerMove == "Scissors" ||
                playerMove == "Paper" && computerMove == "Rock" ||
                playerMove == "Scissors" && computerMove == "Paper") {
            return "YOU WIN!";
        }
        else {
            return "LOSER!";

        }
    }
}


//        if (this.move == "Rock" && turn == "Scissors") {
//            return "YOU WIN!";
//        }
//        if (this.move == "Rock" && turn == "Rock") {
//            return "DRAW!";
//        }
//        if (this.move == "Rock" && turn == "Paper") {
//            return "LOSER!";
//        }
//        if (this.move == "Scissors" && turn == "Paper") {
//            return "YOU WIN!";
//        }
//        if (this.move == "Scissors" && turn == "Scissors") {
//            return "DRAW!";
//        }
//        if (this.move == "Scissors" && turn == "Rock") {
//            return "LOSER!";
//        }
//        if (this.move == "Paper" && turn == "Rock") {
//            return "YOU WIN!";
//        }
//        if (this.move == "Paper" && turn == "Paper") {
//            return "DRAW!";
//        }
//        if (this.move == "Paper" && turn == "Scissors") {
//            return "LOSER!";
//        }
//        else return "What are you doing, stop breaking our game!";
//    }
//}