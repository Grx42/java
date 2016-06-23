package divers;

import java.util.Scanner;

public class Equations2ndDegres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, x, x1, x2;
		double delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre une valeur pour 'a' :");
		a = sc.nextDouble();
		System.out.println("Entre une valeur pour 'b' :");
		b = sc.nextDouble();
		System.out.println("Entre une valeur pour 'c' :");
		c = sc.nextDouble();

		if (a == 0)
		{
			if(b == 0)
			{
				if (c == 0)
				{
					System.out.println("tout reel est solution");
				}
				else if (c != 0)
				{
					System.out.println("pas de solution");
				}
			}
			else if (b != 0)
			{
				x = -c / b;
				System.out.println("une seule soluce : " + x);
			}
		}
		else if (a != 0)
		{
			delta = b * b - (4 * a * c);
			if (delta >= 0)
			{
				x1 = (- b + Math.sqrt(delta)) / 2 * a;
				x2 = (- b - Math.sqrt(delta)) / 2 * a;
				System.out.println("Il y a deux solutions egales a " + x1 + " et " + x2);
			}
			else if (delta < 0)
			{
				System.out.println("pas de solution dans les reels");
			}
		}
	}

}
