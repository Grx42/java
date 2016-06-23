package encodageParDefaut;

import java.io.IOException;

public class EncodageParDefaut {

	public static void main(String[] args)
		throws java.io.IOException {

			String encodage = System.getProperty("file.encoding");
			System.out.println("Encodage par defaut : " + encodage);
			String proverbe = "Qui s\u00e8me le vent, r\u00e9colte la temp\u00eate ";
			String proverbeEncode = new String (proverbe.getBytes(), encodage);
			System.out.println("Proverbe : " + proverbeEncode);
		}
}
