package calculsGeometriques;

public class FaireDesFormesGeometriques {

	public static void main(String[] args) {

		Cercle cercleA = new Cercle(350, 350, 2, 60);
		Triangle triangleA = new Triangle(150, 150, 3, 200, 300, 400, 600);
		Rectangle rectangleA = new Rectangle(150, 200, 10, 950, 800);
		
		cercleA.afficher();
		triangleA.afficher();
		rectangleA.afficher();
		
		cercleA.deplacer(10, 20);
		rectangleA.deplacer(10, 20);
		triangleA.deplacer(10, 20);
		
		cercleA.afficher();
		triangleA.afficher();
		rectangleA.afficher();
		
		System.out.println("Perimetre du cercle A : " + cercleA.perimetre());
		System.out.println("Perimetre du rectangle A : " + rectangleA.perimetre());
	}

}
