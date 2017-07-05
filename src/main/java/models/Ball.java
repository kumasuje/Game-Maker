package models;

import javax.swing.ImageIcon;
import helpers.Constants;

public class Ball extends Sprites implements Constants {

	public Ball() {
		super();
		dx = 2;
		dy = 2;
		setImage(new ImageIcon(this.getClass().getResource(Constants.PIC_BALL)).getImage());
		reset();
	}

	public void copy(Ball ball){
    	
    	this.dx = ball.dx;
    	this.dy = ball.dy;
    	this.height = ball.height;
    	this.image = ball.image;
    	this.width = ball.width;
    	this.x		= ball.x;
    	this.y		= ball.y;
    	
    }

	public void reset() {
		x = GAMEMAKER_PANEL_WIDTH/2;
		y = GAMEMAKER_PANEL_HEIGHT/2;

	}

	public void move(int timeStep) {
		x += dx * timeStep / Constants.SLOWDOWN;
		y += dy * timeStep / Constants.SLOWDOWN;
		if (x < 0) {
			x = 0;
			dx = -dx;
		}
	/*	if (x > WIDTH - width) {
		x = WIDTH - width;
			dx = -dx;
		}*/
		if (y <= 170) {
			y = 170;
			dy = -dy;
		}
	}

	

}
