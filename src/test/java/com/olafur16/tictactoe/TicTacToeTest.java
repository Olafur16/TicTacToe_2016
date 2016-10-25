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


}
