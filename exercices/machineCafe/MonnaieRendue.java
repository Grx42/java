package machineCafe;

import java.util.*;

public class MonnaieRendue {

	public static void main(String[] args) {

		int prixCafe, totalRecu, monnaie, piece;
		int nbPiece, piece5, piece10, piece20, piece50, piece100, piece200, checkEnoughCoin;
		int cpt5, cpt10, cpt20, cpt50, cpt100, cpt200;
		boolean skip5, skip10, skip20, skip50, skip100, skip200;
		Scanner sc = new Scanner(System.in);

		prixCafe = 40;
		totalRecu = 0;
		monnaie = 0;
		nbPiece = 0;
		piece = 0;
		piece5 = 5;
		piece10 = 5;
		piece20 = 5;
		piece50 = 5;
		piece100 = 5;
		piece200 = 0;
		skip5 = false;
		skip10 = false;
		skip20 = false;
		skip50 = false;
		skip100 = false;
		skip200 = false;
		cpt200 = 0;
		cpt100 = 0;
		cpt50 = 0;
		cpt20 = 0;
		cpt10 = 0;
		cpt5 = 0;
		String resservir = "\0";

		do {
			System.out.println("La machine n'accepte que les pieces de 5, 10, 20, 50 centimes et les pieces de et 2 euro.");
			System.out.println("Le cafe coute 40 centimes. Veuillez introduire votre monnaie.");
			do {
				piece = sc.nextShort();
				if (piece == 5 || piece == 10 || piece == 20 || piece == 50 || piece == 100 || piece == 200)
				{
					totalRecu += piece;
					nbPiece += 1;
					switch (piece)
					{
						case 5:
							piece5 += 1;
							skip5 = false;
							break;
						case 10:
							piece10 += 1;
							skip10 = false;
							break;
						case 20:
							piece20 += 1;
							skip20 = false;
							break;
						case 50:
							piece50 += 1;
							skip50 = false;
							break;
						case 100:
							piece100 += 1;
							skip100 = false;
							break;
						case 200:
							piece200 += 1;
							skip200 = false;
							break;
						default :
							break;
					}
					piece = 0;
					System.out.println("Solde actuel : " + totalRecu);
				}
				else
				{
					System.out.println("Piece invalide.");
					piece = 0;
				}

				if (totalRecu < prixCafe)
				{
					System.out.println("Solde insuffisant, introduisez d'autres pieces.");
				}
			} while (totalRecu < prixCafe);

			if (totalRecu > prixCafe)
			{
				monnaie =  totalRecu - prixCafe;
				if (monnaie < 100)
				{
					System.out.println("Je vais vous rendre " + monnaie + " centimes");
				}
				else
				{
					System.out.println("Je vais vous rendre " + (monnaie / 100) + " euro et " + (monnaie % 100+ " centimes."));
				}

				do {

					if (monnaie >= 200 && piece200 > 0 && skip200 == false)
					{
						checkEnoughCoin = monnaie / 200;
						if (checkEnoughCoin < piece200)
						{
							piece200 -= checkEnoughCoin;
							cpt200 += checkEnoughCoin;
							monnaie = monnaie % 200;
						}
						else
						{
							skip200 = true;
							piece200 -= 1;
							cpt200 += 1;
							monnaie -= 200;
						}
						checkEnoughCoin = 0;
					}

					else if (monnaie >= 100 && piece100 > 0 && skip100 == false)
					{
						checkEnoughCoin = monnaie / 100;
						if (checkEnoughCoin < piece100)
						{
							piece100 -= checkEnoughCoin;
							cpt100 += checkEnoughCoin;
							monnaie = monnaie % 100;
						}
						else
						{
							skip100 = true;
							piece100 -= 1;
							cpt100 += 1;
							monnaie -= 100;
						}
						checkEnoughCoin = 0;
					}

					else if (monnaie >= 50 && piece50 > 0 && skip50 == false)
					{
						checkEnoughCoin = monnaie / 50;
						if (checkEnoughCoin < piece50)
						{
							piece50 -= checkEnoughCoin;
							cpt50 += checkEnoughCoin;
							monnaie = monnaie % 50;
						}
						else
						{
							skip50 = true;
							piece50 -= 1;
							cpt50 += 1;
							monnaie -= 50;
						}
						checkEnoughCoin = 0;
					}

					else if (monnaie >= 20 && piece20 > 0 && skip20 == false)
					{
						checkEnoughCoin = monnaie / 20;
						if (checkEnoughCoin < piece20)
						{
							piece20 -= checkEnoughCoin;
							cpt20 += checkEnoughCoin;
							monnaie = monnaie % 20;
						}
						else
						{
							skip20 = true;
							piece20 -= 1;
							cpt20 += 1;
							monnaie -= 20;
						}
						checkEnoughCoin = 0;
					}

					else if (monnaie >= 10 && piece10 > 0 && skip10 == false)
					{
						checkEnoughCoin = monnaie / 10;
						if (checkEnoughCoin < piece10)
						{
							piece10 -= checkEnoughCoin;
							cpt10 += checkEnoughCoin;
							monnaie = monnaie % 10;
						}
						else
						{
							skip10 = true;
							piece10 -= 1;
							cpt10 += 1;
							monnaie -= 10;
						}
						checkEnoughCoin = 0;
					}

					else if (monnaie >= 5 && piece5 > 0 && skip5 == false)
					{
						checkEnoughCoin = monnaie / 5;
						if (checkEnoughCoin < piece5)
						{
							piece5 -= checkEnoughCoin;
							cpt5 += checkEnoughCoin;
							monnaie = monnaie % 5;
						}
						else
						{
							skip5 = true;
							piece5 -= 1;
							cpt5 += 1;
							monnaie -= 5;
						}
						checkEnoughCoin = 0;
					}

				} while (monnaie > 0);

				if (cpt200 > 0)
					System.out.println(cpt200 + " piece(s) de 2 euro. ");
				if (cpt100 > 0)
					System.out.println(cpt100 + " piece(s) de 1 euro. ");
				if (cpt50 > 0)
					System.out.println(cpt50 + " piece(s) de 50 centimes. ");
				if (cpt20 > 0)
					System.out.println(cpt20 + " piece(s) de 20 centimes. ");
				if (cpt10 > 0)
					System.out.println(cpt10 + " piece(s) de 10 centimes. ");
				if (cpt5 > 0)
					System.out.println(cpt5 + " piece(s) de 5 centimes. ");

				cpt200 = 0;
				cpt100 = 0;
				cpt50 = 0;
				cpt20 = 0;
				cpt10 = 0;
				cpt5 = 0;

				System.out.println("Veuillez recuperer votre monnaie.");
			}
			System.out.println("Votre cafe est pret !");

/*
			System.out.println("*** Debug ***");
			System.out.println("Piece(s) de 5 centimes restante(s) : " + piece5);
			System.out.println("Piece(s) de 10 centimes restante(s) : " + piece10);
			System.out.println("Piece(s) de 20 centimes restante(s) : " + piece20);
			System.out.println("Piece(s) de 50 centimes restante(s) : " + piece50);
			System.out.println("Piece(s) de 1 euro restante(s) : " + piece100);
			System.out.println("Piece(s) de 2 euro restante(s) : " + piece200);

			System.out.println("Flag de skip pieces de 5 " + skip5);
			System.out.println("Flag de skip pieces de 10 " + skip10);
			System.out.println("Flag de skip pieces de 20 " + skip20);
			System.out.println("Flag de skip pieces de 50 " + skip50);
			System.out.println("Flag de skip pieces de 100 " + skip100);
			System.out.println("Flag de skip pieces de 200 " + skip200);
*/
			
			piece = 0;
			totalRecu = 0;

			System.out.println("Vous en voulez un autre ? (oui / non)");
			sc.nextLine();
			resservir = sc.nextLine();
			while (!resservir.equals("oui") && !resservir.equals("non"))
			{
				System.out.println("Erreur, vous en voulez un autre oui ou non ?");
				resservir = sc.nextLine();
			}

		} while (!resservir.equals("non"));

				System.exit(0);
	}
}
