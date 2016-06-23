package divers;

import java.util.*;

public class NommeurDeJour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte jour, mois;
		int annee, jourID;
		String jourNom = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue dans le Nomminateur de jours.");
		System.out.println("Entrez une annee :");
		annee = sc.nextInt();
		System.out.println("Entrez le numero d'un mois :");
		mois = sc.nextByte();
		System.out.println("Entrez le numero d'un jour (dans le mois) :");
		jour = sc.nextByte();
		System.out.println("Grace a la science, vous allez maintenant savoir quel jour correspond a cette date");
		if (mois >= 3)
		{
			jourID = (((23 * mois) / 9) + jour + 4 + annee + (annee / 4) - (annee / 100) + (annee / 400) - 2) % 7;
		}
		else
		{
			jourID = (((23 * mois) / 9) + jour + 4 + annee + ((annee - 1) / 4) - ((annee - 1) / 100) + ((annee - 1) / 400) - 2) % 7;
		}
		switch (jourID)
		{
			case 0:
				jourNom = "Dimanche";
				break;
			case 1:
				jourNom = "Lundi";
				break;
			case 2:
				jourNom = "Mardi";
				break;
			case 3:
				jourNom = "Mercredi";
				break;
			case 4:
				jourNom = "Jeudi";
				break;
			case 5:
				jourNom = "Vendredi";
				break;
			case 6 :
				jourNom = "Samedi";
				break;
			default :
				System.out.println("Tu ne me verras jamais !");
				break;
		}

		String[] tabMonth = {"janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "decembre"};

		System.out.println("Le " + jour + " " + tabMonth[mois - 1] + " de l'an " + annee + " etait un " + jourNom);
	}

}
