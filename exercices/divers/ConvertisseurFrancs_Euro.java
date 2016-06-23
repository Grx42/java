package divers;

import java.util.Scanner;

public class ConvertisseurFrancs_Euro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float euro, francs, txConv = 6.55957f;
		Scanner userInput = new Scanner(System.in);
		System.out.println("montant en francs");
		francs = userInput.nextFloat();
		euro = francs / txConv;
		System.out.println("resultat en euro = " + euro);
	}

}
