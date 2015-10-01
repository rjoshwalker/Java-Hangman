/************************************************************/
/* Author: Robert Walker                                    */
/* Creation Date: April 20, 2015                            */
/* Due Date: April 30, 2015                                 */
/* Course: CSC243                                           */
/* Professor Name: Dr. Kaplan                               */
/* Assignment: #3                                           */
/* Filename: BodyPanel.java                                 */
/* Purpose: This will create the panels for the body that   */
/* are displayed to the user when they select a letter      */
/* button that is not correct for the word.                 */
/************************************************************/

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class BodyPanel extends JPanel {
	
	//Holds the paths for the body images.
	private static final String Body_1 = "images/body/1.png";
	private static final String Body_2 = "images/body/2.png";
	private static final String Body_3 = "images/body/3.png";
	private static final String Body_4 = "images/body/4.png";
	private static final String Body_5 = "images/body/5.png";
	private static final String Body_6 = "images/body/6.png";
	
	//Turns the body images into buffered images.
	BufferedImage body_part_1 = getImage(Body_1);
	BufferedImage body_part_2 = getImage(Body_2);
	BufferedImage body_part_3 = getImage(Body_3);
	BufferedImage body_part_4 = getImage(Body_4);
	BufferedImage body_part_5 = getImage(Body_5);
	BufferedImage body_part_6 = getImage(Body_6);
	
	
	//Turns the buffered images into image icons.
	ImageIcon body_img_6 = new ImageIcon(body_part_6);
	ImageIcon body_img_5 = new ImageIcon(body_part_5);
	ImageIcon body_img_4 = new ImageIcon(body_part_4);
	ImageIcon body_img_3 = new ImageIcon(body_part_3);
	ImageIcon body_img_2 = new ImageIcon(body_part_2);
	ImageIcon body_img_1 = new ImageIcon(body_part_1);
	
	JLabel label;//Holds a label.
	
	
	public BodyPanel(int number) {//Constructor for the body panel.
		
		setBounds(205, 280, 157, 460);//Sets the bounds for the images.
		setOpaque(false);
		
		if(number == 1) {
			label = new JLabel(body_img_1);
		}
		else if(number == 2) {
			label = new JLabel(body_img_2);
		}
		else if(number == 3) {
			label = new JLabel(body_img_3);
		}
		else if(number == 4) {
			label = new JLabel(body_img_4);
		}
		else if(number == 5) {
			label = new JLabel(body_img_5);
		}
		else if(number == 6) {
			label = new JLabel(body_img_6);
		}
		
		add(label);
		
		//setVisible(true);
	}
	
	private BufferedImage getImage(String filename) {//Standard get image for the buffered images.
		
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
