package divers;

import java.util.*;

public class Perimetre {
	public static void main(String[] args) {

		float cote, perimetre;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Valeur du cote : ");
		cote = userInput.nextFloat();
		perimetre = 4 * cote;
		System.out.println("Le carre de cote " + cote + " a pour perimetre " + perimetre);

	}
}
