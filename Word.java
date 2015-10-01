/************************************************************/
/* Author: Robert Walker                                    */
/* Creation Date: April 20, 2015                            */
/* Due Date: April 30, 2015                                 */
/* Course: CSC243                                           */
/* Professor Name: Dr. Kaplan                               */
/* Assignment: #3                                           */
/* Filename: Word.java                                      */
/* Purpose: This gets the word from WordFile and then       */
/* separates the line into the actual word and the          */
/* definition, then provides this for the rest of the app.  */
/************************************************************/

public class Word {
	
	WordFile wf;//Contains a WordFile class.
	String[] split;//Will contain the two split strings.
	String word;//Will contain the word from the file.
	String def;//Will contain the definition of the word from the file.
	
	public Word() {
		//Put anything that would be specific to a new word instance.
	}
	
	public String getWord() {//Retrieves the word from this class.
		return word;
	}
	
	public String getDef() {//Retrieves the definition from this class.
		return def;
	}
	
	public void getNewWord() {//Makes the instance get a new word from the WordFile.
		wf = new WordFile();//Set up a new WordFile.
		
		split = wf.getRandomLine().split("\\s+");//Retrieve the new word from the WordFile, split into two strings by the space, and then put in string array.
		
		word = split[0];//Assign the first part of the string array to word.
		def = split[1];//Assign the second part of the string array to the definition.
	}

}
