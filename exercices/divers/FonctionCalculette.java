package divers;

import java.util.*;

public class FonctionCalculette {

	public static void main(String[] args) {

		int a, b;
		Scanner sc = new Scanner(System.in);
		char choixMenu = menu();
		System.out.println("Entrez la premi\u00e8re valeur ");
		a = sc.nextInt();
		System.out.println("Entrez la seconde valeur ");
		b = sc.nextInt();
		double total = calculer(a, b, choixMenu);
		afficher(a, b, choixMenu, total);
	}

	public static double calculer(int x, int y, char c)
	{
		double resultat = 0;
		switch(c)
		{
			case '+' : resultat = x + y;
				break;
			case '-' : resultat = x - y;
				break;
			case '/' : resultat = x / y;
				break;
			case '*' : resultat = x * y;
				break;
			default : System.out.println("Erreur d'op\u00e9rateur.");
				break;
		}
		return resultat;
	}

	public static void afficher(int x, int y, char o, double t)
	{
		System.out.println(x + " " + o + " " + y + " = " + t);
	}

	public static char menu()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Je sais compter, entrez l'op\u00e9ration choisie");
		System.out.println(" + pour additionner ");
		System.out.println(" - pour soustraire ");
		System.out.println(" / pour diviser ");
		System.out.println(" * pour multiplier ");
		System.out.println(" (+, -, /, *) ? : ");
		char operation = sc.next().charAt(0);
		return operation;
	}
}
