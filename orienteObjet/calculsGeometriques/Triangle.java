package calculsGeometriques;

import java.util.*;

public class Triangle extends Forme {

	private int aX, aY, bX, bY, cX, cY;
	
	public Triangle()
	{
		super();
		aX = verifier(x, 0, largeurMax);
		aY = verifier(y, 0, hauteurMax);
		
		bX = verifier("bX", 0, largeurMax);
		bY = verifier("bY", 0, hauteurMax);
		
		cX = verifier("cX", 0, largeurMax);
		cY = verifier("cY", 0, hauteurMax);
	}
	
	public Triangle(int nx, int ny, int nc, int nbx, int nby, int ncx, int ncy)
	{
		super(nx, ny, nc);
		aX = verifier(x, 0, largeurMax);
		aY = verifier(y, 0, hauteurMax);
		bX = verifier(nbx, 0, largeurMax);
		bY = verifier(nby, 0, largeurMax);
		cX = verifier(ncx, 0, largeurMax);
		cY = verifier(ncy, 0, largeurMax);
	}
	
	public void afficher()
	{
		super.afficher();
		System.out.println("Sommet A en " + aX + ", " + aY);
		System.out.println("Sommet B en " + bX + ", " + bY);
		System.out.println("Sommet C en " + cX + ", " + cY);
	}
	
	public void deplacer(int nx, int ny)
	{
		super.deplacer(nx, ny);
		aX = verifier(aX + nx, 0, largeurMax);
		aY = verifier(aY + ny, 0, hauteurMax);
		bX = verifier(bX + nx, 0, largeurMax);
		bY = verifier(bY + ny, 0, hauteurMax);
		cX = verifier(cX + nx, 0, largeurMax);
		cY = verifier(cY + ny, 0, hauteurMax);
	}
	
}
