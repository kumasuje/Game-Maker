package views;

import java.awt.Color;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import helpers.Constants;
import models.Ball;
import models.Brick;
import models.Paddle;
import controllers.SpriteActionListenerController;

@SuppressWarnings("serial")
public class GameMakerView extends JPanel{

	Ball ball;
	Brick brick;
	Paddle paddle;
	JButton spriteImageButton;

	public GameMakerView() {
		
		this.setSize(Constants.GAMEMAKER_PANEL_WIDTH, Constants.GAMEMAKER_PANEL_HEIGHT);
		this.setBounds(0, 0, Constants.GAMEMAKER_PANEL_WIDTH, Constants.GAMEMAKER_PANEL_HEIGHT);
		this.setBackground(Color.PINK);
		ball = new Ball();
		paddle = new Paddle();
		brick = new Brick(Constants.GAMEMAKER_PANEL_HEIGHT/5,Constants.GAMEMAKER_PANEL_WIDTH/5,30,10);
		
	}
	

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addShanpes(){

		
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(0, 0, 0, 0);
		
		spriteImageButton = new JButton();
		try {
			Image img = ImageIO.read(getClass().getResource(Constants.PIC_GAMEMAKER));
			spriteImageButton.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		this.add(spriteImageButton,c);
		
		String[] sprites = { "Select Sprite", "Ball", "Brick", "Clock", "Paddle" };
		JComboBox spriteList = new JComboBox(sprites);
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		this.add(spriteList,c);
		ActionListener spriteListener = new SpriteActionListenerController(spriteList,spriteImageButton);
		spriteList.addActionListener(spriteListener);
		
		
		String[] sounds = { "Loud Ping", "Soft Ping" };
		JComboBox soundsList = new JComboBox(sounds);
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		this.add(soundsList,c);
		ActionListener soundListener = new SpriteActionListenerController(soundsList);
		soundsList.addActionListener(soundListener);
		
		
		String[] actions = { "Move Horizontal", "Move Vertical", "Bounce", "Blow up" };
		JComboBox actionsList = new JComboBox(actions);
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		this.add(actionsList,c);
		ActionListener actionsListener = new SpriteActionListenerController(actionsList);
		actionsList.addActionListener(actionsListener);
		
		
		String[] events = { "Key Press", "Mouse Move" };
		JComboBox eventsList = new JComboBox(events);
		c.gridx = 2;
		c.gridy = 2;
		c.gridwidth = 1;
		this.add(eventsList,c);
		ActionListener eventsListener = new SpriteActionListenerController(eventsList);
		eventsList.addActionListener(eventsListener);
		
		
		String[] backGround = { "Select BackGround","Bliss", "Azur" };
		JComboBox backGroundList = new JComboBox(backGround);
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		this.add(backGroundList,c);
		ActionListener backGroundListener = new SpriteActionListenerController(backGroundList);
		backGroundList.addActionListener(backGroundListener);
		
		
//		JPanel pane = new JPanel();
//		FlowLayout paneLayout = new FlowLayout();
//		pane.setLayout(paneLayout);
//		pane.add(paddleButton);
//		pane.add(brickButton);
//		pane.add(ballButton);
//		pane.add(brickButton);
//		JScrollPane scrollPane = new JScrollPane(pane);
//        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
//        scrollPane.setBounds(0, 0, 100, 100);
//        this.add(scrollPane);
//		
		
		}


}
