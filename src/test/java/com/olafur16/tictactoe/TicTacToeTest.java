package com.olafur16.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest{


	@Test
	public void testfillBoard() throws Exception{
		TicTacToe game = new TicTacToe();
		assertEquals('1', game.charAt(0, 0));
		assertEquals('4', game.charAt(1, 0));
		assertEquals('9', game.charAt(2, 2));
	}

	@Test
	public void testSwitchPlayer() throws Exception {
		TicTacToe game = new TicTacToe();
		assertEquals('X', game.switchPlayer('O'));
		assertEquals('O', game.switchPlayer('X'));

	}

	@Test
	public void testMakeMove() throws Exception {
		TicTacToe game = new TicTacToe();

		game.makeMove('1');
		game.makeMove('5');
		game.makeMove('9');

		assertEquals('X', game.charAt(0,0));
		assertEquals('O', game.charAt(1,1));
		assertEquals('X', game.charAt(2,2));

	}

	@Test
	public void testCharAt() throws Exception {
		TicTacToe game = new TicTacToe();

		game.makeMove('1');
		game.makeMove('3');
		game.makeMove('6');

	    assertEquals('X', game.charAt(0,0));
		assertEquals('O', game.charAt(0,2));
		assertEquals('X', game.charAt(1,2));
	}

	@Test
	public void checkWinner() throws Exception{
		TicTacToe game = new TicTacToe();

		game.makeMove('1'); //X
		game.makeMove('5'); //O
		game.makeMove('9'); //X

		assertEquals('N', game.checkWinner());

		game.makeMove('3'); //O
		game.makeMove('8'); //X
		game.makeMove('4'); //O
		game.makeMove('7'); //X

		assertEquals('X', game.checkWinner());

	}


}
