package Moyenne;

import java.util.*;

public class Etudiant {
	
	private String nom, prenom;
	private double[] notes;
	private double moyenne;
	
	public Etudiant()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nom de l'etudiant : ");
		nom = sc.nextLine();
		
		System.out.println("Prenom de l'etudiant : ");
		prenom = sc.nextLine();
		
		System.out.print("Combien de notes pour l'etudiant ");
		System.out.println(prenom + " " + nom + " : ");
		int nombre = sc.nextInt();
		
		notes = new double[nombre];
		for(int i = 0; i < notes.length; i++)
		{
			System.out.println("Entrez la note n° " + (i+1) + " : ");
			notes[i] = sc.nextDouble();
		}
		
		moyenne = calculMoyenne();
	}
	
	private double calculMoyenne()
	{
		double somme = 0.0;
		for(double valeurNote : notes)
		{
			somme += valeurNote;
		}
		return somme / notes.length;
	}
	
	public void afficheUnEtudiant()
	{
		System.out.println("Les notes de " + nom + " " + prenom + " sont :");
		for(double valeurNote : notes)
		{
			System.out.println(" " + valeurNote);
		}
		System.out.println();
		System.out.println("Sa moyenne vaut : " + moyenne);
	}
	
	public double getMoyenne()
	{
		return moyenne;
	}
}
