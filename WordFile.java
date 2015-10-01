/************************************************************/
/* Author: Robert Walker                                    */
/* Creation Date: April 20, 2015                            */
/* Due Date: April 30, 2015                                 */
/* Course: CSC243                                           */
/* Professor Name: Dr. Kaplan                               */
/* Assignment: #3                                           */
/* Filename: WordFile.java                                  */
/* Purpose: This will fetch a word at random from the file  */
/* wordlist.txt                                             */
/*                                                          */
/************************************************************/

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class WordFile {
	final private String PATH = "wordlist.txt";//Holds the path to the wordlist file.
	private List<String> lines = null;//Contains the lines
	
	public String getRandomLine() {//Gets a line at random from the file.
		try {//Catches incase there is an issue reading the file.
	        lines = Files.readAllLines(Paths.get(PATH),
	                StandardCharsets.UTF_8);
	    } catch (IOException e) {//This is what happens if there is an issue.
	        System.out.println("File can't be opened.");
	    }

	    int randomWordIndex = getRandomNumber(0, lines.size()-1);//Retrieves a random number from 0 to the end of the file.
	    return lines.get(randomWordIndex);//Returns the random line.
	}
	
	private int getRandomNumber(int min, int max) {//Retrieves a random number using the random utility.
	    return min + (int) (Math.random() * (max - min + 1));
	}
}
