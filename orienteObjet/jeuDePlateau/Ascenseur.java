package jeuDePlateau;

public class Ascenseur extends MoyenDeTransport {

	public Ascenseur(int xx, int yy)
	{
		super(xx, yy);
		vitesse = limitation(5, 50);
		System.out.println("Ascenseur : ");
		System.out.println("Vitesse = " + vitesse);
	}
	
	public void deplacementEnY()
	{
		y += vitesse;
		System.out.println("y : " + y);
	}
}
