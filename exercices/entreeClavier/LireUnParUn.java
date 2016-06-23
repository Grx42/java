package entreeClavier;

public class LireUnParUn {

	public static void main(String[] args) throws java.io.IOException {
		
		char c = '\0';
		String test = "";
		int convString;
		while ( c != '\n')
		{
			c = (char) System.in.read();
			if (c != '\r' && c != '\n')
				test += c;
		}

		convString = Integer.parseInt(test);
		System.out.print(convString);

	}

}
