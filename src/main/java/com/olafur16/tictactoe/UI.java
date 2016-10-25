package com.olafur16.tictactoe;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI
{
	private BufferedReader reader;

	public UI()
	{
		reader = new BufferedReader(new InputStreamReader(System.in));
	}
	public char readInput() throws IOException
	{
		String input = reader.readLine();
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
