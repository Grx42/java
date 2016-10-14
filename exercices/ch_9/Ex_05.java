package ch_9;

public class Ex_05 {

	public static void main(String[] args) {

		int tab[][] = new int[7][7]; 
		
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
