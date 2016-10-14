package jeuDePlateau;

public class Fusee extends MoyenDeTransport {
	
	public Fusee(int xx, int yy)
	{
		super(xx, yy);
		vitesse = limitation(100, 1200);
		System.out.println("Fus\u00e9e");
		System.out.println("Vitesse = " + vitesse);
	}
	
	public void deplacementEnX()
	{
		x += vitesse;
		System.out.println("x : " + x);
	}
	
	public void deplacementEnY()
	{
		y += vitesse;
		System.out.println("y : " + y);
	}

}
