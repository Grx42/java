package appliBanquaire;

import java.util.*;

public class Projet {

	public static byte menuPrincipal()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------");
		System.out.println("1. Creer un compte");
		System.out.println("2. Afficher un compte");
		System.out.println("3. Creer une ligne comptable");
		System.out.println("4. Sortir");
		System.out.println("5. De l'aide");
		System.out.println("Votre choix :");

		return sc.nextByte();
	}

	public static void alAide()
	{
		System.out.println("---------------------------------");
		System.out.println("Option 1. Pour creer un compte Courant entrer C ");
		System.out.println("          Pour creer un compte Joint entrer J ");
		System.out.println("          Pour creer un compte Epargne entrer E");
		System.out.print("          Puis, entrer le numero du compte, et");
		System.out.println(" sa premiere valeur creditee ");
		System.out.println("          Dans le cas d'un compte epargne, entrer le taux ");
		System.out.println("Option 2. Le systeme affiche les donnees du compte choisi ");
		System.out.println("Option 3. Ecrire une ligne comptable");
		System.out.println("Option 4. Pour quitter le programme");
		System.out.println("Option 5. Pour afficher de l'aide");
		System.out.println("---------------------------------");
	}

	public static void sortir()
	{
		System.out.println("---------------------------------");
		System.out.println("Le programme va se terminer, \u00e0 bient\u00f4t !");
		System.exit(0);
	}

	public static void main(String[] args) {
		byte choix;
		String numeroLu = "";
		Scanner sc = new Scanner(System.in);

		Compte compteBanquaire = new Compte();

		do {
			choix = menuPrincipal();
			switch (choix)
			{
				case 1:
					compteBanquaire.creerCpte();
					break;

				case 2:
					System.out.println("Quel compte souhaitez-vous afficher ? ");
					numeroLu = sc.nextLine();
					if(numeroLu.equals(compteBanquaire.numDeCompte))
						compteBanquaire.afficherCpte();
					else
						System.out.println("Le programme ne reconnait pas le compte " + numeroLu);
					break;

				case 3:
					System.out.println("Pour quel compte souhaitez-vous cr\u00e9er une ligne ? ");
					numeroLu = sc.nextLine();
					if(numeroLu.equals(compteBanquaire.numDeCompte))
						compteBanquaire.creerLigne();
					else
						System.out.println("Le programme ne reconnait pas le compte " + numeroLu);
					break;

				case 4:
					sortir();
					break;

				case 5:
					alAide();
					break;

				default:
					System.out.println("Le choix n'est pas valide. vtfe!");
					break;
			}
		} while (choix != 4);

	}

}
