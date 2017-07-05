package models;

import java.awt.Image;

public class Sprites {

	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected int dx;
    protected int dy;
    protected Image image;
    
 // constructor
    public Sprites(){
    	x = 0;
    	y = 0;
    	dx = 1;
    	dy = 1;
    	width = 0;
    	height = 0;
    	image = null;
    }
    
    public Sprites(int x, int y, int width, int height){
    	setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }
	
    
    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	
}
