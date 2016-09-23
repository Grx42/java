package divers;

import java.util.*;

public class Exercice5 {

	public static float pourcentage(int nbUtilisation, int nb_total)
	{
		float pourcentage_utilisation;
		pourcentage_utilisation = (float) nbUtilisation / (float) nb_total * 100.f;
		return pourcentage_utilisation;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nbCb, nbCheque, nbVirement, totalPaiement;
		System.out.println("Entrez le nombre de paiement par Carte Bleue :");
		nbCb = sc.nextInt();
		System.out.println("Entrez le nombre de paiement par Cheque :");
		nbCheque = sc.nextInt();
		System.out.println("Entrez le nombre de paiement par Virement :");
		nbVirement = sc.nextInt();
		totalPaiement = nbCb + nbCheque + nbVirement;
		System.out.println("Vous avez emis " + totalPaiement + " ordres de débit");
		System.out.print("dont ");

		float pcCb, pcCheque, pcVirement;
		pcCb = pourcentage(nbCb, totalPaiement);
		System.out.println(pcCb + " % par Carte Bleue");
		pcCheque = pourcentage(nbCheque, totalPaiement);
		System.out.println("     " + pcCheque + " % par Cheque");
		pcVirement = pourcentage(nbVirement, totalPaiement);
		System.out.println("     " + pcVirement + " % par Virement");

	}

}
