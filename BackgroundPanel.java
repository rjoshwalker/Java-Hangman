/************************************************************/
/* Author: Robert Walker                                    */
/* Creation Date: April 20, 2015                            */
/* Due Date: April 30, 2015                                 */
/* Course: CSC243                                           */
/* Professor Name: Dr. Kaplan                               */
/* Assignment: #3                                           */
/* Filename: BackgroundPanel.java                           */
/* Purpose: This creates the background panel that holds    */
/* only the background image.                               */
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
public class BackgroundPanel extends JPanel {
	
	private static final String background = "images/background.png";//Holds the path to the background image.
	
	BufferedImage bg_buff = getImage(background);//Turns the image string into a buffered image.
	
	ImageIcon bg_img = new ImageIcon(bg_buff);//Creates an image icon from the buffered image.
	
	JLabel label;//Creates a label.
	
	public BackgroundPanel() {//Background Panel Constructor.
		setBounds(0, 0, 569, 1000);//Sets the bounds of the background.
		setOpaque(false);
		
		label = new JLabel(bg_img);//Creates the label from the image.
		
		add(label);//adds the label to the panel.
	}
	
	
	
	private BufferedImage getImage(String filename) {//This is a standard method from getting an image using a try..catch
		
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
