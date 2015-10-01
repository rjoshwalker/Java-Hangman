/************************************************************/
/* Author: Robert Walker                                    */
/* Creation Date: April 20, 2015                            */
/* Due Date: April 30, 2015                                 */
/* Course: CSC243                                           */
/* Professor Name: Dr. Kaplan                               */
/* Assignment: #3                                           */
/* Filename: HangmanGame.java                               */
/* Purpose: This is the main portion of the game. It        */
/* controls the functions of the actual game that allows    */
/* gameplay to happen.                                      */
/************************************************************/

public class HangmanGame {
    Puzzle pz;//Creates a new puzzle
    Score pscore;//Creates a new score
    boolean gameActive;//A check for later use to see if the game is active.
    int[] correctPositions;//Holds the correct positions of the letters.
    int bodyPosition;//Keeps a count of the body position.
    int totalCorrect;//Keeps a count of how many correct there are.
    String puzzleWord;//Holds the puzzle word.
    String puzzleDef;//Holds the puzzle position.
    boolean win;//A boolean to hold a win if condition is met.

    HangmanGame()
    {
        pz = new Puzzle();//Initializes the Puzzle
        pscore = new Score();//Initializes the score.
        bodyPosition = 0;//Start with no body hanging.
        gameActive = false;//Starts the game as not active.
        totalCorrect = 0;//Sets the total correct to 0.
        win = false;//Sets the win value to false, they haven't won yet.

    }

    public void startGame()//Starts the game.
    {
        gameActive = true;//Sets the game to active, allowing user input.
        playGame();//Creates the first puzzle to solve.
    }
    
    public void stopGame()//Stops the game, ends the program.
    {
    	System.exit(0);//Stops the game by terminating the JVM.
    }
    
    public boolean isActive()//A check to see if the game is active.
    {
    	return gameActive;
    }
    
    public void deactivate()//Deactivates the game, if necessary.
    {
    	gameActive = false;
    }

    public int currentPuzzleLength()//Returns the current length of the word for the puzzle.
    {
    	return pz.getPuzzleLength();
    }
    
    public void playGame()//Starts to play the game, sets up the word.
    {
    	//Make the puzzle
    	pz.makePuzzle();
    	
    	//Set puzzle word
    	puzzleWord = pz.getPuzzleWord();
    	puzzleDef = pz.getPuzzleDef();
    	
    	totalCorrect = 0;//Start player over.
    	win = false;//Makes sure that win is set to false since the game is starting fresh.
    	
    }
    
    public String getPuzzleWord() {//Returns the puzzle word.
    	return puzzleWord;
    }
    
    public String getPuzzleDef() {//Returns the puzzle definition.
    	return puzzleDef;
    }
    
    public boolean checkPlayerWin() {//Returns if the player has won or not.
    	return win;
    }
    
    public boolean playerTurn(char x)//This action allows the checking of the player's guess against the word to see if it's correct.
    {
    	int correct = 0;//Holds the number of correct letters.
    	int pos = 0;//Holds the position of the correct letter.
    	
    	correctPositions = new int[10];//Holds all of the correct positions.
    	
        String wordString = pz.getPuzzleWord();//Gets the puzzle word.
        
        char[] wordArray = wordString.toCharArray();//Changes the puzzle word into a char array.
        
        for(int i=0;i < wordArray.length;i++)//Loop to compare the guess against the letters in the word.
        {
        	char compare = Character.toUpperCase(wordArray[i]);
        	
        	if(x == compare)//If the guess matches the letters in the game.
        	{
        		++correct;//Increment the correct letters.
        		correctPositions[pos] = i+1;//Add the position to the list.
        		pos++;//Increment the position.
        	}
        	else continue;//Otherwise, iterate again.
        }
        
        if(correct > 0)//If the number correct is greater than none..
        {
        	//Reveal the correct letter(s).
        	totalCorrect += correct;
        	
        	if(totalCorrect == currentPuzzleLength())//If the number correct is equal to the length of the word.
        	{
        		win = true;//Set the win to true, they won.
        	}
        	
        	return true;//Return true, they were correct.
        	
        }
        else if(correct < 1)//If they were not correct, add a body part.
        {
        	if(bodyPosition == 0)
        	{
        		bodyPosition = 1;
        	}
        	else if(bodyPosition == 1)
        	{
        		bodyPosition = 2;
        	}
        	else if(bodyPosition == 2)
        	{
        		bodyPosition = 3;
        	}
        	else if(bodyPosition == 3)
        	{
        		bodyPosition = 4;
        	}
        	else if(bodyPosition == 4)
        	{
        		bodyPosition = 5;
        	}
        	else if(bodyPosition == 5)
        	{
        		bodyPosition = 6;
        	}
        	else if(bodyPosition == 6)
        	{
        		bodyPosition = 6;
        		
        		//END OF GAME! THEY LOST.
        	}
        	return false;//They were not correct, return false.
        }
        else return false;//Return false if something else happened.
        
    }
    
    public int getBodyPosition(){//Returns the current position the body is at.
    	return bodyPosition;
    }
    
    public void resetBodyPosition()//Resets the body position to 0.
    {
    	bodyPosition = 0;
    }
    
    public int[] getCorrectPositions()//Returns the number of positions correct at the correct positions in the word.
    {
    	return correctPositions;
    }
    
    public void resetCorrectPositions()//Resets the correct positions for the next guess.
    {
    	for(int i = 0;i < 10;i++)//Loop through to set all the positions to 0.
    	{
    		correctPositions[i] = 0;
    	}
    }
}
