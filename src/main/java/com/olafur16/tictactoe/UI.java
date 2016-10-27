package com.olafur16.tictactoe;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UI
{
	public void displayBoard(char board[][], int size)
	{
		
		for (int x = 0;x<size; x++)
		{
			
			for (int y = 0; y<size;y++)
			{
				StdOut.print(board[x][y] + " ");
			}
			StdOut.println();	
		}
		
		
	}

	public UI()
	{
	
	
	}
	public char readInput()
	{
		String input = StdIn.readLine();
		return input.charAt(0);
	}

	public void displayMessageWithNewLine(String message)
	{
		System.out.println(message);
	}

	public void displayMessage(String message)
	{
		System.out.print(message);
	}
	
	public static void main(String[] args)
	{
		
	}
}
