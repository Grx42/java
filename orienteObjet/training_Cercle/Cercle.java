package training_Cercle;

import java.util.*;

public class Cercle {

	public final static int TailleEcran = 600;
    private int posX, posY, rayon;
    public static int nombre;

    public int getRayon()
    {
        return rayon;
    }

    public void setRayon()
    {
        rayon = rayonVerifie();
    }

    public void setRayon(int r)
    {
        rayon = rayonVerifie(r);
    }

    public int getPosX()
    {
        return posX;
    }

    public void setPosX(int x)
    {
        posX = x;
    }

    public int getPosY()
    {
        return posY;
    }

    public void setPosY(int y)
    {
        posY = y;
    }

    public Cercle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Position en X : ");
        posX = sc.nextInt();
        System.out.println("Position en Y : ");
        posY = sc.nextInt();
        rayon = rayonVerifie();
        nombre++;
    }

    public Cercle(int centreX, int centreY)
    {
        posX = centreX;
        posY = centreY;
    }

    public Cercle(int centreX, int centreY, int rayonCercle)
    {
        this(centreX, centreY);
        rayon = rayonVerifie(rayonCercle);
    }

	// Retourne le perimetre du cercle
	public double perimetre()
	{
		return 2*Math.PI*rayon;
	}

	//Deplace le centre du cercle en nx et ny. Les coords
	//sont passees en parametres a la fonction
	public void deplacer(int nx, int ny)
	{
		posX = nx;
		posY = ny;
	}

	public void echanger(Cercle autre)
	{
		int tmp;

		tmp = posX;
		posX = autre.posX;
		autre.posX = tmp;

		tmp = posY;
		posY = autre.posY;
		autre.posY = tmp;
	}

	//Affiche la position x,y et le rayon du cercle
	public void afficher()
	{
		System.out.println("Centre du cercle en " + getPosX() + ", " + getPosY());
		System.out.println("Rayon : " + getRayon());
	}

	//Augmente le rayon du cercle avec la valeur
	//passee en parametre
	public void agrandir(int nr)
	{
		if(getRayon() + nr < 0)
			setRayon(0);
		else if(getRayon() + nr > TailleEcran)
			setRayon(TailleEcran);
		else
			setRayon(getRayon() + nr);
	}

	private int rayonVerifie()
	{
		Scanner sc = new Scanner(System.in);
		int tmp;
		do {
			System.out.println("Rayon : ");
			tmp = sc.nextInt();
		} while (tmp < 0 || tmp > TailleEcran);
		return tmp;
	}

	private int rayonVerifie(int tmp)
	{
		if (tmp < 0) return 0;
		else if (tmp > TailleEcran) return TailleEcran;
		else return tmp;
	}
}
