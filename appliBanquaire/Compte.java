package appliBanquaire;

import java.util.*;

public class Compte {
	
    private String numDeCompte, typeDeCompte;
    private float valeurPaiement;
    protected float cpteCurrentValue;
    private LigneComptable[] ligne;
    public final static int nbLigneMax = 10;
    private int nbLigneReel;

    public String getNumDeCompte(){	return numDeCompte; }
    public String getTypeDeCompte(){ return typeDeCompte; }
    
    public float getValeurPaiement(){ return valeurPaiement; }
    public float getCpteCurrentValue(){ return cpteCurrentValue; }

    public LigneComptable[] getLigne(){ return ligne; }
    
    public int getNbLigneReel(){ return nbLigneReel; }
    
    public Compte()
    {
        Scanner sc = new Scanner(System.in);
        
        typeDeCompte = controleType();
        
        System.out.println("Numero du compte : ");
        numDeCompte = sc.nextLine();

        //System.out.println("Premiere valeur creditee : ");
        //valeurPaiement = sc.nextFloat();

        cpteCurrentValue = controleCurValInit();

        /*System.out.print("Recapitulatif : ");
        System.out.println("Type du compte : " + typeDeCompte);
        System.out.println("Numero du compte : " + numDeCompte);
        System.out.println("Premiere valeur creditee : " + valeurPaiement);*/
        ligne = new LigneComptable[nbLigneMax];
        nbLigneReel = -1;
    }
    
    public Compte(String type)
    {
    	if(type.equalsIgnoreCase("Epargne"))
    	{
    		Scanner sc = new Scanner(System.in);
    		typeDeCompte = type;
    		
    		System.out.println("Numero de compte : ");
    		numDeCompte = sc.nextLine();
    		
    		cpteCurrentValue = controleCurValInit();
    		ligne = new LigneComptable[nbLigneMax];
    		nbLigneReel = -1;
    	}
    }

    public void afficherCpte()
    {
        System.out.println("Numero de compte : " + numDeCompte);
        System.out.println("Type de compte : " + typeDeCompte);
        //System.out.println("Premi\u00e8re valeur cr\u00e9dit\u00e9e : " + valeurPaiement);
        System.out.println("Valeur courrante du compte : " + cpteCurrentValue);
        if (nbLigneReel > 0)
        {
        	for(int i = 0; i <= nbLigneReel; i++)
        	{
        		ligne[i].afficherLigne();
        	}
        }	
    }

    public void creerLigne()
    {
    	if(nbLigneReel <  nbLigneMax)
    	{
    		nbLigneReel++;
    		ligne[nbLigneReel] = new LigneComptable();
    	}
    	else if(nbLigneReel > nbLigneMax)
    	{
    		decalerLesLignes();
    		ligne[nbLigneMax - 1] = new LigneComptable();
    	}
    	
        cpteCurrentValue += ligne[nbLigneReel].getMontantOperation();
    }
    
    private void decalerLesLignes()
    {
    	for(int i = 0; i < nbLigneMax; i++)
    	{
    		ligne[i -1] = ligne[i];
    	}
    }
    
    /*/# Methodes de controle #/*/
    
    private String controleType()
    {
    	char tmpC;
    	String tmpS = "";
    	Scanner sc = new Scanner(System.in);
    	
    	do {
    		System.out.println("Type du compte [Types possibles : C(ourant), J(oint)] : ");
    		tmpC = sc.nextLine().toUpperCase().charAt(0);
		} while (tmpC != 'C' && tmpC != 'J');
    	
    	switch(tmpC){
    		case 'C':
    			tmpS = "Courant";
    			break;
    		case 'J':
    			tmpS = "Joint";
    			break;
    	}
    	return tmpS;
    }
    
    private float controleCurValInit()
    {
    	float curVal;
    	Scanner sc = new Scanner(System.in);
    	
    	do {
			System.out.println("Valeur actuelle du compte : ");
			curVal = sc.nextFloat(); 
		} while (curVal < 0);
    	
    	return curVal;
    }
}
