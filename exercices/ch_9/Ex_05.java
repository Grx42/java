package ch_9;

import java.util.*;

import com.sun.glass.ui.Size;

public class Ex_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 0;
		do {
			System.out.println("Entrez la taille de l'ast\u00e9risque : (impair)");
			size = sc.nextInt();
		} while (size % 2 != 1);
			
		
		int tab[][] = new int[size][size]; 
		
		int milieu = tab.length / 2;
		
		for(int i = 0; i < tab.length; i++)
		{
			for(int j = 0; j < tab.length; j++)
			{
				if(i == milieu || j == milieu)
				{
					tab[i][j] = 1;
				}
				else if(i == j)
				{
					tab[i][j] = 1;
				}	
				else
				{
					tab[i][tab.length - 1 - i] = 1;	
				}
			}
		}

		for(int i = 0; i < tab.length; i++)
		{
			for(int j = 0; j < tab.length; j++)
			{
				if(tab[i][j] == 1)
				{
					System.out.print('*');
				}
				else
				{
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		
	}

}
