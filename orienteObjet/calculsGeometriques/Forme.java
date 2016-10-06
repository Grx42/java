package calculsGeometriques;

import java.util.*;

public class Forme implements CalculGeometrique {
	
	protected int x, y, couleur;
	protected final static int largeurMax = 800, hauteurMax = 600, couleurMax = 10;
	
	
	public Forme()
	{
		x = verifier("Largeur", 0,largeurMax);
		y = verifier("Hauteur", 0, hauteurMax);
		couleur = verifier("Couleur", 0, couleurMax);
	}
	
	public Forme(int nx, int ny, int nc)
	{
		x = verifier(nx, 0, largeurMax);
		y = verifier(ny, 0, hauteurMax);
		couleur = verifier(nc, 0, couleurMax);
	}
	
	protected int verifier(String s, int a, int b)
	{
		Scanner sc = new Scanner(System.in);
		int resultat;
		
		do {
			System.out.println(s + " : ");
			resultat = sc.nextInt();
		} while (resultat < a || resultat > b);
		return resultat;
	}
	
	protected int verifier(int tmp, int a, int b)
	{
		if(tmp < a) { return a; }
		else if(tmp > b) { return b; }
		else { return tmp; }
	}
	
	public void deplacer(int nx, int ny)
	{
		x = verifier(x+nx, 0, largeurMax);
		y = verifier(y+ny, 0, hauteurMax);
	}
	
	public void colorier(int c)
	{
		couleur = verifier(c, 0, couleurMax);
	}
	
	public void afficher()
	{
		System.out.println("---------------------");
		System.out.println("Position X : " + x);
		System.out.println("Position Y : " + y);
		System.out.println("Couleur : " + couleur);
	}
}
