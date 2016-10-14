package heritage;

import java.util.*;

public class Cercle extends Forme {

	private final static int TailleEcran = 600;
	private int r; //rayon

	public Cercle() // constructeur Cercle
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Rayon : ");
		r = rayonVerifie(sc.nextInt());
		sc.close();
	}

	public Cercle(int nx, int ny)
	{
		super(nx, ny);
		couleur = 10;
		r = 10;
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

	public void afficher() //affichage des donnees de la classe
	{
		//super.afficher();
		System.out.println("Rayon : " + r);
	}

	public double perimetre()
	{
		return 2*Math.PI*r;
	}

	public void agrandir(int nr)
	{
		r = rayonVerifie(r + nr);
	}
}
