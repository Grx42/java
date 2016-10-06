package calculsGeometriques;

public class AppFinale {

	public static void main(String[] args) {

		Cercle A = new Cercle(5, 5, 10);
		
		A.afficher();
		if(A.perimetre() >= 0)
		{
			System.out.println("Le perimetre de A vaut " + A.perimetre());
		}
		else
		{
			System.out.println("Calcul impossible");
		}
		
		Forme F = new Forme(10, 10, 20);
		F.afficher();
		System.out.println(F.perimetre());
		if(F.perimetre() >= 0)
		{
			System.out.println("Le perimetre de F vaut " + F.perimetre());
		}
		else
		{
			System.out.println("Calcul impossible");
		}
	}

}
