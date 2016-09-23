package divers;

import java.util.*;

public class FactorielleIterative {

	public static void main(String[] args) {

		int a, i;
		long b = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("entre nombre pour calculer sa factorielle :");
		a = sc.nextInt();


		for (i = 2; i <= a; i++)
			b = b * i;

		System.out.println("R\u00e9sultat : " + b);

	}

}
