package training_Cercle;

public class EchangerDesCercles {

	public static void main(String[] args) {

		Cercle A = new Cercle();
		System.out.println("Le cercle A : ");
		A.afficher();

		Cercle B = new Cercle();
		System.out.println("Le cercle B : ");
		B.afficher();

		B.echanger(A);
		System.out.println("Apres echange :");
		System.out.println("Le cercle A :");
		A.afficher();
		System.out.println("Le cercle B :");
		B.afficher();
	}

}
