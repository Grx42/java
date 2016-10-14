package training_Cercle;

public class CerclePrive {

    private int x, y, r;

    //Affiche la position x,y et le rayon du cercle
	private void afficher()
	{
		System.out.println("Centre du cercle en " + x + ", " + y);
		System.out.println("Rayon : " + r);
	}

	// Retourne le perimetre du cercle
	public double perimetre()
	{
		return 2*Math.PI*r;
	}

	//Deplace le centre du cercle en nx et ny. Les coords
	//sont passees en parametres a la fonction
	public void deplacer(int nx, int ny)
	{
		x = nx;
		y = ny;
	}

	//Augmente le rayon du cercle avec la valeur
	//passee en parametre
	public void agrandir(int nr)
	{
		r += nr;
	}

}
