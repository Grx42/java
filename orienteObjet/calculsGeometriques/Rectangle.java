package calculsGeometriques;

import java.util.*;

public class Rectangle extends Forme {

	private int largeur, hauteur;
	
	public Rectangle()
	{	
		largeur = verifier("Largeur", 0, largeurMax);
		hauteur = verifier("Hauteur", 0, hauteurMax);
	}
	
	public Rectangle(int nx, int ny, int nc, int la, int ha)
	{
		super(nx, ny, nc);
		largeur = verifier(la, 0, largeurMax);
		hauteur = verifier(ha, 0, hauteurMax);
	}
	
	public void afficher()
	{
		super.afficher();
		System.out.println("Largeur : " + largeur);
		System.out.println("Hauteur : " + hauteur);
	}
	
	public double perimetre()
	{
		return (largeur + hauteur) * 2;
	}
	
	public double surface()
	{
		return largeur * hauteur;
	}
}
