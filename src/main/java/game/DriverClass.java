package game;

import java.awt.Color;

import java.awt.GridLayout;

import javax.swing.JFrame;

import helpers.Constants;
import views.GameMakerView;
import views.GamePanelView;

public class DriverClass {

	
	public static void main(String args[]){
		
		JFrame mainFrame = new JFrame("Game Maker");
		
		mainFrame.setLayout(new GridLayout(1, 2));
		
		GameMakerView gameMakerView = new GameMakerView();
		gameMakerView.addShanpes();
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GamePanelView gamePanelView = new GamePanelView();
		
		mainFrame.add(gameMakerView);
		mainFrame.add(gamePanelView);
		
		mainFrame.pack();
		mainFrame.setVisible(true);
		mainFrame.setSize(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
		mainFrame.setResizable(false);
		mainFrame.setBackground(Color.WHITE);
		
	}
}
