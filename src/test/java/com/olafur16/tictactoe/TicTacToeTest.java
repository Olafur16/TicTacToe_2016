package com.olafur16.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest{

	@Test
	public void testString() throws Exception{
		assertEquals("Test", TicTacToe.test());
	}
	@Test
	public void testString2() throws Exception{
		assertEquals("Test2", TicTacToe.test2());
	}
}
