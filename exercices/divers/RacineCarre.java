package divers;

import java.util.Scanner;

public class RacineCarre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un chiffre");
		x = sc.nextDouble();
		if(x >= 0)
		{
			r = Math.sqrt(x);
		}
		else
		{
			r = Math.sqrt(-x);
		}
		System.out.println("Pour " + x + " le resultat est : " + r);
	}

}
