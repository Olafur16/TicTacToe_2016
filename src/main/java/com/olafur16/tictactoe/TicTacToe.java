package com.olafur16.tictactoe;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


public class TicTacToe
{
	public static final int boardSize = 3;
	private char[][] board;
	public char currentPlayer;
	private int turnCounter = 0;
	public UI ui;
	
	public int getTurnCounter()
	{
		return turnCounter;
	}

	public TicTacToe()
	{
		ui = new UI();
		board = new char[boardSize][boardSize];
		currentPlayer = 'X';
		fillBoard();
	}

	public void displayBoard()
	{
		ui.displayBoard(board, 3);
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
           	ui.displayMessageWithNewLine("Invalid move");
           	return true;
        }

		
	}

	public void makeMove() 
	{
		boolean illegalMove = true;
    	while(illegalMove)
    	{

        	ui.displayMessage("Player " + currentPlayer + " make a move: ");
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
                default:  ui.displayMessageWithNewLine("Invalid move");
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
                default:  ui.displayMessageWithNewLine("Invalid move ");
                	illegalMove = true;
                break;
            }

    	}

    }

	public static void main(String[] args)
	{
		UI ui = new UI();
		TicTacToe ttt = new TicTacToe();
		
		ttt.displayBoard();
		while(ttt.getTurnCounter()<9)
		{
		ttt.makeMove();
		ttt.displayBoard();
			if(ttt.checkWinner() =='X')
			{
				ui.displayMessageWithNewLine("Winner is X");
				break;
			}
			else if(ttt.checkWinner() =='O')
			{
				ui.displayMessageWithNewLine("Winner is O");
				break;
			}
			else if(ttt.checkWinner() =='N' && ttt.getTurnCounter()==9)
			{
				ui.displayMessageWithNewLine("Draw!");
				break;
			}	
			
		}
		StdIn.readLine();
		
	}
}
