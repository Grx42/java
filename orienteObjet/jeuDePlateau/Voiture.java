package jeuDePlateau;

public class Voiture extends MoyenDeTransport {
	
	public Voiture(int xx, int yy)
	{
		super(xx, yy);
		vitesse = limitation(10, 100);
		System.out.println("Voiture");
		System.out.println("Vitesse : " + vitesse);
	}
	
	public void deplacementEnX()
	{
		x += vitesse;
		System.out.println("x : " + x);
	}
	
}
