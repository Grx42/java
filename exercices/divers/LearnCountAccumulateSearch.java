package divers;

import java.util.*;

public class LearnCountAccumulateSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nbInput = 0, total = 0, min, max, userInput;
		double moyenne;

		System.out.println("Entrez un nombre.");
		userInput = sc.nextInt();
		min = userInput;
		max = userInput;

		do {
			if (userInput < min)
				min = userInput;
			else if (userInput > max)
				max = userInput;

			nbInput += 1;
			total += userInput;

			System.out.println("Si vous voulez continuer, entrez un autre chiffre. Sinon entrez le chiffre \"0\".");
			userInput = sc.nextInt();
		} while (userInput != 0);

		moyenne = (float) total / nbInput;
		System.out.println("Vous avez entr\u00e9 " + nbInput + " nombre(s)");
		System.out.println("La moyenne de ce(s) nombre(s) est " + moyenne);

	}

}

/*
variable compteur de nombre
variable total qui additionne chaque nombre
variable compteur du nombre le plus petit
variable compteur du nombre le plus grand
variable d'entree utilisateur

fait
	affiche une indication
	recupere l'entree utilisateur
	si compteur le plus petit et compteur le plus grand sont vides
		ajoute entree utiliseur aux deux
	sinon si entree utilisateur est plus petit que compteur le plus petit
		ajout entree utilisateur au compteur le plus petit
	sinon si entree utilisateur est plus grand que compteur le plus grand
		ajoute entree utilisateur au compteur le plus grand

	ajoute un au compteur de nombre
	ajoute l'entree utilisateur a la variable total

	affiche la valeur la plus grande
	affiche la valeur la plus petite

	calcule la moyenne en divisant le total par le compteur de nombre
	affiche le resultat de ce calcul
tant que entree utilisateur est differente de 0





*/
