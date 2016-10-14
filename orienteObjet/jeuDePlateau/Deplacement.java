package jeuDePlateau;

public interface Deplacement {
	
	
	public void seDeplacer();
	
	default public void deplacementEnX(){}
	
	default public void deplacementEnY(){}
}
