package divers;

import java.util.Scanner;

public class CalcAnneeBissextiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte mois, nbJours = 0;
		short annee;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre un mois de 1 a 12");
		mois = sc.nextByte();
		System.out.println("Entre une annee");
		annee = sc.nextShort();
		switch (mois)
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				nbJours = 31;
				break;

			case 4: case 6: case 9: case 11:
				nbJours = 30;

			case 2:
				if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0)
					nbJours = 29;
				else
					nbJours = 28;
				break;

			default :
				System.out.println("Impossible, ce mois n'existe pas.");
				System.exit(0);
		}
		System.out.print("En " + annee + ", le mois n° " + mois);
		System.out.println(" a " + nbJours + " jours");
	}

}
