package Moyenne;

import java.util.*;

public class Cursus {
	
	private Etudiant[] liste;
	
	public Cursus()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre d'etudiant : ");
		int nbEtudiants = sc.nextInt();
		liste = new Etudiant[nbEtudiants];
		for(int i = 0; i < liste.length; i++)
		{
			liste[i] = new Etudiant();
		}
	}
	
	public void afficheLesEtudiants()
	{
		for(Etudiant e : liste)
		{
			e.afficheUnEtudiant();
		}
	}
	
	private int ouEstLePlusPetit(int debut)
	{
		int indexDuMin = debut, j;
		
		for(j = debut+1; j < liste.length; j++)
		{
			if(liste[j].getMoyenne() < liste[indexDuMin].getMoyenne())
				indexDuMin = j;
		}
		return indexDuMin;
	}
	
	public void classerParMoyenne()
	{
		int indexDuPlusPetit;
		Etudiant tmp;
		for(int i = 0; i < liste.length; i++)
		{
			indexDuPlusPetit = ouEstLePlusPetit(i);
			tmp = liste[i];
			liste[i] = liste[indexDuPlusPetit];
			liste[indexDuPlusPetit] = tmp;
		}
	}
}
