package training_Cercle;

import java.util.*;

public class FaireDesCerclesControles {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CercleControle A = new CercleControle();
		CercleControle B = new CercleControle(10, 10);
		CercleControle C = new CercleControle(10, 10, 30);

		A.afficher();

		B.afficher();
		B.setRayon();
		B.afficher();

		B.setRayon(50);
		B.afficher();

		C.afficher();
		/*System.out.println("Entrez une valeur d'agrandissement : ");
		int plus = sc.nextInt();
		A.agrandir(plus);

		System.out.println("Apres agrandissement : ");
		A.afficher();*/

	}

}
