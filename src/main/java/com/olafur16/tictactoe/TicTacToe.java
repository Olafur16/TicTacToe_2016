package com.olafur16.tictactoe;

public class TicTacToe
{
	public static final int boardSize = 3;
	private char[][] board = new char[boardSize][boardSize];

	public TicTacToe()
	{
		fillBoard();
	}
	public void fillBoard()
	{
		char nextNumberToFill = '1';

    	for(int j = 0; j < boardSize; j++)
    	{
       		for(int i = 0; i < boardSize; i++)
        	{
            	board[j][i] = nextNumberToFill;
            	nextNumberToFill++;
        	}
    	}

	}
	public char charAt(int posX, int posY)
	{
		return board[posX][posY];
	}

	public char switchPlayer(char player)
	{
    	if(player == 'X')
        	player = 'O';
    	else
        	player = 'X';

    	return player;
	}

	public static void main(String[] args)
	{

	}
}
