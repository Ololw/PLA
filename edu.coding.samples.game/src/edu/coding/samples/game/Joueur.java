package edu.coding.samples.game;

import java.awt.Color;
import java.awt.Graphics;
import edu.coding.samples.game.Personnage;

public class Joueur extends Personnage {
	
	public Coordonnees pos;
	public Orientation or;
	
	public Joueur(int x, int y)
	{
		pos = new Coordonnees(x,y);
		or = Orientation.Nord;
	}

	public boolean avancer(int n) {
		switch (or) {
		case Nord:
			if (Board.case_libre(pos.x, pos.y - n))
				pos.addy(-n); 
			return true;
		case Sud:
			if (Board.case_libre(pos.x, pos.y + n))
				pos.addy(n);
			return true;

		case Est:
			if (Board.case_libre(pos.x + n, pos.y))
				pos.addx(n);
			return true;

		case Ouest:
			if (Board.case_libre(pos.x - n, pos.y))
				pos.addx(-n);
			return true;
		}
		return false;
	}
	
	public boolean avancerDroite()
	{
		or = Orientation.Est;
		return avancer(1);
	}
	
	public boolean avancerGauche()
	{
		or = Orientation.Ouest;
		return avancer(1);
	}
		
	public boolean avancerHaut()
	{
		or = Orientation.Nord;
		return avancer(1);
	}
	
	public boolean avancerBas()
	{
		or = Orientation.Sud;
		return avancer(1);
	}
	public void paint(Graphics g)
	{
		g.setColor(new Color(255, 0, 0));
		g.drawRect(Board.offset + pos.x * Board.taille_cellule + 2, pos.y*Board.taille_cellule + 2, 15, 15);
	}
	
	
}
