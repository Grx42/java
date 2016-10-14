package heritage;

import java.util.*;

public class testHeritage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cercle A = new Cercle(10,10);
		Forme F = new Forme(20,20,3);

		A.afficher();
		F.afficher();
		sc.close();
	}

}
