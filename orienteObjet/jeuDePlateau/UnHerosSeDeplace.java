package jeuDePlateau;

public class UnHerosSeDeplace {

	public static void main(String[] args) {

		Voiture V = new Voiture(0, 0);
		V.afficher();
		V.seDeplacer();
		V.afficher();
		
		Ascenseur A = new Ascenseur(10, 10);
		A.afficher();
		A.seDeplacer();
		A.afficher();
		
		Fusee F = new Fusee(20, 20);
		F.afficher();
		F.seDeplacer();
		F.afficher();
		

	}

}
