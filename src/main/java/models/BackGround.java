package models;

import java.awt.Image;
import javax.swing.ImageIcon;
import helpers.Constants;

public class BackGround implements Constants{
	
	protected Image image;
	
	public BackGround(){
		setImage(new ImageIcon(this.getClass().getResource(Constants.PIC_BACKGROUND)).getImage());
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		
		this.image = new ImageIcon(this.getClass().getResource(Constants.PIC_BACKGROUND)).getImage();
		
	}

	
}
