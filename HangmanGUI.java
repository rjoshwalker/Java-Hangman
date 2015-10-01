/************************************************************/
/* Author: Robert Walker                                    */
/* Creation Date: April 20, 2015                            */
/* Due Date: April 30, 2015                                 */
/* Course: CSC243                                           */
/* Professor Name: Dr. Kaplan                               */
/* Assignment: #3                                           */
/* Filename: HangmanGUI.java                                */
/* Purpose: This program will play a game of Hangman with   */
/* the user, pulling a list of words from a text file and   */
/* using images in the image folder.                        */
/************************************************************/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;



public class HangmanGUI {//Hangman Constructor
	
	final JFrame frame = new JFrame();//Creates a new frame
	
	BackgroundPanel bgPanel;//Creates a new Background panel.
	
	JLayeredPane toppanel;//Creates a new top panel.
	
	BodyPanel bodypanel;//Creates a new body panel.
	
	//Creates the letter panels.
	LetterPanel letterpanel_1;
	LetterPanel letterpanel_2;
	LetterPanel letterpanel_3;
	LetterPanel letterpanel_4;
	LetterPanel letterpanel_5;
	LetterPanel letterpanel_6;
	LetterPanel letterpanel_7;
	LetterPanel letterpanel_8;
	LetterPanel letterpanel_9;
	LetterPanel letterpanel_10;
	
	JLabel hangman = new JLabel("The Game of Hangman");//Creates the title
	
	//Creates the win and lose labels.
	JLabel youLose = new JLabel("You lose!");
	JLabel youWin = new JLabel("You win!");
	
	//Creates the Person, Place, Thing Labels.
	JLabel dPerson = new JLabel("Person");
	JLabel dPlace = new JLabel("Place");
	JLabel dThing = new JLabel("Thing");
	
	//Creates the buttons.
	final JButton btnA = new JButton("A");
	final JButton btnB = new JButton("B");
	final JButton btnC = new JButton("C");
	final JButton btnD = new JButton("D");
	final JButton btnE = new JButton("E");
	final JButton btnF = new JButton("F");
	final JButton btnG = new JButton("G");
	final JButton btnH = new JButton("H");
	final JButton btnI = new JButton("I");
	final JButton btnJ = new JButton("J");
	final JButton btnK = new JButton("K");
	final JButton btnL = new JButton("L");
	final JButton btnM = new JButton("M");
	final JButton btnN = new JButton("N");
	final JButton btnO = new JButton("O");
	final JButton btnP = new JButton("P");
	final JButton btnQ = new JButton("Q");
	final JButton btnR = new JButton("R");
	final JButton btnS = new JButton("S");
	final JButton btnT = new JButton("T");
	final JButton btnU = new JButton("U");
	final JButton btnV = new JButton("V");
	final JButton btnW = new JButton("W");
	final JButton btnX = new JButton("X");
	final JButton btnY = new JButton("Y");
	final JButton btnZ = new JButton("Z");
	
	//Creates the show and new buttons.
	final JButton btnShow = new JButton("Show Answer");
	final JButton btnNew = new JButton("New Word");
	
	//Two booleans to hold win or lose, true or false.
	boolean lose;
	boolean win;
	
	Score score;//Contains a score instance
	
	JLabel dWins = new JLabel("0");//Creates the "Wins" number for display.
	JLabel dLosses = new JLabel("0");//Creates the "Losses" number for display.
	
	JLabel dWinsLabel = new JLabel("Wins:");//Creates the "Wins" display.
	JLabel dLossesLabel = new JLabel("Losses:");//Creates the "Losses" display.
	
	static HangmanGame game;//Creates a new game.

	public static void main(String[] args) {//The main method.
		
		HangmanGUI window = new HangmanGUI();//Creates a new window.
		window.frame.setVisible(true);//sets the frame visible in the window.
		
		game = new HangmanGame();//Creates a new word game
		

	}
	
	public HangmanGUI() {
		
		score = new Score();//Initializes a new score instance.
		
		initialize();//Draw the GUI, establishing it.
		lockButtons();//Lock the letter buttons.
		
		Instructions.infoBox("You will be shown space holders for a word.\nGuess one letter at a time from the alphabet and see if you can guess the word.\nPress Start Game to begin. Goodluck!", "Instructions");
		
	}
	
	
	
	public void initialize() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Set the program to terminate on pressing the "x"
		frame.setTitle("Hangman");//Set the title of the game to "Hangman"

		toppanel = new JLayeredPane();//Create the top panel where everything sits.
		frame.add(toppanel, BorderLayout.CENTER);//Add the top panel to the frame.
		
