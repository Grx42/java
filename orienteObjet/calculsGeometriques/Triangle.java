package calculsGeometriques;

import java.util.*;

public class Triangle extends Forme {

	private int aX, aY, bX, bY, cX, cY;
	private int[] xPoints = new int[3];
	private int[] yPoints = new int[3];
	
	
	public Triangle()
	{
		super();
		
		xPoints[0] = x;
		yPoints[0] = y;
		for(int i = 1; i < xPoints.length; i++)
		{
			
			String verArgX = (char)('a' + i) + "X";
			String verArgY = (char)('a' + i) + "Y";
			
			xPoints[i] = verifier(verArgX, 0, largeurMax);
			yPoints[i] = verifier(verArgY, 0, hauteurMax);
		}
		/*aX = verifier(x, 0, largeurMax);
		aY = verifier(y, 0, hauteurMax);
		
		bX = verifier("bX", 0, largeurMax);
		bY = verifier("bY", 0, hauteurMax);
		
		cX = verifier("cX", 0, largeurMax);
		cY = verifier("cY", 0, hauteurMax);*/
	}
	
	public Triangle(int nx, int ny, int nc, int nbx, int nby, int ncx, int ncy)
	{
		super(nx, ny, nc);
		
		xPoints[0] = verifier(x, 0, largeurMax);
		yPoints[0] = verifier(y, 0, hauteurMax);
		xPoints[1] = verifier(nbx, 0, largeurMax);
		yPoints[1] = verifier(nby, 0, largeurMax);
		xPoints[2] = verifier(ncx, 0, largeurMax);
		yPoints[2] = verifier(ncy, 0, largeurMax);
	}
	
	public void afficher()
	{
		super.afficher();
		System.out.println("Sommet A en " + xPoints[0] + ", " + yPoints[0]);
		System.out.println("Sommet B en " + xPoints[1] + ", " + yPoints[1]);
		System.out.println("Sommet C en " + xPoints[2] + ", " + yPoints[2]);
	}
	
	public void deplacer(int nx, int ny)
	{
		super.deplacer(nx, ny);
		xPoints[0] = verifier(xPoints[0] + nx, 0, largeurMax);
		yPoints[0] = verifier(yPoints[0] + ny, 0, hauteurMax);
		xPoints[1] = verifier(xPoints[1] + nx, 0, largeurMax);
		yPoints[1] = verifier(yPoints[1] + ny, 0, hauteurMax);
		xPoints[2] = verifier(xPoints[2] + nx, 0, largeurMax);
		yPoints[2] = verifier(yPoints[2] + ny, 0, hauteurMax);
	}
	
}
