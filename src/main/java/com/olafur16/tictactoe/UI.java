package com.olafur16.tictactoe;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * <h1>User Interface - Console</h1>
 * This class is the User interface for the game TicTacToe. 
 * Functions for the game is written in the class TicTacToe.
 * @author Benedikt
 *
 */

public class UI
{
	public void displayBoard(char board[][], int size)
	{
		/**
		 * This method is used to draw up the 3x3 TicTacToe board both in the beginning of game, End and after each move. 
		 * @param size Size is meant to be the int 3. 
		 * @param board represents the game as it stands each time. This parameter should be the board as it stands at each time. 
		 * 
		 * 
		 * 
		 */
		for (int x = 0; x < size; x++)
		{
			
			for (int y = 0; y < size; y++)
			{
				StdOut.print(board[x][y] + " ");
			}
			StdOut.println();	
		}
	}

	public char readInput()
	{
		
		/**
		 * readInput reads the user input as he makes a move. 
		 *  
		 */
		String input = StdIn.readLine();

		while(input.length() == 0)
		{
			input = StdIn.readLine();
		}
		return input.charAt(0);
	}

	public void displayMessageWithNewLine(String message)
	{
		/**
		 * This method can be called to print out a message and enter a new line to the user to console.
		 * 
		 * @param message is a string of text which is sent to the void and printed to console
		 *  
		 */	
		System.out.println(message);
	}

	public void displayMessage(String message)
	{
		/**
		 * This method can be called to print out a message to the user to console. 
		 * 
		 * @param message is a string of text which is sent to the void and printed to console
		 * 
		 */	
		System.out.print(message);
	}
	
	public static void main(String[] args)
	{
		
	}
}