		frame.setResizable(false);//Disable the frame from being resized.
		
		bgPanel = new BackgroundPanel();//Create a new Background Panel.
		toppanel.add(bgPanel, new Integer(1));//Add the Background Panel to the Top Panel, setting the layer to 1, all the way at the back.
		bgPanel.setVisible(true);//Set the background as visible.
		
		
		//Title at the top of the window
		hangman.setFont(new Font("Tahoma", Font.PLAIN, 32));
		hangman.setHorizontalAlignment(SwingConstants.CENTER);
		hangman.setBounds(80, 10, 400, 52);
		toppanel.add(hangman, new Integer(2));
		
		
		//Button Section
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when A is pressed
				if(game.isActive())
				{
					submitAnswer('A');
					btnA.setEnabled(false);
				}
			}
		});
		btnA.setBounds(0, 870, 42, 25);
		toppanel.add(btnA, new Integer(2));
		
		
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when B is pressed
				if(game.isActive())
				{
					submitAnswer('B');
					btnB.setEnabled(false);
				}
			}
		});
		btnB.setBounds(42, 870, 42, 25);
		toppanel.add(btnB, new Integer(2));
		
		
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when C is pressed
				if(game.isActive())
				{
					submitAnswer('C');
					btnC.setEnabled(false);
				}
			}
		});
		btnC.setBounds(84, 870, 42, 25);
		toppanel.add(btnC, new Integer(2));
		

		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when D is pressed
				if(game.isActive())
				{
					submitAnswer('D');
					btnD.setEnabled(false);
				}
			}
		});
		btnD.setBounds(126, 870, 42, 25);
		toppanel.add(btnD, new Integer(2));
		

		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when E is pressed
				if(game.isActive())
				{
					submitAnswer('E');
					btnE.setEnabled(false);
				}
			}
		});
		btnE.setBounds(168, 870, 42, 25);
		toppanel.add(btnE, new Integer(2));
		

		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when F is pressed
				if(game.isActive())
				{
					submitAnswer('F');
					btnF.setEnabled(false);
				}
			}
		});
		btnF.setBounds(210, 870, 42, 25);
		toppanel.add(btnF, new Integer(2));
		

		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when G is pressed
				if(game.isActive())
				{
					submitAnswer('G');
					btnG.setEnabled(false);
				}
			}
		});
		btnG.setBounds(252, 870, 42, 25);
		toppanel.add(btnG, new Integer(2));
		

		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when H is pressed
				if(game.isActive())
				{
					submitAnswer('H');
					btnH.setEnabled(false);
				}
			}
		});
		btnH.setBounds(294, 870, 42, 25);
		toppanel.add(btnH, new Integer(2));
		

		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when I is pressed
				if(game.isActive())
				{
					submitAnswer('I');
					btnI.setEnabled(false);
				}
			}
		});
		btnI.setBounds(336, 870, 42, 25);
		toppanel.add(btnI, new Integer(2));
		

		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when J is pressed
				if(game.isActive())
				{
					submitAnswer('J');
					btnJ.setEnabled(false);
				}
			}
		});
		btnJ.setBounds(378, 870, 42, 25);
		toppanel.add(btnJ, new Integer(2));
		

		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when K is pressed
				if(game.isActive())
				{
					submitAnswer('K');
					btnK.setEnabled(false);
				}
			}
		});
		btnK.setBounds(420, 870, 42, 25);
		toppanel.add(btnK, new Integer(2));
		

		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when L is pressed
				if(game.isActive())
				{
					submitAnswer('L');
					btnL.setEnabled(false);
				}
			}
		});
		btnL.setBounds(462, 870, 42, 25);
		toppanel.add(btnL, new Integer(2));
		

		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when M is pressed
				if(game.isActive())
				{
					submitAnswer('M');
					btnM.setEnabled(false);
				}
			}
		});
		btnM.setBounds(504, 870, 44, 25);
		toppanel.add(btnM, new Integer(2));
		

		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when N is pressed
				if(game.isActive())
				{
					submitAnswer('N');
					btnN.setEnabled(false);
				}
			}
		});
		btnN.setBounds(0, 900, 42, 25);
		toppanel.add(btnN, new Integer(2));
		

		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when O is pressed
				if(game.isActive())
				{
					submitAnswer('O');
					btnO.setEnabled(false);
				}
			}
		});
		btnO.setBounds(42, 900, 43, 25);
		toppanel.add(btnO, new Integer(2));
		

		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when P is pressed
				if(game.isActive())
				{
					submitAnswer('P');
					btnP.setEnabled(false);
				}
			}
		});
		btnP.setBounds(85, 900, 42, 25);
		toppanel.add(btnP, new Integer(2));
		

		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when Q is pressed
				if(game.isActive())
				{
					submitAnswer('Q');
					btnQ.setEnabled(false);
				}
			}
		});
		btnQ.setBounds(127, 900, 43, 25);
		toppanel.add(btnQ, new Integer(2));
		

		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when R is pressed
				if(game.isActive())
				{
					submitAnswer('R');
					btnR.setEnabled(false);
				}
			}
		});
		btnR.setBounds(170, 900, 42, 25);
		toppanel.add(btnR, new Integer(2));
		

		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when S is pressed
				if(game.isActive())
				{
					submitAnswer('S');
					btnS.setEnabled(false);
				}
			}
		});
		btnS.setBounds(212, 900, 42, 25);
		toppanel.add(btnS, new Integer(2));
		

		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when T is pressed
				if(game.isActive())
				{
					submitAnswer('T');
					btnT.setEnabled(false);
				}
			}
		});
		btnT.setBounds(254, 900, 42, 25);
		toppanel.add(btnT, new Integer(2));
		

		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when U is pressed
				if(game.isActive())
				{
					submitAnswer('U');
					btnU.setEnabled(false);
				}
			}
		});
		btnU.setBounds(296, 900, 42, 25);
		toppanel.add(btnU, new Integer(2));
		

		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when V is pressed
				if(game.isActive())
				{
					submitAnswer('V');
					btnV.setEnabled(false);
				}
			}
		});
		btnV.setBounds(338, 900, 42, 25);
		toppanel.add(btnV, new Integer(2));
		

		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when W is pressed
				if(game.isActive())
				{
					submitAnswer('W');
					btnW.setEnabled(false);
				}
			}
		});
		btnW.setBounds(380, 900, 46, 25);
		toppanel.add(btnW, new Integer(2));
		

		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when X is pressed
				if(game.isActive())
				{
					submitAnswer('X');
					btnX.setEnabled(false);
				}
			}
		});
		btnX.setBounds(426, 900, 42, 25);
		toppanel.add(btnX, new Integer(2));
		

		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when Y is pressed
				if(game.isActive())
				{
					submitAnswer('Y');
					btnY.setEnabled(false);
				}
			}
		});
		btnY.setBounds(468, 900, 42, 25);
		toppanel.add(btnY, new Integer(2));
		

		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when Z is pressed
				if(game.isActive())
				{
					submitAnswer('Z');
					btnZ.setEnabled(false);
				}
			}
		});
		btnZ.setBounds(510, 900, 44, 25);
		toppanel.add(btnZ, new Integer(2));
		
		final JButton btnStart = new JButton("Start Game");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when Start Game is pressed
				if(!game.isActive()){
					game.startGame();//Starts the game
					setPuzzle();
					btnStart.setEnabled(false);
					
					//Enable these buttons to start the game.
					btnNew.setEnabled(true);
					btnShow.setEnabled(true);
					resetButtons();
				}
			}
		});
		btnStart.setBounds(10, 940, 100, 25);
		toppanel.add(btnStart, new Integer(2));
		

		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when A is pressed
				if(game.isActive())
				{
					resetButtons();//Reset the buttons.
					
					//Remove the "Person", "Place", or "Thing"
					removePPot(game.getPuzzleDef());
					
					clearPuzzle();//Clear the puzzle.
					checkPuzzleClear();//Check to make sure it's clear.
					btnShow.setEnabled(true);//Enable the show answer button.
					if(game.getBodyPosition() != 0)//Checks to make sure there is at least one body panel, then removes them.
					{
						clearBody();
						game.resetBodyPosition();
					}
					game.startGame();//Starts the game.
					setPuzzle();//SEts up the puzzle.
				}
			}
		});
		btnNew.setBounds(120, 940, 100, 25);
		toppanel.add(btnNew, new Integer(2));
		
		
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when Show Answer is pressed
				if(game.isActive()) {
					showAnswer();//Shows answer
					lockButtons();//L<ocks the letter buttons.
					btnShow.setEnabled(false);
				}
			}
		});
		btnShow.setBounds(230, 940, 125, 25);
		toppanel.add(btnShow, new Integer(2));
		
		final JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Action to take when Quit is pressed
				System.gc();
				game.stopGame();//Stops the game
			}
		});
		btnQuit.setBounds(445, 940, 100, 25);
		toppanel.add(btnQuit, new Integer(2));
		
		//Display the Wins and Losses
		dWins.setHorizontalAlignment(SwingConstants.RIGHT);//WINS NUMBER
		dWins.setFont(new Font("Tahoma", Font.PLAIN, 24));
		dWins.setBounds(510, 80, 30, 30);
		toppanel.add(dWins, new Integer(2));
		dWins.setVisible(true);
		
		dLosses.setHorizontalAlignment(SwingConstants.RIGHT);//LOSSES NUMBER
		dLosses.setFont(new Font("Tahoma", Font.PLAIN, 24));
		dLosses.setBounds(510, 110, 30, 30);
		toppanel.add(dLosses, new Integer(2));
		dLosses.setVisible(true);
		
		dWinsLabel.setHorizontalAlignment(SwingConstants.RIGHT);//WINS LABEL
		dWinsLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		dWinsLabel.setBounds(410, 80, 100, 30);
		toppanel.add(dWinsLabel, new Integer(2));
		dWinsLabel.setVisible(true);
		
		dLossesLabel.setHorizontalAlignment(SwingConstants.RIGHT);//LOSSES LABEL
		dLossesLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		dLossesLabel.setBounds(410, 110, 100, 30);
		toppanel.add(dLossesLabel, new Integer(2));
		dLossesLabel.setVisible(true);
		
		
		//Lock these buttons before the game starts.
		btnNew.setEnabled(false);
		btnShow.setEnabled(false);
		
		toppanel.revalidate();
		toppanel.repaint();
		
		//Finalize Frame
		frame.pack();
		frame.setSize(569, 1000);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
	
	public void updateWins() {//Updates the win number label
		String nString = String.format("%d", score.wins());
		dWins.setText(nString);
	}
	
	public void updateLosses() {//Updates the losses number label
		String nString = String.format("%d", score.losses());
		dLosses.setText(nString);
	}
	
	public void resetButtons()//Resets the letter buttons for use.
	{
		btnA.setEnabled(true);
		btnB.setEnabled(true);
		btnC.setEnabled(true);
		btnD.setEnabled(true);
		btnE.setEnabled(true);
		btnF.setEnabled(true);
		btnG.setEnabled(true);
		btnH.setEnabled(true);
		btnI.setEnabled(true);
		btnJ.setEnabled(true);
		btnK.setEnabled(true);
		btnL.setEnabled(true);
		btnM.setEnabled(true);
		btnN.setEnabled(true);
		btnO.setEnabled(true);
		btnP.setEnabled(true);
		btnQ.setEnabled(true);
		btnR.setEnabled(true);
		btnS.setEnabled(true);
		btnT.setEnabled(true);
		btnU.setEnabled(true);
		btnV.setEnabled(true);
		btnW.setEnabled(true);
		btnX.setEnabled(true);
		btnY.setEnabled(true);
		btnZ.setEnabled(true);
	}
	
	public void lockButtons()//Locks the letter buttons from use.
	{
		btnA.setEnabled(false);
		btnB.setEnabled(false);
		btnC.setEnabled(false);
		btnD.setEnabled(false);
		btnE.setEnabled(false);
		btnF.setEnabled(false);
		btnG.setEnabled(false);
		btnH.setEnabled(false);
		btnI.setEnabled(false);
		btnJ.setEnabled(false);
		btnK.setEnabled(false);
		btnL.setEnabled(false);
		btnM.setEnabled(false);
		btnN.setEnabled(false);
		btnO.setEnabled(false);
		btnP.setEnabled(false);
		btnQ.setEnabled(false);
		btnR.setEnabled(false);
		btnS.setEnabled(false);
		btnT.setEnabled(false);
		btnU.setEnabled(false);
		btnV.setEnabled(false);
		btnW.setEnabled(false);
		btnX.setEnabled(false);
		btnY.setEnabled(false);
		btnZ.setEnabled(false);
	}
	
	public void clearPuzzle() {//Clears the puzzle.
		clearLetterPanel1();
		clearLetterPanel2();
		clearLetterPanel3();
		clearLetterPanel4();
		clearLetterPanel5();
		clearLetterPanel6();
		clearLetterPanel7();
		clearLetterPanel8();
		clearLetterPanel9();
		clearLetterPanel10();
		
		//Remove the "You Win" or "You Lose"
		if(win){
			toppanel.remove(youWin);//Removes Win
		}
		else if(lose){
			toppanel.remove(youLose);//Removes Lose
		}
		
		checkPuzzleClear();//Clears the puzzle by checking to make sure it actually happened.
		
		toppanel.revalidate();
		toppanel.repaint();
		
		frame.revalidate();
		frame.repaint();
	}
	
	public void checkPuzzleClear() {//Checks to make sure that the puzzle is clear.	
		clearCheckFunction(letterpanel_1);
		clearCheckFunction(letterpanel_2);
		clearCheckFunction(letterpanel_3);
		clearCheckFunction(letterpanel_4);
		clearCheckFunction(letterpanel_5);
		clearCheckFunction(letterpanel_6);
		clearCheckFunction(letterpanel_7);
		clearCheckFunction(letterpanel_8);
		clearCheckFunction(letterpanel_9);
		clearCheckFunction(letterpanel_10);
		
	}
	
	public void clearCheckFunction(LetterPanel x)//The function to check if it's clear.
	{
		Container check = x.getParent();
		
		if (check == null)
		{
			return;
		}
		else if(check != null)
		{
			check.remove(x);
			check.revalidate();
			check.repaint();
			
		}
	}
	
	public void clearBody() {//Clears the body images.
		bodypanel.removeAll();
		bodypanel.revalidate();
		bodypanel.repaint();
		toppanel.remove(bodypanel);
		toppanel.revalidate();
		toppanel.repaint();
		frame.validate();
	}
	
	//THE FOLLOWING CLEAR EACH LETTER PANEL INDIVIDUALY.
	public void clearLetterPanel1() {
		letterpanel_1.removeAll();
		letterpanel_1.revalidate();
		letterpanel_1.repaint();
		toppanel.remove(letterpanel_1);
		toppanel.revalidate();
		toppanel.repaint();
		frame.validate();
	}
	
	public void clearLetterPanel2() {
		letterpanel_2.removeAll();
		letterpanel_2.revalidate();
		letterpanel_2.repaint();
		toppanel.remove(letterpanel_2);
		toppanel.revalidate();
		toppanel.repaint();
		frame.validate();
	}
	
	public void clearLetterPanel3() {
		letterpanel_3.removeAll();
		letterpanel_3.revalidate();
		letterpanel_3.repaint();
		toppanel.remove(letterpanel_3);
		toppanel.revalidate();
		toppanel.repaint();
		frame.validate();
	}
	
	public void clearLetterPanel4() {
		letterpanel_4.removeAll();
		letterpanel_4.revalidate();
		letterpanel_4.repaint();
		toppanel.remove(letterpanel_4);
		toppanel.revalidate();
		toppanel.repaint();
		frame.validate();
	}
	
	public void clearLetterPanel5() {
		letterpanel_5.removeAll();
		letterpanel_5.revalidate();
		letterpanel_5.repaint();
		toppanel.remove(letterpanel_5);
		toppanel.revalidate();
		toppanel.repaint();
		frame.validate();
	}
	
	public void clearLetterPanel6() {
		letterpanel_6.removeAll();
		letterpanel_6.revalidate();
		letterpanel_6.repaint();
		toppanel.remove(letterpanel_6);
		toppanel.revalidate();
		toppanel.repaint();
		frame.validate();
	}
	
	public void clearLetterPanel7() {
		letterpanel_7.removeAll();
		letterpanel_7.revalidate();
		letterpanel_7.repaint();
		toppanel.remove(letterpanel_7);
		toppanel.revalidate();
		toppanel.repaint();
		frame.validate();
	}
	
	public void clearLetterPanel8() {
		letterpanel_8.removeAll();
		letterpanel_8.revalidate();
		letterpanel_8.repaint();
		toppanel.remove(letterpanel_8);
		toppanel.revalidate();
		toppanel.repaint();
		frame.validate();
	}
	
	public void clearLetterPanel9() {
		letterpanel_9.removeAll();
		letterpanel_9.revalidate();
		letterpanel_9.repaint();
		toppanel.remove(letterpanel_9);
		toppanel.revalidate();
		toppanel.repaint();
		frame.validate();
	}
	
	public void clearLetterPanel10() {
		letterpanel_10.removeAll();
		letterpanel_10.revalidate();
		letterpanel_10.repaint();
		toppanel.remove(letterpanel_10);
		toppanel.revalidate();
		toppanel.repaint();
		frame.validate();
	}

	public void setPuzzle() {//Sets up the puzzle.
		
		lose = false;//Set Lose to false
		win = false;//Set win to false
		
		paintPPoT(game.getPuzzleDef());
		
		int length;
		length = game.currentPuzzleLength();
		
		letterpanel_1 = new LetterPanel('_', 10);
		letterpanel_2 = new LetterPanel('_', 55);
		letterpanel_3 = new LetterPanel('_', 100);
		letterpanel_4 = new LetterPanel('_', 145);
		letterpanel_5 = new LetterPanel('_', 195);
		letterpanel_6 = new LetterPanel('_', 240);
		letterpanel_7 = new LetterPanel('_', 285);
		letterpanel_8 = new LetterPanel('_', 330);
		letterpanel_9 = new LetterPanel('_', 375);
		letterpanel_10 = new LetterPanel('_', 420);
		
		toppanel.add(letterpanel_1, new Integer(2));
		toppanel.add(letterpanel_2, new Integer(2));
		toppanel.add(letterpanel_3, new Integer(2));
		toppanel.add(letterpanel_4, new Integer(2));
		toppanel.add(letterpanel_5, new Integer(2));
		toppanel.add(letterpanel_6, new Integer(2));
		toppanel.add(letterpanel_7, new Integer(2));
		toppanel.add(letterpanel_8, new Integer(2));
		toppanel.add(letterpanel_9, new Integer(2));
		toppanel.add(letterpanel_10, new Integer(2));
		
		//Set all letter panels visibility to false
		setAllLetterPanelsFalse();
		
		//Revalidate Letter Panels
		revalidateLetterPanels();
		
		//Repaint Letter Panels
		repaintLetterPanels();
		
		
		

		
		for(int i = 0; i < length; i++) {
			
			if(i == 0){
				
				letterpanel_1.setVisible(true);
				
				
			}
			else if(i == 1){
				
				letterpanel_2.setVisible(true);
				
				
			}
			else if(i == 2){
				
				letterpanel_3.setVisible(true);
				
				
			}
			else if(i == 3){
				
				letterpanel_4.setVisible(true);
				
				
			}
			else if(i == 4){
				
				letterpanel_5.setVisible(true);
				
				
			}
			else if(i == 5){
				
				letterpanel_6.setVisible(true);
				
				
			}
			else if(i == 6){
				
				letterpanel_7.setVisible(true);
				
				
			}
			else if(i == 7){
				
				letterpanel_8.setVisible(true);
				
				
			}
			else if(i == 8){
				
				letterpanel_9.setVisible(true);
				
				
			}
			else if(i == 9){
				
				letterpanel_10.setVisible(true);
				
				
			}
		}
		
		revalidateLetterPanels();
		repaintLetterPanels();
		
		toppanel.revalidate();
		toppanel.repaint();
		
		frame.revalidate();
		frame.repaint();
	}
		
		public void repaintLetterPanels()
		{
			letterpanel_1.repaint();
			letterpanel_2.repaint();
			letterpanel_3.repaint();
			letterpanel_4.repaint();
			letterpanel_5.repaint();
			letterpanel_6.repaint();
			letterpanel_7.repaint();
			letterpanel_8.repaint();
			letterpanel_9.repaint();
			letterpanel_10.repaint();
		}
		
		public void revalidateLetterPanels()
		{
			letterpanel_1.revalidate();
			letterpanel_2.revalidate();
			letterpanel_3.revalidate();
			letterpanel_4.revalidate();
			letterpanel_5.revalidate();
			letterpanel_6.revalidate();
			letterpanel_7.revalidate();
			letterpanel_8.revalidate();
			letterpanel_9.revalidate();
			letterpanel_10.revalidate();
		}
		
		public void setAllLetterPanelsFalse()
		{
			letterpanel_1.setVisible(false);
			letterpanel_2.setVisible(false);
			letterpanel_3.setVisible(false);
			letterpanel_4.setVisible(false);
			letterpanel_5.setVisible(false);
			letterpanel_6.setVisible(false);
			letterpanel_7.setVisible(false);
			letterpanel_8.setVisible(false);
			letterpanel_9.setVisible(false);
			letterpanel_10.setVisible(false);
		}
		
		public void removeAllFromLetterPanels()
		{
			letterpanel_1.removeAll();
			letterpanel_2.removeAll();
			letterpanel_3.removeAll();
			letterpanel_4.removeAll();
			letterpanel_5.removeAll();
			letterpanel_6.removeAll();
			letterpanel_7.removeAll();
			letterpanel_8.removeAll();
			letterpanel_9.removeAll();
			letterpanel_10.removeAll();
		}
		
		public void removeLetterPanelsFromTopPanel()
		{
			toppanel.remove(letterpanel_1);
			toppanel.revalidate();
			toppanel.repaint();
			toppanel.remove(letterpanel_2);
			toppanel.revalidate();
			toppanel.repaint();
			toppanel.remove(letterpanel_3);
			toppanel.revalidate();
			toppanel.repaint();
			toppanel.remove(letterpanel_4);
			toppanel.revalidate();
			toppanel.repaint();
			toppanel.remove(letterpanel_5);
			toppanel.revalidate();
			toppanel.repaint();
			toppanel.remove(letterpanel_6);
			toppanel.revalidate();
			toppanel.repaint();
			toppanel.remove(letterpanel_7);
			toppanel.revalidate();
			toppanel.repaint();
			toppanel.remove(letterpanel_8);
			toppanel.revalidate();
			toppanel.repaint();
			toppanel.remove(letterpanel_9);
			toppanel.revalidate();
			toppanel.repaint();
			toppanel.remove(letterpanel_10);
			toppanel.revalidate();
			toppanel.repaint();
		}
		
		public void showAnswer() {
			
			clearPuzzle();
			
			String word = game.getPuzzleWord();
			
			char[] wordArray = word.toCharArray();
			
			for (int i=0;i < wordArray.length;i++) {
				
				char x = Character.toUpperCase(wordArray[i]);
				
				if(i == 0){
					letterpanel_1 = new LetterPanel(x, 10);
					letterpanel_1.setVisible(true);
					
					toppanel.add(letterpanel_1, new Integer(2));
				}
				if(i == 1){
					letterpanel_2 = new LetterPanel(x, 55);
					letterpanel_2.setVisible(true);
					
					toppanel.add(letterpanel_2, new Integer(2));
				}
				if(i == 2){
					letterpanel_3 = new LetterPanel(x, 100);
					letterpanel_3.setVisible(true);
					
					toppanel.add(letterpanel_3, new Integer(2));
				}
				if(i == 3){
					letterpanel_4 = new LetterPanel(x, 145);
					letterpanel_4.setVisible(true);
					
					toppanel.add(letterpanel_4, new Integer(2));
				}
				if(i == 4){
					letterpanel_5 = new LetterPanel(x, 195);
					letterpanel_5.setVisible(true);
					
					toppanel.add(letterpanel_5, new Integer(2));
				}
				if(i == 5){
					letterpanel_6 = new LetterPanel(x, 240);
					letterpanel_6.setVisible(true);
					
					toppanel.add(letterpanel_6, new Integer(2));
				}
				if(i == 6){
					letterpanel_7 = new LetterPanel(x, 285);
					letterpanel_7.setVisible(true);
					
					toppanel.add(letterpanel_7, new Integer(2));
				}
				if(i == 7){
					letterpanel_8 = new LetterPanel(x, 330);
					letterpanel_8.setVisible(true);
					
					toppanel.add(letterpanel_8, new Integer(2));
				}
				if(i == 8){
					letterpanel_9 = new LetterPanel(x, 375);
					letterpanel_9.setVisible(true);
					
					toppanel.add(letterpanel_9, new Integer(2));
				}
				if(i == 9){
					letterpanel_10 = new LetterPanel(x, 420);
					letterpanel_10.setVisible(true);
					
					toppanel.add(letterpanel_10, new Integer(2));
				}
			}
		}
		
		public void paintWinLose() {
			
			if(win)
			{
				//Tell the player they've won
				
				youWin.setFont(new Font("Tahoma", Font.PLAIN, 48));
				youWin.setForeground(Color.red);
				youWin.setHorizontalAlignment(SwingConstants.CENTER);
				youWin.setBounds(153, 90, 200, 52);
				toppanel.add(youWin, new Integer(2));
				
			}
			else if(lose)
			{
				//Tell the player they've lost.
				youLose.setFont(new Font("Tahoma", Font.PLAIN, 48));
				youLose.setForeground(Color.red);
				youLose.setHorizontalAlignment(SwingConstants.CENTER);
				youLose.setBounds(153, 90, 200, 52);
				toppanel.add(youLose, new Integer(2));
			}
			else System.out.println("Issue painting win/lose");
		}
		
		public void removePPot(String x) {
			
			char[] wordArray = x.toCharArray();
			
			char test = wordArray[1];
			
			if(test == 'e') {
				toppanel.remove(dPerson);
			}
			else if(test == 'l') {
				toppanel.remove(dPlace);
			}
			else if(test == 'h') {
				toppanel.remove(dThing);
			}
			
			toppanel.revalidate();
			toppanel.repaint();
		}
		public void paintPPoT(String x) {//Person Place or Thing, PPoT
			
			char[] wordArray = x.toCharArray();
			
			char test = wordArray[1];
			
			if(test == 'e') {
				//Print Person
				dPerson.setFont(new Font("Tahoma", Font.PLAIN, 32));
				dPerson.setForeground(Color.white);
				dPerson.setHorizontalAlignment(SwingConstants.LEFT);
				dPerson.setBounds(10, 750, 100, 55);
				toppanel.add(dPerson, new Integer(2));
				
			}
			else if(test == 'l') {
				//Print Place
				dPlace.setFont(new Font("Tahoma", Font.PLAIN, 32));
				dPlace.setForeground(Color.white);
				dPlace.setHorizontalAlignment(SwingConstants.LEFT);
				dPlace.setBounds(10, 750, 100, 55);
				toppanel.add(dPlace, new Integer(2));
				
			}
			else if(test == 'h') {
				//Print Thing
				dThing.setFont(new Font("Tahoma", Font.PLAIN, 32));
				dThing.setForeground(Color.white);
				dThing.setHorizontalAlignment(SwingConstants.LEFT);
				dThing.setBounds(10, 750, 100, 55);
				toppanel.add(dThing, new Integer(2));
				
			}
			
			
		}
		
		public void submitAnswer(char x)
		{
			int[] positions;//Holds the positions of correct letters
			boolean correct = game.playerTurn(x);
			
			//Submit the answer to the game
			if(correct)
			{
				positions = game.getCorrectPositions();
				
				for(int i = 0;i < positions.length;i++)
				{
					if(positions[i] == 1){
						clearLetterPanel1();
						
						letterpanel_1 = new LetterPanel(x, 10);
						letterpanel_1.setVisible(true);
						
						toppanel.add(letterpanel_1, new Integer(2));
					}
					if(positions[i] == 2){
						clearLetterPanel2();
						
						letterpanel_2 = new LetterPanel(x, 55);
						letterpanel_2.setVisible(true);
						
						toppanel.add(letterpanel_2, new Integer(2));
					}
					if(positions[i] == 3){
						clearLetterPanel3();
						
						letterpanel_3 = new LetterPanel(x, 100);
						letterpanel_3.setVisible(true);
						
						toppanel.add(letterpanel_3, new Integer(2));
					}
					if(positions[i] == 4){
						clearLetterPanel4();
						
						letterpanel_4 = new LetterPanel(x, 145);
						letterpanel_4.setVisible(true);
						
						toppanel.add(letterpanel_4, new Integer(2));
					}
					if(positions[i] == 5){
						clearLetterPanel5();
						
						letterpanel_5 = new LetterPanel(x, 195);
						letterpanel_5.setVisible(true);
						
						toppanel.add(letterpanel_5, new Integer(2));
					}
					if(positions[i] == 6){
						clearLetterPanel6();
						
						letterpanel_6 = new LetterPanel(x, 240);
						letterpanel_6.setVisible(true);
						
						toppanel.add(letterpanel_6, new Integer(2));
					}
					if(positions[i] == 7){
						clearLetterPanel7();
						
						letterpanel_7 = new LetterPanel(x, 285);
						letterpanel_7.setVisible(true);
						
						toppanel.add(letterpanel_7, new Integer(2));
					}
					if(positions[i] == 8){
						clearLetterPanel8();
						
						letterpanel_8 = new LetterPanel(x, 330);
						letterpanel_8.setVisible(true);
						
						toppanel.add(letterpanel_8, new Integer(2));
					}
					if(positions[i] == 9){
						clearLetterPanel9();
						
						letterpanel_9 = new LetterPanel(x, 375);
						letterpanel_9.setVisible(true);
						
						toppanel.add(letterpanel_9, new Integer(2));
					}
					if(positions[i] == 10){
						clearLetterPanel10();
						
						letterpanel_10 = new LetterPanel(x, 420);
						letterpanel_10.setVisible(true);
						
						toppanel.add(letterpanel_10, new Integer(2));
					}
				}
				
				if(game.checkPlayerWin())
				{
					lockButtons();
					win = true;
					score.incWins();
					//Player has won, display win.
					paintWinLose();
					updateWins();
				}
				
			}
			else if(!correct)
			{
				int b;
				
				b = game.getBodyPosition();
				
				if(b == 6)
				{
					lockButtons();
					lose = true;
					score.incLosses();
					//Player has lost, display lose.
					paintWinLose();
					updateLosses();
				}
				
				if(b == 1)
				{
					
					bodypanel = new BodyPanel(b);
					
					toppanel.add(bodypanel, new Integer(b+1));
					
					bodypanel.setVisible(true);
				}
				else if(b >= 2) {
					
					bodypanel.removeAll();
					bodypanel.revalidate();
					bodypanel.repaint();
					
					toppanel.remove(bodypanel);
					
					bodypanel = new BodyPanel(b);
					
					toppanel.add(bodypanel, new Integer(b+1));
					
					bodypanel.setVisible(true);
					
					frame.setSize(569, 1000);
				}
			}
			
		}


}
