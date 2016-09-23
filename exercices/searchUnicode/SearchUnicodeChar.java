package searchUnicode;

import java.util.*;

public class SearchUnicodeChar {

	public static void main(String[] args) {

		char c, findASCII;
		//char continuer;
		boolean foundASCII;
		Scanner sc = new Scanner(System.in);

		do{
			System.out.println("entre un caractere pour connaitre son code unicode :");
			c = sc.next().charAt(0);
			foundASCII = false;

			for (int i = 0; i <= 32767; i++)
			{
				findASCII = (char) i;
				if (findASCII == c)
				{
					System.out.print("Le code ASCII de " + findASCII);
					System.out.println(" est " + Integer.toString(i));
					System.out.print("Le code unicode de " + findASCII);
					System.out.println(" est \\u00" + Integer.toString(i,16));
					foundASCII = true;
					break;
				}
			}
			if (foundASCII == false)
			{
				System.out.println("Je n'ai rien trouvé... peut-être que ca vient de la langue systeme ?");
			}
			//System.out.println("Continuer ? o/n");
			//continuer = sc.next().charAt(0);
		}while(/*continuer == 'o'*/true);
	}

}
