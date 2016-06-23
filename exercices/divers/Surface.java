package divers;

import java.util.Scanner;

public class Surface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float longueur, largeur, surface;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Entre la longueur :");
		longueur = userInput.nextFloat();
		System.out.println("Entre la largeur :");
		largeur = userInput.nextFloat();
		surface = longueur * largeur;
		System.out.println("Le rectangle de longueur " + longueur + " et de largeur " + largeur + " a une surface de " + surface);
	}

}
