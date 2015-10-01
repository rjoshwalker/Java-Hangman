/************************************************************/
/* Author: Robert Walker                                    */
/* Creation Date: April 20, 2015                            */
/* Due Date: April 30, 2015                                 */
/* Course: CSC243                                           */
/* Professor Name: Dr. Kaplan                               */
/* Assignment: #3                                           */
/* Filename: LetterPanel.java                               */
/* Purpose: This is used to create the panels for the       */
/* the letters that are displayed to the user for the word. */
/*                                                          */
/************************************************************/

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class LetterPanel extends JPanel {
	
	//Holds the image paths for the letters and _
	private static final String letter_ = "images/letters/_.png";
	private static final String letterA = "images/letters/A.png";
	private static final String letterB = "images/letters/B.png";
	private static final String letterC = "images/letters/C.png";
	private static final String letterD = "images/letters/D.png";
	private static final String letterE = "images/letters/E.png";
	private static final String letterF = "images/letters/F.png";
	private static final String letterG = "images/letters/G.png";
	private static final String letterH = "images/letters/H.png";
	private static final String letterI = "images/letters/I.png";
	private static final String letterJ = "images/letters/J.png";
	private static final String letterK = "images/letters/K.png";
	private static final String letterL = "images/letters/L.png";
	private static final String letterM = "images/letters/M.png";
	private static final String letterN = "images/letters/N.png";
	private static final String letterO = "images/letters/O.png";
	private static final String letterP = "images/letters/P.png";
	private static final String letterQ = "images/letters/Q.png";
	private static final String letterR = "images/letters/R.png";
	private static final String letterS = "images/letters/S.png";
	private static final String letterT = "images/letters/T.png";
	private static final String letterU = "images/letters/U.png";
	private static final String letterV = "images/letters/V.png";
	private static final String letterW = "images/letters/W.png";
	private static final String letterX = "images/letters/X.png";
	private static final String letterY = "images/letters/Y.png";
	private static final String letterZ = "images/letters/Z.png";
	
	//Turns the paths into buffered images.
	BufferedImage letter_buff__ = getImage(letter_);
	BufferedImage letter_buff_A = getImage(letterA);
	BufferedImage letter_buff_B = getImage(letterB);
	BufferedImage letter_buff_C = getImage(letterC);
	BufferedImage letter_buff_D = getImage(letterD);
	BufferedImage letter_buff_E = getImage(letterE);
	BufferedImage letter_buff_F = getImage(letterF);
	BufferedImage letter_buff_G = getImage(letterG);
	BufferedImage letter_buff_H = getImage(letterH);
	BufferedImage letter_buff_I = getImage(letterI);
	BufferedImage letter_buff_J = getImage(letterJ);
	BufferedImage letter_buff_K = getImage(letterK);
	BufferedImage letter_buff_L = getImage(letterL);
	BufferedImage letter_buff_M = getImage(letterM);
	BufferedImage letter_buff_N = getImage(letterN);
	BufferedImage letter_buff_O = getImage(letterO);
	BufferedImage letter_buff_P = getImage(letterP);
	BufferedImage letter_buff_Q = getImage(letterQ);
	BufferedImage letter_buff_R = getImage(letterR);
	BufferedImage letter_buff_S = getImage(letterS);
	BufferedImage letter_buff_T = getImage(letterT);
	BufferedImage letter_buff_U = getImage(letterU);
	BufferedImage letter_buff_V = getImage(letterV);
	BufferedImage letter_buff_W = getImage(letterW);
	BufferedImage letter_buff_X = getImage(letterX);
	BufferedImage letter_buff_Y = getImage(letterY);
	BufferedImage letter_buff_Z = getImage(letterZ);
	
	//Turns the buffered images into image icons.
	ImageIcon letter_img__ = new ImageIcon(letter_buff__);
	//JLabel letter_label__ = new JLabel(letter_img__);
	
	ImageIcon letter_img_A = new ImageIcon(letter_buff_A);
	//JLabel letter_label_A = new JLabel(letter_img_A);
	
	ImageIcon letter_img_B = new ImageIcon(letter_buff_B);
	//JLabel letter_label_B = new JLabel(letter_img_B);
	
	ImageIcon letter_img_C = new ImageIcon(letter_buff_C);
	//JLabel letter_label_C = new JLabel(letter_img_C);
	
	ImageIcon letter_img_D = new ImageIcon(letter_buff_D);
	//JLabel letter_label_D = new JLabel(letter_img_D);
	
	ImageIcon letter_img_E = new ImageIcon(letter_buff_E);
	//JLabel letter_label_E = new JLabel(letter_img_E);
	
	ImageIcon letter_img_F = new ImageIcon(letter_buff_F);
	//JLabel letter_label_F = new JLabel(letter_img_F);
	
	ImageIcon letter_img_G = new ImageIcon(letter_buff_G);
	//JLabel letter_label_G = new JLabel(letter_img_G);
	
	ImageIcon letter_img_H = new ImageIcon(letter_buff_H);
	//JLabel letter_label_H = new JLabel(letter_img_H);
	
	ImageIcon letter_img_I = new ImageIcon(letter_buff_I);
	//JLabel letter_label_I = new JLabel(letter_img_I);
	
	ImageIcon letter_img_J = new ImageIcon(letter_buff_J);
	//JLabel letter_label_J = new JLabel(letter_img_J);
	
	ImageIcon letter_img_K = new ImageIcon(letter_buff_K);
	//JLabel letter_label_K = new JLabel(letter_img_K);
	
	ImageIcon letter_img_L = new ImageIcon(letter_buff_L);
	//JLabel letter_label_L = new JLabel(letter_img_L);
	
	ImageIcon letter_img_M = new ImageIcon(letter_buff_M);
	//JLabel letter_label_M = new JLabel(letter_img_M);
	
	ImageIcon letter_img_N = new ImageIcon(letter_buff_N);
	//JLabel letter_label_N = new JLabel(letter_img_N);
	
	ImageIcon letter_img_O = new ImageIcon(letter_buff_O);
	//JLabel letter_label_O = new JLabel(letter_img_O);
	
	ImageIcon letter_img_P = new ImageIcon(letter_buff_P);
	//JLabel letter_label_P = new JLabel(letter_img_P);
	
	ImageIcon letter_img_Q = new ImageIcon(letter_buff_Q);
	//JLabel letter_label_Q = new JLabel(letter_img_Q);
	
	ImageIcon letter_img_R = new ImageIcon(letter_buff_R);
	//JLabel letter_label_R = new JLabel(letter_img_R);
	
	ImageIcon letter_img_S = new ImageIcon(letter_buff_S);
	//JLabel letter_label_S = new JLabel(letter_img_S);
	
	ImageIcon letter_img_T = new ImageIcon(letter_buff_T);
	//JLabel letter_label_T = new JLabel(letter_img_T);
	
	ImageIcon letter_img_U = new ImageIcon(letter_buff_U);
	//JLabel letter_label_U = new JLabel(letter_img_U);
	
	ImageIcon letter_img_V = new ImageIcon(letter_buff_V);
	//JLabel letter_label_V = new JLabel(letter_img_V);
	
	ImageIcon letter_img_W = new ImageIcon(letter_buff_W);
	//JLabel letter_label_W = new JLabel(letter_img_W);
	
	ImageIcon letter_img_X = new ImageIcon(letter_buff_X);
	//JLabel letter_label_X = new JLabel(letter_img_X);
	
	ImageIcon letter_img_Y = new ImageIcon(letter_buff_Y);
	//JLabel letter_label_Y = new JLabel(letter_img_Y);
	
	ImageIcon letter_img_Z = new ImageIcon(letter_buff_Z);
	//JLabel letter_label_Z = new JLabel(letter_img_Z);
	
	JLabel label;//Holds a label.
	
	
	public LetterPanel(char letter, int x) {//Constructor for the letter panel.

		new JPanel();
		setBounds(x, 800, 35, 50);//Sets the bounds for the panel.
		setOpaque(false);
		
		//Will assign a letter based on what is passed through to the instance.
		if(letter == '_') {
			label = new JLabel(letter_img__);
		}
		else if(letter == 'A') {
			label = new JLabel(letter_img_A);
		}
		else if(letter == 'B') {
			label = new JLabel(letter_img_B);
		}
		else if(letter == 'C') {
			label = new JLabel(letter_img_C);
		}
		else if(letter == 'D') {
			label = new JLabel(letter_img_D);
		}
		else if(letter == 'E') {
			label = new JLabel(letter_img_E);
		}
		else if(letter == 'F') {
			label = new JLabel(letter_img_F);
		}
		else if(letter == 'G') {
			label = new JLabel(letter_img_G);
		}
		else if(letter == 'H') {
			label = new JLabel(letter_img_H);
		}
		else if(letter == 'I') {
			label = new JLabel(letter_img_I);
		}
		else if(letter == 'J') {
			label = new JLabel(letter_img_J);
		}
		else if(letter == 'K') {
			label = new JLabel(letter_img_K);
		}
		else if(letter == 'L') {
			label = new JLabel(letter_img_L);
		}
		else if(letter == 'M') {
			label = new JLabel(letter_img_M);
		}
		else if(letter == 'N') {
			label = new JLabel(letter_img_N);
		}
		else if(letter == 'O') {
			label = new JLabel(letter_img_O);
		}
		else if(letter == 'P') {
			label = new JLabel(letter_img_P);
		}
		else if(letter == 'Q') {
			label = new JLabel(letter_img_Q);
		}
		else if(letter == 'R') {
			label = new JLabel(letter_img_R);
		}
		else if(letter == 'S') {
			label = new JLabel(letter_img_S);
		}
		else if(letter == 'T') {
			label = new JLabel(letter_img_T);
		}
		else if(letter == 'U') {
			label = new JLabel(letter_img_U);
		}
		else if(letter == 'V') {
			label = new JLabel(letter_img_V);
		}
		else if(letter == 'W') {
			label = new JLabel(letter_img_W);
		}
		else if(letter == 'X') {
			label = new JLabel(letter_img_X);
		}
		else if(letter == 'Y') {
			label = new JLabel(letter_img_Y);
		}
		else if(letter == 'Z') {
			label = new JLabel(letter_img_Z);
		}
		else System.out.println("Issue creating letter label.");
		
		add(label);
		
	}
	
	private BufferedImage getImage(String filename) {//Standard get image function for buffered image.
		
		try {
			InputStream in = getClass().getResourceAsStream(filename);
			return ImageIO.read(in);
		}
		catch (IOException e) {
			System.out.println("The image was not loaded.");
			System.exit(1);
		}
		return null;
	}

}
