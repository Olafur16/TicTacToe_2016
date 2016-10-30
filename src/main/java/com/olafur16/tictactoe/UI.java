package com.olafur16.tictactoe;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * User Interface - Console
 * This class is the User interface for the game TicTacToe. 
 * Functions for the game is written in the class TicTacToe.
 * 
 *
 */

public class UI
{
	/**
	 * This method is used to draw up the 3x3 TicTacToe board both in the beginning of game, End and after each move. 
	 * @param size Size is meant to be the int 3. 
	 * @param board represents the game as it stands each time. This parameter should be the board as it stands at each time. 
	 * 
	 */
	public void displayBoard(char board[][], int size)
	{
	
		for (int x = 0; x < size; x++)
		{
			
			for (int y = 0; y < size; y++)
			{
				StdOut.print(board[x][y] + " ");
			}
			StdOut.println();	
		}
	}

	
	/**
	 * readInput reads the user input as he makes a move. 
	 * 
	 * @return the input the player made. 
	 */
	public char readInput()
	{
		String input = StdIn.readLine();

		while(input.length() == 0)
		{
			input = StdIn.readLine();
		}
		return input.charAt(0);
	}

	/**
	 * This method can be called to print out a message and enter a new line to the user to console.
	 * 
	 *@param message is a string of text which is sent to the void and printed to console
	 *  
	 */	
	public void displayMessageWithNewLine(String message)
	{
		
		System.out.println(message);
	}

	/**
	 * This method can be called to print out a message to the user to console. 
	 * 
	 * @param message is a string of text which is sent to the void and printed to console
	 * 
	 */	
	public void displayMessage(String message)
	{
		
		System.out.print(message);
	}
	
	public static void main(String[] args)
	{
		
	}
}
