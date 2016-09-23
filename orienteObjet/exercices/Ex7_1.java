package exercices;

import java.util.*;

public class Ex7_1 {

	public static void main(String[] args) {

		//declaration
		String phrase = "", phraseModif = "", comparaison = "";
		Scanner sc = new Scanner(System.in);
		int compteurDeLettre = 0;

		//partie a : demander la saisie d'une phrase
		System.out.println("Ecrivez une phrase.");
		phrase = sc.nextLine();

		//partie b : afficher la phrase en majuscule
		System.out.println(phrase.toUpperCase());

		//partie c : compter le nombre de 'a' et s'il y en a, les transformer en '*'
		for(int i = 0; i < phrase.length(); i++)
		{
			if (phrase.charAt(i) == 'a')
			{
				compteurDeLettre++;
			}
		}

		System.out.println(compteurDeLettre);

		if(compteurDeLettre > 0)
		{
			phraseModif = phrase.replace('a', '*');
		}
		System.out.println(phrase);
		System.out.println(phraseModif);

		//partie d : Tester si entre le 5e et 12e caractere se trouve une sequence saisie au clavier
		System.out.println("Entrer une phrase pour la comparer");
		comparaison = sc.nextLine();
		if(phrase.regionMatches(false, 5, comparaison, 0, 7))
		{
			System.out.println("La sequence s'y trouve !");
		}
		else
		{
			System.out.println("La sequence ne s'y trouve pas.");
		}
	}

}
