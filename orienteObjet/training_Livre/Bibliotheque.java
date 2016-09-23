package training_Livre;

import java.util.*;

public class Bibliotheque {

	public static void main(String[] args) {

		Livre livrePoche = new Livre();
		Scanner sc = new Scanner(System.in);
		String codeAlphaUnique = "";

		System.out.println("Entrez le titre du livre : ");
		livrePoche.setTitre(sc.nextLine());

		System.out.println("Entrez le nom de l'auteur : ");
		livrePoche.setNomAuteur(sc.nextLine());

		System.out.println("Entrez le prenom de l'auteur : ");
		livrePoche.setPrenomAuteur(sc.nextLine());

		System.out.println("Entrez la categorie du livre : ");
		livrePoche.setCategorie(sc.nextLine());

		System.out.println("Entrez le numero ISBN du livre : ");
		livrePoche.setISBN(sc.nextLine());

		codeAlphaUnique = livrePoche.calculerLeCode();
		livrePoche.setCodeAlphaUnique(codeAlphaUnique);

		livrePoche.afficherUnLivre();


	}

}
