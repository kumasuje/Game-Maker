package models;

import javax.swing.ImageIcon;

import helpers.Constants;

public class Brick extends Sprites implements Constants {
	
	private boolean destroyed = false;

	public Brick(int x, int y, int width, int height){
		super();
        setImage(new ImageIcon(this.getClass().getResource(Constants.PIC_BRICK)).getImage());
        destroyed = false;
	}
	
	 public void copy(Brick brick){
	    	
	    	this.dx = brick.dx;
	    	this.dy = brick.dy;
	    	this.height = brick.height;
	    	this.image = brick.image;
	    	this.destroyed = brick.destroyed;
	    	this.width = brick.width;
	    	this.x = brick.x;
	    	this.y = brick.y;
	    }
	 
	 public boolean isDestroyed() {
			return destroyed;
		}

		public void setDestroyed(boolean destroyed) {
			this.destroyed = destroyed;
		}
}
