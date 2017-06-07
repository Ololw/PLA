package edu.coding.samples.game;

public class Coordonnees {

	public int x,y;
	
	public Coordonnees(int x, int y)
	{
		this.x = x; this.y = y;
	}
	
	public void addx(int n)
	{
		x = (x + n);
		if(x>Board.taille_max()-1)
			x = 0;
		else if(x<0)
			x = Board.taille_max()-1;
	}
	
	public void addy(int n)
	{
		y = (y + n);
		if(y>Board.taille_max()-1)
			y = 0;
		else if(y<0)
			y = Board.taille_max()-1;
	}
	
}
