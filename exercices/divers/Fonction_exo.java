package divers;

public class Fonction_exo {

	public static int f(int x)
	{
		int resultat;
		resultat = -x * x + 3 * x - 2;
		return resultat;
	}

	public static void main(String[] args) {

		int r, max = Integer.MIN_VALUE;

		for (int c = -5; c <= 5; c++)
		{
			r = f(c);
			System.out.println(r);
			if (max < r)
			{
				max = r;
			}
		}
		System.out.println("Le maximum est " + max);
	}

}
