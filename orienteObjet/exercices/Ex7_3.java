package exercices;

import java.util.Scanner;

public class Ex7_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String mois = "";
		short annee;
		byte nbJours = 0;

		System.out.println("De quel mois s'agit-il ? : ");
		mois = sc.nextLine();
		System.out.println("De quelle ann\u00e9e ? : ");
		annee = sc.nextShort();

		mois = mois.toLowerCase();
		mois = mois.replace("é", "e");
		mois = mois.replace("è", "e");
		mois = mois.replace("ê", "e");
		mois = mois.replace("à", "a");
		mois = mois.replace("â", "a");
		mois = mois.replace("ù", "u");
		mois = mois.replace("ô", "o");

		switch (mois)
		{
			case "janvier": case "mars": case "mai": case "juillet": case "aout": case "octobre": case "decembre":
				nbJours = 31;
				break;

			case "avril": case "juin": case "septembre": case "novembre":
				nbJours = 30;
				break;

			case "fevrier":
				if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0)
					nbJours = 29;
				else
					nbJours = 28;
				break;

			default :
				System.out.println("Impossible, ce mois n'existe pas.");
				System.exit(0);
		}

		System.out.print("En " + annee + ", le mois de " + mois);
		System.out.println(" a " + nbJours + " jours");
	}

}
