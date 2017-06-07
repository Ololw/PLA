package edu.coding.samples.game;

import java.awt.Color;
import java.awt.Graphics;

public class Board {
	Color m_color;
	Screen_size s = new Screen_size();
	int taille_map = s.height - 40; // Pourquoi 40 ? Mistere et boule de gomme 
	int nb_cellule;
	int taille_cellule;
	//cellule map[][];
	int offset = (s.width - taille_map)/2;
	
	
	public Board(int nb_cel)
	{	
		nb_cellule = nb_cel;
		taille_cellule = taille_map/(nb_cellule);
		System.out.println("taille cellule : " + taille_cellule);
		System.out.println("taille map:" + taille_map);
		
	}
	
	
	void paint(Graphics g)
	{	
		int  x,y;
		g.setColor(new Color(255, 255, 255));
		for(x = 0; x < nb_cellule; x++)
		{
			for(y = 0; y < nb_cellule; y++)
			{
				System.out.println("x:" + (offset + x*taille_cellule) + " " + "y:" + (y*taille_cellule));
				g.drawRect(offset + x*taille_cellule , y*taille_cellule, taille_cellule, taille_cellule);
			}
		}
	}
}
