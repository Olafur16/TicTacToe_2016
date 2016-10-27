package com.olafur16.tictactoe;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToe
{
	public static final int boardSize = 3;
	private char[][] board;
	public char currentPlayer;
	private int turnCounter = 0;
	public UI ui;

	public TicTacToe()
	{
		ui = new UI();
		board = new char[boardSize][boardSize];
		currentPlayer = 'X';
		fillBoard();
	}

	public char[][] getBoard()
	{
		return board;
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

	private boolean makeMove(int posX,int posY,char number)
	{
		if(board[posX][posY] == number)
        {
          	board[posX][posY] = currentPlayer;
          	currentPlayer = switchPlayer(currentPlayer);
          	turnCounter++;
          	return false;
        }

      	else
      	{
           	ui.displayMessage("Invalid move");
           	return true;
        }

	}

	public void makeMove() 
	{
		boolean illegalMove = true;
    	while(illegalMove)
    	{

        	ui.displayMessage(" position: ");
        	char choice;

        	choice = ui.readInput();
        	

            switch(choice)
            {
                 case '1':
                 	illegalMove = makeMove(0,0,'1');
                     break;
                 case '2':
                 	illegalMove = makeMove(0,1,'2');
                  break;
                 case '3':
                 	illegalMove = makeMove(0,2,'3');
                  break;
                 case '4':
					illegalMove = makeMove(1,0,'4');
                  break;
                 case '5':
                 	illegalMove = makeMove(1,1,'5');
                  break;
                 case '6':
               	  	illegalMove = makeMove(1,2,'6');
                  break;
                 case '7':
                 	illegalMove = makeMove(2,0,'7');
                  break;
                 case '8':
                 	illegalMove = makeMove(2,1,'8');
                  break;
                 case '9':
                 	illegalMove = makeMove(2,2,'9');
                  break;
                default:  ui.displayMessage("Invalid move");
                	illegalMove = true;
                break;
            }

    	}
	}

	private char checkWinner(char player)
	{
		if (board[0][0] == player && board[0][1] == player && board[0][2] == player)
			return player;
		if (board[1][0] == player && board[1][1] == player && board[1][2] == player)
			return player;
		if (board[2][0] == player && board[2][1] == player && board[2][2] == player)
			return player;

		if (board[0][0] == player && board[1][0] == player && board[2][0] == player)
			return player;
		if (board[0][1] == player && board[1][1] == player && board[2][1] == player)
			return player;
		if (board[0][2] == player && board[1][2] == player&& board[2][2] == player)
			return player;

		if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
			return player;
		if (board[2][0] == player && board[1][1] == player && board[0][2] == player)
			return player;

		else
		{
			return 'n';
		}

	}

	public char checkWinner()
	{
		if(checkWinner('X') == 'X')
		{
			return 'X';
		}
		
		if (checkWinner('O') == 'O') {
			return 'O';
		}

		return 'N';
	}


	//Test function to make it easier to test the makeMove function
	public void makeMoveTest(char choice) 
	{
		boolean illegalMove = true;
    	while(illegalMove)
    	{

            switch(choice)
            {
                 case '1':
                 	illegalMove = makeMove(0,0,'1');
                     break;
                 case '2':
                 	illegalMove = makeMove(0,1,'2');
                  break;
                 case '3':
                 	illegalMove = makeMove(0,2,'3');
                  break;
                 case '4':
					illegalMove = makeMove(1,0,'4');
                  break;
                 case '5':
                 	illegalMove = makeMove(1,1,'5');
                  break;
                 case '6':
               	  	illegalMove = makeMove(1,2,'6');
                  break;
                 case '7':
                 	illegalMove = makeMove(2,0,'7');
                  break;
                 case '8':
                 	illegalMove = makeMove(2,1,'8');
                  break;
                 case '9':
                 	illegalMove = makeMove(2,2,'9');
                  break;
                default:  ui.displayMessage("Invalid move");
                	illegalMove = true;
                break;
            }

    	}

    }

	public static void main(String[] args)
	{

	}
}
