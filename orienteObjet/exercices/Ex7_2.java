package exercices;

import java.util.*;

public class Ex7_2 {

	public static void main(String[] args) {

		String motActuel = "", motInfAlphab = "", motSupAlphab = "";
		Scanner sc = new Scanner(System.in);

		do{

			System.out.println("Entrez un mot. Entrez 'Fin' si vous voulez arr\u00eater.");
			motActuel = sc.nextLine();

			if (!motActuel.equals("Fin"))
			{

				if (motInfAlphab.isEmpty() && motSupAlphab.isEmpty())
				{
					motInfAlphab = motActuel;
					motSupAlphab = motActuel;
				}

				if (motActuel.compareTo(motInfAlphab) < 0)
				{
					motInfAlphab = motActuel;
				}
				else if (motActuel.compareTo(motSupAlphab) > 0)
				{
					motSupAlphab = motActuel;
				}

			}

		}while(!motActuel.equals("Fin"));

		System.out.println(motInfAlphab);
		System.out.println(motSupAlphab);

	}

}
