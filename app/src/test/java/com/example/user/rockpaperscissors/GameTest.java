package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 09/11/2016.
 */

public class GameTest {

    Game game;
    ArrayList<String> TestMoves;


    @Before
    public void before() {
        TestMoves = new ArrayList<String>();
        TestMoves.add("Rock");
        TestMoves.add("Paper");
        TestMoves.add("Scissors");


    }

    @Test
    public void canGetMove() {
        Game game = new Game();
        assertEquals("Rock", game.getMove());
    }

    @Test
    public void createComputerMovesWithList() {
        assertEquals(3, TestMoves.size());
    }

    @Test
    public void gameBeingPlayed(){
        Game game = new Game ();
        assertEquals("YOU WIN!", game.playGame("Rock"));
    }
}