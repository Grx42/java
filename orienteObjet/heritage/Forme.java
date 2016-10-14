package heritage;

import java.util.*;

public class Forme {

	protected int x, y;
	protected int couleur;

	public Forme() // constructeur
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Position en X : ");
		x = sc.nextInt();
		System.out.println("Position en Y : ");
		y = sc.nextInt();
		System.out.println("Couleur de la forme : ");
		couleur = sc.nextInt();
	}

    public Forme(int nx, int ny) // constructeur
	{
		x = nx;
		y = ny;
        Scanner sc = new Scanner(System.in);
		System.out.println("Couleur de la forme : ");
		couleur = sc.nextInt();
	}

    public Forme(int nx, int ny, int nc)
    {
        this(nx, ny);
        couleur = nc;
    }

	public void afficher() // affiche les donnees de la classe
	{
		System.out.println("Position en " + x + " " +  y);
		System.out.println("Couleur : " + couleur);
	}

	public void deplacer(int nx, int ny)	//deplace les coordonnes
	{										//de la forme en (nx, ny) passees em
		x = nx;								// parametre de la fonction
		y = ny;
	}

}
