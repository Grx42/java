package calculsGeometriques;

import java.util.*;

public class Cercle extends Forme {
	
	private int r;
	
	public Cercle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Rayon : ");
		r = sc.nextInt();
	}
	
	public Cercle(int nx, int ny, int nc)
	{
		super(nx, ny, nc);
		Scanner sc = new Scanner(System.in);
		System.out.println("Rayon : ");
		r = sc.nextInt();
	}
	
	public Cercle(int nx, int ny, int nc, int nr)
	{
		super(nx, ny, nc);
		r = nr;
	}
	
	public void afficher()
	{
		super.afficher();
		System.out.println("Rayon : " + r);
	}
	
	public double surface()
	{
		return Math.PI * r * r;
	}
	
	public double perimetre()
	{
		return 2 * Math.PI * r;
	}
	
	public void agrandir()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("De combien voulez vous agrandir le cercle ? ");
		int augmentation = sc.nextInt();
		
		r += augmentation;
	}	
}
