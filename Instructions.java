/************************************************************/
/* Author: Robert Walker                                    */
/* Creation Date: April 20, 2015                            */
/* Due Date: April 30, 2015                                 */
/* Course: CSC243                                           */
/* Professor Name: Dr. Kaplan                               */
/* Assignment: #3                                           */
/* Filename: Instructions.java                              */
/* Purpose: This creates a pop up that displays to the user */
/* and relays information to them, while not letting them   */
/* continue until acknowledge the popup.                    */
/************************************************************/

import javax.swing.JOptionPane;

public class Instructions {
	
	public static void infoBox(String infoMessage, String titleBar)//Information box method. Static.
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);//Uses JOptionPane to display a popup message.
    }

}
