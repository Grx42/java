package appliBanquaire;

import java.util.*;

public class principal {

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

	public static void afficherCpte(String n, char c, float v, float t)
	{
		Scanner sc = new Scanner(System.in);
		String numCompteInput;
		System.out.println("---------------------------------");
		System.out.println("Veuillez saisir le numero du compte que vous souhaitez consulter :");
		numCompteInput = sc.nextLine();
		if (n.equals(numCompteInput))
		{
			System.out.print("Le compte numero " + n + " est un compte ");
			if (c == 'C') System.out.println("courant.");
			else if (c == 'J') System.out.println("joint.");
			else if (c == 'E') System.out.println("epargne, dont le taux est " + t);
			System.out.println("La premiere valeur creditee est : " + v);
		}
		else
		{
			System.out.println("Le compte n'existe pas !");
		}
	}

	public static void main(String[] args) {
		String numCompte = null, moyenPaiement, payTheme, payDate;
		float valeurPaiement = 0, tauxEpargne = 0;
		char compteType = 0;
		byte choix;
		Scanner sc = new Scanner(System.in);

		do {
			choix = menuPrincipal();
			switch (choix)
			{
				case 1:
					System.out.println("Type du compte [Types possibles : C(ourant), J(oint), E(pargne)] :");
					compteType = sc.next().charAt(0);
					while (compteType != 'C' && compteType != 'J' && compteType != 'E')
					{
						System.out.println("Choix invalide, veuillez recommencer : C(ourant), J(oint), E(pargne)");
						compteType = sc.next().charAt(0);
					}
					System.out.println("Numero du compte :");
					sc.nextLine();
					numCompte = sc.nextLine();
					System.out.println("Premiere valeur creditee :");
					valeurPaiement = sc.nextFloat();
					if (compteType == 'E')
					{
						System.out.println("Taux de placement :");
						tauxEpargne = sc.nextFloat();
					}
					System.out.print("Recapitulatif : ");
					System.out.println("Type du compte : " + compteType);
					System.out.println("Numero du compte : " + numCompte);
					System.out.println("Premiere valeur creditee : " + valeurPaiement);
					if (compteType == 'E')
					{
						System.out.println("Taux de placement : " + tauxEpargne);
					}
					break;
				case 2:
					afficherCpte(numCompte, compteType, valeurPaiement, tauxEpargne);
					break;
				case 3:
					System.out.println("Option non programm\u00e9e");
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



/*
		Scanner sc = new Scanner(System.in);
		int nbCb, nbCheque, nbVirement, totalPaiement;
		System.out.println("Entrez le nombre de paiement par Carte Bleue :");
		nbCb = sc.nextInt();
		System.out.println("Entrez le nombre de paiement par Cheque :");
		nbCheque = sc.nextInt();
		System.out.println("Entrez le nombre de paiement par Virement :");
		nbVirement = sc.nextInt();
		totalPaiement = nbCb + nbCheque + nbVirement;
		System.out.println("Total de paiement : " + totalPaiement);

		float pcCb, pcCheque, pcVirement;
		pcCb = (float) nbCb / totalPaiement * 100.f;
		System.out.println("Pourcentage d'utilisation de la carte bleue " + pcCb);
		pcCheque = (float) nbCheque / totalPaiement * 100.f;
		System.out.println("Pourcentage d'utilisation des cheques " + pcCheque);
		pcVirement = (float) nbVirement / totalPaiement * 100.f;
		System.out.println("Pourcentage d'utilisation des virements " + pcVirement);
*/
	}

}
