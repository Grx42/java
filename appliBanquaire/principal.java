package appliBanquaire;

import java.util.*;

public class principal {

	public static void main(String[] args) {

		String numCompte = null, numCompteInput, moyenPaiement, payTheme, payDate;
		float valeurPaiement = 0, tauxEpargne = 0;
		char compteType = 0;
		//date payDate;

		byte choix;
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Creer un compte");
		System.out.println("2. Afficher un compte");
		System.out.println("3. Creer une ligne comptable");
		System.out.println("4. Sortir");
		System.out.println("5. De l'aide");
		System.out.println("Votre choix :");
		choix = sc.nextByte();
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
				System.out.println("Veuillez saisir le numero du compte que vous souhaitez consulter :");
				sc.nextLine();
				numCompteInput = sc.nextLine();
				if (numCompteInput == numCompte)
				{
					System.out.print("Le compte numero " + numCompte + " est un compte ");
					if (compteType == 'C') System.out.println("courant.");
					else if (compteType == 'J') System.out.println("joint.");
					else if (compteType == 'E') System.out.println("epargne, dont le taux est " + tauxEpargne);
					System.out.println("La premiere valeur creditee est : " + valeurPaiement);
				}
				else
				{
					System.out.println("Le compte n'existe pas !");
				}
				break;
			case 3:
				System.out.println("Option non programm\u00e9e");
				break;
			case 4:
				System.exit(0);
				break;
			case 5:
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
				break;
			default:
				System.out.println("Le choix n'est pas valide. vtfe!");
				break;
		}




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
