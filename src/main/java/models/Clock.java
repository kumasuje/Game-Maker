package models;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import helpers.Constants;

public class Clock extends Sprites implements Constants {
	 protected Color color;
	 private static final int MILLISEC_TO_SEC = 1000;
	    private int time;
	    
	    public Clock(int x, int y, int width, int height, Color color) {
	        super();
	        time = 0;
	    }
	   
	    public void draw(Graphics g) {
	    	g.setColor(color);
	        g.fillRect(x, y, width, height);

	        Font currentFont = g.getFont();
	        Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.4F);
	        g.setFont(newFont);
	        int mm = time / MILLISEC_TO_SEC / 60 % 60;
	        int ss = time / MILLISEC_TO_SEC % 60;
	        g.drawString(String.format("%02d:%02d", mm, ss), x, y);
	        g.setFont(currentFont);
	    }
	    
	    public void update(int timeStep) {
	        time = (time + timeStep) % (3600 * MILLISEC_TO_SEC);
	    }
	    
}
