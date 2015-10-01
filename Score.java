/************************************************************/
/* Author: Robert Walker                                    */
/* Creation Date: April 20, 2015                            */
/* Due Date: April 30, 2015                                 */
/* Course: CSC243                                           */
/* Professor Name: Dr. Kaplan                               */
/* Assignment: #3                                           */
/* Filename: Score.java                                     */
/* Purpose: This keeps track of the score for the game.     */
/*                                                          */
/*                                                          */
/************************************************************/

public class Score {

	int wins;//Number of wins
	int losses;//Number of losses
	
	Score()//Constructor for the score class.
	{
		wins = 0;//Initialize wins as 0.
		losses = 0;//Initialize losses as 0.
	}
	
	public void incWins() {
		wins += 1;//Increase the number of wins.
	}
	
	public void incLosses() {
		losses += 1;//Increase the number of losses.
	}
	
	public int wins() {
		return wins;//Return the number of wins
	}
	
	public int losses() {
		return losses;//Return the number of losses.
	}
	
}
