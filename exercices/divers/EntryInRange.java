package divers;

import java.io.InputStream;
import java.util.*;

public class EntryInRange {

	public static void main(String[] args) {

		int input;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Saisissez une valeur enti\u00e8re :");
			input = sc.nextInt();

		} while (input < 0 || input > 100);

	}

}
