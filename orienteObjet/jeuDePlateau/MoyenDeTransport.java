package jeuDePlateau;

public class MoyenDeTransport implements Deplacement {
	
	protected int x, y, vitesse;
	protected final static int vitesseInitiale = 10;
	
	public MoyenDeTransport(int nx, int ny)
	{
		x = nx;
		y = ny;
	}
	
	protected int limitation(int v, int vMax)
	{
		v *= vitesseInitiale;
		if(v < 0)
			return 0;
		else if(v > vMax)
			return vMax;
		else
			return v;
	}
	
	public void seDeplacer()
	{
		deplacementEnX();
		deplacementEnY();
	}
	
	public void afficher()
	{
		System.out.println("Le heros est en : " + x + ", " + y);
		System.out.println("Sa vitesse est : " + vitesse);
	}
	
	
}
