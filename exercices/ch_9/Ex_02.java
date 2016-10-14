package ch_9;

public class Ex_02 {

	public static void main(String[] args) {

		if(args.length > 0)
		{
			int[] valeurs = new int[args.length];
			int i = 0;
			for(String v : args)
			{
				valeurs[i] = Integer.parseInt(v);
				i++;
			}
			
			int somme = somme(valeurs);
			double moyenne = moyenne(valeurs);
			int valLaPlusGrande = laPlusGrande(valeurs);
			int positionDeLaPlusGrande = posDeLaPlusGrande(valeurs);
			int nbValSup = affNbValSupMoyenne(valeurs);
			
			System.out.println("La somme de ces valeurs est : " + somme);
			System.out.println("La moyenne de ces valeurs est : " + moyenne);
			System.out.println("La plus grande de ces valeurs est : " + valLaPlusGrande);
			System.out.println("La position de la plus grande valeur est a l'index " + positionDeLaPlusGrande + " dans le tableau.");
			System.out.println("Elle est en position " + (positionDeLaPlusGrande + 1) + " dans la liste de parametres.");
			System.out.println("Nombre de valeurs superieures a la moyenne : " + nbValSup);
		}
		else
		{
			System.out.println("Pas d'arguments en parametre.");
		}
	}
	
	public static int somme(int[] t)
	{
		int resultat = 0;
		for(int val : t)
		{
			resultat += val;
		}
		return resultat;
	}

	public static double moyenne(int[] t)
	{
		int somme = somme(t);
		double resultat = (double) (somme / t.length);
		return resultat;
	}
	
	public static int laPlusGrande(int[] t)
	{
		int plusGrande = 0;
		for(int val : t)
		{
			if(val > plusGrande)
			{
				plusGrande = val;
			}
		}
		return plusGrande;
	}
	
	public static int posDeLaPlusGrande(int[] t)
	{
		int position = 0;
		int plusGrande = 0;
		int i = 0;
		for(int val : t)
		{
			if(val > plusGrande)
			{
				plusGrande = val;
				position = i;
			}
			i++;
		}
		return position;
	}
	
	public static int affNbValSupMoyenne(int[] t)
	{
		double moyenne = moyenne(t);
		int nbValSupMoyenne = 0;
		for(int val : t)
		{
			if(val > moyenne)
			{
				nbValSupMoyenne++;
			}
		}
		return nbValSupMoyenne;
	}
}
