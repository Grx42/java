package Moyenne;

public class GestionCursus {

	public static void main(String[] args) {

		Cursus C = new Cursus();
		
		System.out.println("------------ Recap -----------");
		
		C.afficheLesEtudiants();
		C.classerParMoyenne();
		
		System.out.println("------------ Classement -----------");
		C.afficheLesEtudiants();
	}

}
