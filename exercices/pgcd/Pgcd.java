package pgcd;
import java.util.*;


public class Pgcd {
	public static void main(String[] args) {
		int a, b, r;
		Scanner sc = new Scanner(System.in);

		System.out.println("Calculateur Plus Grand Diviseur Commun [PGCD]");
		System.out.println("Entrez un entier :");
		a = sc.nextInt();

		System.out.println("Entrez un entier :");
		b = sc.nextInt();

		do {
			r = a % b;
			a = b;
			b = r;
		} while (r != 0);

		System.out.println("Le PGCD est : " + a);
	}

}
