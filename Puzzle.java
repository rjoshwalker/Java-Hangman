/************************************************************/
/* Author: Robert Walker                                    */
/* Creation Date: April 20, 2015                            */
/* Due Date: April 30, 2015                                 */
/* Course: CSC243                                           */
/* Professor Name: Dr. Kaplan                               */
/* Assignment: #3                                           */
/* Filename: Puzzle.java                                    */
/* Purpose: This provides the program with the puzzle       */
/* part of the word, gathering the word and then acting as  */
/* the mediates between the other classes.                  */
/************************************************************/

import java.util.Random;//IMPORT NEEDED FOR THE RANDOM FUNCTION

public class Puzzle {

    // Variables
	Word word = new Word();//Contains a word instance.
    String puzzleWord;//Contains the word for the puzzle
    String puzzleDef;//Contains the definition of the word for the puzzle.
    int puzzleLength;
    
    	
    

    public void makePuzzle()//CREATIG THE PUZZLE
    {
		word.getNewWord();//Gets the word.

        puzzleWord = word.getWord();//Selects the word at that index value.
        puzzleDef = word.getDef();//Gets the definition of the word.

        setPuzzleLength();//Sets the puzzle length.
        
    }
    
    private int puzzleLength(String wordx) {//Sets the puzzle length function.
    	char[] array;
    	
    	array = wordx.toCharArray();
    	
    	return array.length;
    }
    
    private void setPuzzleLength() {//sets the puzzle length.
    	puzzleLength = puzzleLength(puzzleWord);//Stores the length of the puzzle string.
    }
    
    public int getPuzzleLength() {//Returns the puzzle length.
    	return puzzleLength;
    }

    
    public String getPuzzleWord()//Return the puzzle word.
    {
    	return puzzleWord;
    }
    
    public String getPuzzleDef()//Returns the puzzle definition.
    {
    	return puzzleDef;
    }

    public int RandomInteger(int min, int max)//Random integer function.
    {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;//Returns the random number that was generated.
    }
}
