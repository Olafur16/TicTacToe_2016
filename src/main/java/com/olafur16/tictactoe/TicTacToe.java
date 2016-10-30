package com.olafur16.tictactoe;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


/**
 * <h1>TicTacToe functions<h1>
 * This class has the main functions and functionality for the game TicTacToe
 * 
 * @param boardSize is a fixed size of integer 3. The board is 3x3.
 * @param board is a char array which will be 3x3 in size.
 * @param currentPlayer is the player who is to make a move. Either char X or O. 
 * @param turnCounter is set in the beginning to 0 and counts the number of moves that are made. If move
 * @param ui is a reference to the class UI which is the UserInterface class. 
 * 
 * 
 */

public class TicTacToe
{

	public static final int boardSize = 3;
	private char[][] board;
	public char currentPlayer;
	private int turnCounter = 0;
	public UI ui;
	

	/**
	 * The method sets the board start state. 
	 * The board size and fills the board with numbers with the fillboard method. 
	 * Sets the current player to X.
	 * ui is a new instance of the UI class which is the user interface. 
	 * 
	 */
	public TicTacToe()
	{
		
		ui = new UI();
		board = new char[boardSize][boardSize];
		currentPlayer = 'X';
		fillBoard();
	}

	/**
	 * Returns the number of turns done. 
	 */
  public int getTurnCounter()
  {
	  
    return turnCounter;
  }


  /**
   * Displays a Greeting message to the players and offers the player to pick a char token X or O. 
   * @param choice receives players choice of char token X or O
   * Checks if token is either X or O. If other then prints Invalid choice. 
   * Sets the token for the player who makes the first move. 
   */
  public void welcome()
  {
    ui.displayMessageWithNewLine("Welcome to TicTacToe");
    ui.displayMessage("Choose your Player X or O: ");
    char choice = ui.readInput();

    while(choice != 'X' && choice != 'O')
    {
           
        ui.displayMessageWithNewLine("Invalid choice! ");
        ui.displayMessage("Choose X or O: ");
        choice = ui.readInput();  
      
    } 


    currentPlayer = choice;
  }

  	/**
	 * Calls the ui.displayBoard method. Send the parameter 3 to get a 3x3 tictactoe board and 
	 * the board array. 
	 */
	public void displayBoard()
	{
		
		ui.displayBoard(board, 3);
	}
	
	
	/**
	 * Returns the board array. 
	 * 
	 */
	public char[][] getBoard()
	{
	
		return board;
	}

	
	/**
	 * Method is called in the beginning of the game to fill the gameboard with numbers. 
	 * Fills the board array 3x3 with numbers from 1 to 9. 
	 * @param nextNumberToFill is set to 1 and climbs to 9. 
	 * 
	 */
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
	
	
	/**
	 * Returns a certain char in the board. Method mainly used for testing the board.  
	 */
	public char charAt(int posX, int posY)
	{	
		return board[posX][posY];
	}
	
	
	/**
	 * Switches players from the player who just made a move to the player who makes the next move. 
	 * 
	 */
	
	public char switchPlayer(char player)
	{
		
    	if(player == 'X')
        	player = 'O';
    	else
        	player = 'X';

    	return player;
	}

	/**
	 * The method registers a move a player made to the board if the move is legal. 
	 * The place of the move must be a number else a error message is printed (Invalid move).
	 * The method receives a x position and a y position of the board and the corresponding number.
	 * If corresponding number is still in array. Move is made. 
	 * 
	 * 
	 */
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

	/**
	 * Prints out which player is to make a move. 
	 * Waits for user input and reads the move. 
	 * Calls the method makeMove to see if a move is illegal or should be made. 
	 */
	public void readMove()
	{	
		ui.displayMessage("Player " + currentPlayer + " make a move: ");
        char choice;

        choice = ui.readInput();
        makeMove(choice);

	}

	/**
	 * The method receives a players choice in the form of a number of type char. 
	 * The number is run through validation with the makeMove(int posX, int posY,char number)
	 * if Illegal move, the readMove method is run again.
	 * 
	 */
	public void makeMove(char choice)
	{
		boolean illegalMove = false;
	
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

		if(illegalMove == true)
		{
			readMove();
		}
}

	/**
	 * This method checks if there is a winner (3 icons in a row or across)on the board. 
	 * Returns the winner as the players char X or O or the char n if there is no player. 
	 */
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
		if (board[0][2] == player && board[1][2] == player && board[2][2] == player)
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

	
	/**
	 * 
	 * This method checks if there is a winner by calling checkwinner(char player) method. 
	 * Returns the winner. 
	 * 
	 */
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

	
	/**
	 * This is the main method where the game is run. 
	 * Loops the readmove, displayBoard,checkwinner. 
	 * Game ends when there is a winner or total number of moves are equal to 9 moves. 
	 * 
	 * 
	 * @param ui is a new instance of the Ui class. 
	 * @param tt is a new instance of the TicTacToe class
	 * 
	 */
	public static void main(String[] args)
	{
		UI ui = new UI();
		TicTacToe ttt = new TicTacToe();
		ttt.welcome();
		ttt.displayBoard();
		while(ttt.getTurnCounter() < 9)
		{
		ttt.readMove();
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
