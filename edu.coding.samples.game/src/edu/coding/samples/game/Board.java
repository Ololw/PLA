package edu.coding.samples.game;

import java.awt.Color;
import java.awt.Graphics;

public class Board {
	Color m_color;
	int taille_map = 720;
	int nb_cellule;
	int taille_cellule;
	
	
	public Board(int nb_cel)
	{	
		nb_cellule = nb_cel;
		taille_cellule = 720/(nb_cellule);
		System.out.println("taille cellule" + taille_cellule);
	}
	
	
	void paint(Graphics g)
	{	
		g.setColor(new Color(255, 255, 255));
		for(int x = 280; x < 280 + taille_map; x+=taille_cellule)
		{
			for(int  y = 0; y < taille_map; y+=taille_cellule)
			{
				g.drawRect(x, y, taille_cellule, taille_cellule);
			}
		}
		g.drawRect(1000, 720, 2, 2);
		g.drawRect(0, 0, 2, 2);
		g.drawRect(1280, 720, 2, 2);
	}
}
