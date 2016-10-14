package appliBanquaire;

import java.util.*;

public class LigneComptable {

    private double montantOperation;
    private String motifOperation, modeDePaiement, dateDeLOperation;

    public double getMontantOperation(){ return montantOperation; }
    public String getMotifOperation(){ return motifOperation; }
    public String getModeDePaiement(){ return modeDePaiement; }
    public String getDateDeLOperation(){ return dateDeLOperation; }
    
    public LigneComptable()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez le montant \u00e0 cr\u00e9diter (+) ou d\u00e9biter (-) : ");
        montantOperation = sc.nextDouble();

        modeDePaiement = controleMode();

        sc.nextLine();
        System.out.println("Saisissez la date de l'op\u00e9ration [jj/mm/aaaa]");
        dateDeLOperation = sc.nextLine();

        motifOperation = controleMotif();
    }

    public void afficherLigne()
    {
        if (montantOperation < 0)
            System.out.println("D\u00e9biter : " + montantOperation);
        else
            System.out.println("Cr\u00e9diter : " + montantOperation);

        System.out.println("Le : " + dateDeLOperation + ", motif : " + motifOperation + ", mode : " + modeDePaiement);
    }
    
    /*/# Methodes de controle #/*/
    
    private String controleMotif()
    {
    	char tmpC;
    	String tmpS = "";
    	Scanner sc = new Scanner(System.in);
    	
    	do {
    		System.out.println("Saisissez le motif de l'op\u00e9ration [S(alaire), L(oyer), A(limentation), D(ivers)]");
    		tmpC = sc.nextLine().toUpperCase().charAt(0);
		} while (tmpC != 'S' && tmpC != 'L' && tmpC != 'A' && tmpC != 'D');
    	
    	switch (tmpC)
    	{
			case 'S':	
				tmpS = "Salaire";
				break;
			case 'L':
				tmpS = "Loyer";
				break;
			case 'A':
				tmpS = "Alimentation";
				break;
			case 'D':
				tmpS = "Divers";
				break;
		}
    	return tmpS;
    }
    
    private String controleMode()
    {
    	char tmpC;
    	String tmpS = "";
    	Scanner sc = new Scanner(System.in);
    	
    	do {
    		System.out.println("Saisissez le mode de paiement [C(b), N(° cheque), V(irement)]");
    		tmpC = sc.nextLine().toUpperCase().charAt(0);
		} while (tmpC != 'C' && tmpC != 'N' && tmpC != 'V');
    	
    	switch (tmpC) {
    		case 'C':
    			tmpS = "CB";
    			break;
    		case 'N':
    			tmpS = "Numero de ch\u00e8que";
    			break;
    		case 'V':
    			tmpS = "Virement";
		}
    	return tmpS;
    }
    
}
