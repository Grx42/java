package divers;

import java.util.*;

public class Devinette {

	public static void main(String[] args) {

		int i = (int) (50 * Math.random()), compteurLoop = 0, userInput = -1;
		Scanner sc = new Scanner(System.in);



		while (compteurLoop == 0 || userInput !=  i)
		{
			System.out.println("Entre un nombre de 1 \u00e0 10");
			userInput = sc.nextInt();
			compteurLoop += 1;
			if (userInput != i)
			{
				System.out.println("Rat\u00e9, recommence");
				if (i > userInput)
					System.out.println("Le nombre \u00e0 trouver est plus grand.");
				else if (i < userInput)
					System.out.println("le nombre \u00e0 trouver est plus petit");
			}
		}

		System.out.println("Bravo t'as gagn\u00e9");
		System.out.println("Tu as r\u00e9ussi en " + compteurLoop + " fois.");
	}

}
