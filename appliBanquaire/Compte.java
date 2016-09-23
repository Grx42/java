package appliBanquaire;

import java.util.*;

public class Compte
{
    public String numDeCompte, typeDeCompte;
    public float tauxEpargne, valeurPaiement, cpteCurrentValue;
    public LigneComptable ligne;
    public int nbLigneReel;

    public void creerCpte()
    {
        Scanner sc = new Scanner(System.in);
        do {
            String userEntry = "";
            System.out.println("Type du compte [Types possibles : C(ourant), J(oint), E(pargne)] : ");
            userEntry = sc.nextLine().toLowerCase();
            userEntry = userEntry.substring(0, 1);
            if(userEntry.equals("c"))
                typeDeCompte = "courant";
            else if(userEntry.equals("j"))
                typeDeCompte = "joint";
            else if(userEntry.equals("e"))
                typeDeCompte = "epargne";
        } while (!typeDeCompte.equals("courant") && !typeDeCompte.equals("joint") && !typeDeCompte.equals("epargne"));

        System.out.println("Numero du compte : ");
        numDeCompte = sc.nextLine();

        //System.out.println("Premiere valeur creditee : ");
        //valeurPaiement = sc.nextFloat();

        System.out.println("Valeur courrante du compte : ");
        cpteCurrentValue = sc.nextFloat();

        if (typeDeCompte.equals("epargne"))
        {
            System.out.println("Taux de placement :");
            tauxEpargne = sc.nextFloat();
        }

        System.out.print("Recapitulatif : ");
        System.out.println("Type du compte : " + typeDeCompte);
        System.out.println("Numero du compte : " + numDeCompte);
        System.out.println("Premiere valeur creditee : " + valeurPaiement);

        if (typeDeCompte.equals("epargne"))
        {
            System.out.println("Taux de placement : " + tauxEpargne);
        }

        nbLigneReel = 0;
    }

    public void afficherCpte()
    {
        System.out.println("Numero de compte : " + numDeCompte);
        System.out.println("Type de compte : " + typeDeCompte);
        if (typeDeCompte.equals("epargne"))
        {
            System.out.println("Taux d'\u00e9pargne : " + tauxEpargne);
        }
        //System.out.println("Premi\u00e8re valeur cr\u00e9dit\u00e9e : " + valeurPaiement);
        System.out.println("Valeur courrante du compte : " + cpteCurrentValue);
        if (nbLigneReel > 0)
            ligne.afficherLigne();
    }

    public void creerLigne()
    {
        ligne = new LigneComptable();
        ligne.creerLigneComptable();
        cpteCurrentValue += ligne.montantOperation;
        nbLigneReel = 1;
    }

}
