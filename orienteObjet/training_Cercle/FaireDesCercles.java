package training_Cercle;

import java.util.*;

public class FaireDesCercles
{

	public static void main(String[] args)
	{
		Cercle A = new Cercle();
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez la position x :");
		A.setPosX(sc.nextInt());

		System.out.println("Entrez la position y :");
		A.setPosY(sc.nextInt());

		System.out.println("Entrez le rayon du cercle :");
		A.setRayon(sc.nextInt());

		A.afficher();

		double p = A.perimetre();
		System.out.println("Votre cercle a pour perimetre : " + p);

		A.deplacer(5, 2);
		System.out.println("Apr\u00e8s d\u00e9placement : ");
		A.afficher();

		A.agrandir(10);
		System.out.println("Apr\u00e8s agrandissement : ");
		A.afficher();
	}

}
