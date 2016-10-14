package appliBanquaire;

import java.util.*;

public class CpteEpargne extends Compte {

		private float tauxEpargne;
		
		public float getTauxEpargne(){ return tauxEpargne; }
		
		public CpteEpargne()
		{
			super("Epargne");
			tauxEpargne = controleTaux();
		}
		
		
		public void afficherCpte()
		{
			super.afficherCpte();
			System.out.println("Taux d'epargne : " + tauxEpargne);
		}
	
		public float controleTaux()
		{
			float t;
			Scanner sc = new Scanner(System.in);
			
			do {
				System.out.println("Taux d'epargne : ");
				t = sc.nextFloat();
			} while (t < 0);
			
			return t;
		}
	
		/*private float tauxEpargne;

		public float getTauxEpargne(){ return tauxEpargne; }
		
		public void setTauxEpargne(float taux)
		{
			tauxEpargne = taux;
		}
		
		public CpteEpargne()
		{
			super();
			Scanner sc = new Scanner(System.in);
			System.out.println("Taux d'\ue009pargne");
			tauxEpargne = sc.nextFloat();
		}
		
		public void afficherCpte()
		{
			super.afficherCpte();
			System.out.println("Taux d'\ue009pargne : " + tauxEpargne);
		}
		
		public void appliquerTaux()
		{
			cpteCurrentValue = getCpteCurrentValue() * tauxEpargne;
		}*/
}
