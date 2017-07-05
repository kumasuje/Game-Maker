package controllers;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import helpers.Constants;
import models.GameStatus;

public class SpriteActionListenerController implements ActionListener{
	private JComboBox combo;
	private GameStatus gameStatus;
	private JPanel panel;
	JButton button;

	public SpriteActionListenerController(JComboBox combo) {
		this.combo = combo;
	}
	
	
	public SpriteActionListenerController(JComboBox combo, JButton button) {
		this.combo = combo;
		this.button = button;
	}


	public void actionPerformed(ActionEvent e) {
	
        String stringName = (String) this.combo.getSelectedItem();
        System.out.println(stringName);
       /* if(str == "Bliss"){
        	gameStatus.setGamePanelBackground(true);
        	}*/
        
        if(stringName == "Select Sprite"){
			try {
				
				Image img = ImageIO.read(getClass().getResource(Constants.PIC_GAMEMAKER));
				button.setIcon(new ImageIcon(img));
			} catch (IOException ex) {
			}
		}
        
        else if(stringName == "Brick"){
			try {
				Image img = ImageIO.read(getClass().getResource(Constants.PIC_BRICK));
				button.setIcon(new ImageIcon(img));
			} catch (IOException ex) {
			}
		}
        
        else if(stringName == "Ball"){
			try {
				Image img = ImageIO.read(getClass().getResource(Constants.PIC_BALL));
				button.setIcon(new ImageIcon(img));
			} catch (IOException ex) {
			}
		}
        
        else if(stringName == "Paddle"){
			try {
				Image img = ImageIO.read(getClass().getResource(Constants.PIC_PADDLE));
				button.setIcon(new ImageIcon(img));
			} catch (IOException ex) {
			}
		}
      
	}

}
