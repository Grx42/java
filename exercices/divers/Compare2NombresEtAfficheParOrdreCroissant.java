package divers;

import java.util.Scanner;

public class Compare2NombresEtAfficheParOrdreCroissant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int entree1, entree2, varSpe;
		Scanner sc = new Scanner(System.in);
		System.out.println("entre sucessivement deux nombres");
		entree1 = sc.nextInt();
		entree2 = sc.nextInt();
		if (entree1 > entree2)
		{
			System.out.println(entree2);
			System.out.println(entree1);
			varSpe = entree1;
		}
		else
		{
			System.out.println(entree1);
			System.out.println(entree2);
			varSpe = entree2;
		}
		System.out.println("La plus grande valeur est : " + varSpe);
	}

}
