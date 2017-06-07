package edu.coding.samples.game;

public class Screen_size {
	
	int height = GetScreenWorkingHeight();
	int width = GetScreenWorkingWidth();
	
	
	
	public static int GetScreenWorkingWidth() {
	    return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
	}

	public static int GetScreenWorkingHeight() {
	    return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
	}
	
	
}
