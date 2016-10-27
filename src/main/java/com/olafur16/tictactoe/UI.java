package com.olafur16.tictactoe;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UI
{


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
