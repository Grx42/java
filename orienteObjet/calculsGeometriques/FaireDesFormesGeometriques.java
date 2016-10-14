package calculsGeometriques;

import java.util.*;

public class FaireDesFormesGeometriques {

	public static void main(String[] args) {

		//Triangle T = new Triangle();
		
		/*Cercle cercleA = new Cercle(350, 350, 2, 60);
		Rectangle rectangleA = new Rectangle(150, 200, 10, 950, 800);*/
		
		/*cercleA.afficher();
		triangleA.afficher();
		rectangleA.afficher();
		
		cercleA.deplacer(10, 20);
		rectangleA.deplacer(10, 20);
		triangleA.deplacer(10, 20);
		
		cercleA.afficher();
		triangleA.afficher();
		rectangleA.afficher();
		
		System.out.println("Perimetre du cercle A : " + cercleA.perimetre());
		System.out.println("Perimetre du rectangle A : " + rectangleA.perimetre());*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre de cercles : ");
		int nbCercle = sc.nextInt();
		
		if(nbCercle < 4)
			nbCercle = 4;
		
		Cercle[] C = new Cercle[nbCercle];
		
		for(int i = 0; i < C.length; i++)
		{
			C[i] = new Cercle();
		}
		
		for(Cercle test : C)
		{
			test.afficher();
		}
		
		/*C[1].deplacer(20, 20);
		
		C[2].agrandir();
		
		Cercle tmp = C[0];
		C[0] = C[3];
		C[3] = tmp;*/
		
		
		//Permutation des cercles dans le tableau de cercle : C[0] est stocke C[1], C[1] dans C[2]..... C[3] dans C[0]
		Cercle permut = null;
		Cercle copie = null;
		
		for(int j = 0; j < C.length; j++)
		{
			if(j == 0)
			{
				copie = C[j+1];
				C[j+1] = C[j];
			}
			else if( j < C.length - 1)
			{
				permut = C[j+1];
				C[j+1] = copie;
				copie = permut;
			}
			else
			{
				C[0] = permut;
			}
		}
		
		for(Cercle test : C)
		{
			test.afficher();
		}
	}
}