package divers;

import java.util.Scanner;

public class CalculatriceDeBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nb1, nb2, total = 0.0;
		char operateur;
		boolean ok = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre un chiffre ");
		nb1 = sc.nextDouble();
		System.out.println("Entre un autre chiffre ");
		nb2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Entre le signe d'operation (+*-/) ");
		operateur = sc.next().charAt(0);
		switch (operateur)
		{
			case '+':
				total = nb1 + nb2;
				break;
			case '-':
				total = nb1 - nb2;
				break;
			case '*':
				total = nb1 * nb2;
				break;
			case '/':
				if (nb2 == 0)
				{
					ok = false;
				}
				else
				{
					total = nb1 / nb2;
				}
				break;
			default:
				ok = false;
				break;
		}
		if (ok)
		{
			System.out.println("Le total est : " + total);
		}
		else
		{
			System.out.println("Erreur d'operation");
		}
	}

}
