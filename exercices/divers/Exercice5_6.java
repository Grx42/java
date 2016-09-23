package divers;

import java.util.*;

public class Exercice5_6 {

	public static int verifierAvecBornes(int a, int b)
	{
		Scanner sc = new Scanner(System.in);
		int valeur;
		do{
			System.out.println(">Entrez une valeur entiere");
			valeur = sc.nextInt();
		}while(valeur < a || valeur > b);
		return valeur;
	}

	public static int verifier(int a, int b)
	{
		Scanner sc = new Scanner(System.in);
		int valeur;
		do{
			System.out.println(">Entrez une valeur entiere");
			valeur = sc.nextInt();
		}while(valeur < a || valeur > b);
		return valeur;
	}

	public static void main(String[] args) {
		int valeur_de_retour;

		valeur_de_retour = verifierAvecBornes(10, 20);
		System.out.println(valeur_de_retour);
	}

}
