package models;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import helpers.Constants;

public class Paddle extends Sprites implements Constants {

	public Paddle() {
        super();
        setImage(new ImageIcon(this.getClass().getResource(Constants.PIC_PADDLE)).getImage());
        reset();
    }

	 public void reset() {
		 	x = Constants.GAME_PANEL_WIDTH / 3;
	        y = Constants.GAME_PANEL_HEIGHT - 200;
	    }
	 
	 public void move() {
	        x += dx; 
	        if (x <= -width/2) x = -width/2;
	        if (x >= Constants.GAMEMAKER_PANEL_WIDTH-width/2) x = Constants.GAMEMAKER_PANEL_WIDTH-width/2;
	    }
	 
	 // Checks if the ball hit the paddle
    public boolean hitPaddle(int ballX, int ballY) {
        if ((ballX >= x) && (ballX <= x + width)
                && ((ballY >= y) && (ballY <= y + height))) {
            return true;
        }
        return false;
    }
    
    class KeyHandler extends KeyAdapter {
        // Start moving when left or right keys are pressed.
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_LEFT) dx = -2;
            if (key == KeyEvent.VK_RIGHT) dx = 2;
        }
        // Stop moving when left or right keys are released.
        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_LEFT) dx = 0;
            if (key == KeyEvent.VK_RIGHT) dx = 0;
        }
    }
   
    // This inner class handles the mouse events and updates the Paddle.
    class MouseHandler extends MouseAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {
            int mouseX = e.getX();
            // Set paddle position according to mouse position.
            setX(mouseX - width/2);
        }
    }
    
    public void copy(Paddle paddle){
    	
    	this.dx = paddle.dx;
    	this.dy = paddle.dy;
    	this.height = paddle.height;
    	this.image = paddle.image;
    	this.width = paddle.width;
    	this.x		= paddle.x;
    	this.y		= paddle.y;
    }
	 
}

