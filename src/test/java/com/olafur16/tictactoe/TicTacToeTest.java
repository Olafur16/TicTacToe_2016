package com.olafur16.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest{

	/*@Test
	public void testString() throws Exception{
		assertEquals("Test", TicTacToe.test());
	}*/

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

		game.makeMoveTest('1');
		game.makeMoveTest('5');
		game.makeMoveTest('9');

		assertEquals('X', game.charAt(0,0));
		assertEquals('O', game.charAt(1,1));
		assertEquals('X', game.charAt(2,2));

	}

	@Test
	public void testCharAt() throws Exception {
		TicTacToe game = new TicTacToe();

		game.makeMoveTest('1');
		game.makeMoveTest('3');
		game.makeMoveTest('6');

	    assertEquals('X', game.charAt(0,0));
		assertEquals('O', game.charAt(0,2));
		assertEquals('X', game.charAt(1,2));
	}

	@Test
	public void testcheckWinner() throws Exception{
		TicTacToe game = new TicTacToe();

		game.makeMoveTest('1'); //X
		game.makeMoveTest('5'); //O
		game.makeMoveTest('9'); //X

		assertEquals('N', game.checkWinner());

		game.makeMoveTest('3'); //O
		game.makeMoveTest('8'); //X
		game.makeMoveTest('4'); //O
		game.makeMoveTest('7'); //X

		assertEquals('X', game.checkWinner());

	}


}
