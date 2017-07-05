package views;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import dragtree.DropTargetComponent;
import helpers.Constants;
import models.BackGround;
import models.Ball;
import models.Brick;
import models.GameStatus;
import models.Paddle;

@SuppressWarnings("serial")
public class GamePanelView extends DropTargetComponent {
	
	Ball ball;
	Brick brick;
	Paddle paddle;
	BufferedImage image;
	BackGround backGround;
	GameStatus gameStatus;
	
	public GamePanelView(){

		this.setSize(Constants.GAME_PANEL_WIDTH, Constants.GAME_PANEL_HEIGHT);
		this.setBounds(Constants.FRAME_WIDTH/2, 0, Constants.GAME_PANEL_WIDTH, Constants.GAME_PANEL_HEIGHT);
		this.setBackground(Color.GRAY);
		backGround = new BackGround();

	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
	//	System.out.println(gameStatus.isGamePanelBackground());
		g2d.drawImage(backGround.getImage(), 0, 0, this);
		/*if(gameStatus.isGamePanelBackground()){
			g2d.drawImage(backGround.getImage(), 0, 0, this);
		}*/
		
	}
		
	public void init(){
		//mainFrame.add(this.gamePanel);
	}
	
}
