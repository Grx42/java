package divers;

public class Alphabet {

	public static void main(String[] args) {

		int i;
		char c;

		for (i = 1, c = 97; i <= 26; i++ )
		{
				System.out.print(c);
				c++;
		}
		System.out.print("\n");
		for (i = 26, c = 122; i >= 1; i--)
		{
			System.out.print(c);
			c--;
		}

	}

}
