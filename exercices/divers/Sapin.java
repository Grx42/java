package divers;

import java.util.*;

public class Sapin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("entre le nombre de ligne : ");
		int nbLigne = sc.nextInt();
		
		if(nbLigne < 1)
		{
			System.out.println("Le nombre de lignes doit etre superieur a 0");
			System.exit(0);
		}
		
		int nbCol = 2 * nbLigne - 1;
		
		int[][] sapin = new int[nbLigne][nbCol];
		int milieu = sapin[0].length / 2;
		
		for(int i = 0; i < sapin.length; i++)
		{
			for(int j = -i; j <= i; j++)
			{
				sapin[i][milieu+j] = 1;
			}
		}

		for(int k = 0; k < sapin.length; k++)
		{
			for(int l = 0; l < sapin[k].length; l++)
			{
				if(sapin[k][l] == 0)
					System.out.print(' ');
				else
					System.out.print('.');
			}
			System.out.println();
		}
		
		/*for(int p = 0; p < 20; p++)
		{
			int compteur[] = new int[5];
			for(int o = 0; o < 10000; o++)
			{
				int test = (int) (5 * Math.random() + 1);
				if(test > 4)
					compteur[4]++;
				else if(test > 3)
					compteur[3]++;
				else if(test > 2)
					compteur[2]++;
				else if(test > 1)
					compteur[1]++;
				else if(test > 0)
					compteur[0]++;
			}
			
			int boucleCount = 0;
			for(int valeur : compteur)
			{
				System.out.println("Il y a eu " + valeur + " nombre egaux a " + (boucleCount + 1));
				boucleCount++;
			}
			System.out.println("-------------------------------");
		}*/
		
		

	}

}
