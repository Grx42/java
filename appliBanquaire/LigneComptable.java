package appliBanquaire;

import java.util.*;

public class LigneComptable {

    public double montantOperation;
    public String motifOperation, modeDePaiement, dateDeLOperation;

    public void creerLigneComptable()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez le montant \u00e0 cr\u00e9diter (+) ou d\u00e9biter (-) : ");
        montantOperation = sc.nextDouble();

        System.out.println("Saisissez le mode de paiement [C(b), N(° cheque), V(irement)]");
        modeDePaiement = sc.nextLine();

        System.out.println("Saisissez la date de l'op\u00e9ration [jj/mm/aaaa]");
        dateDeLOperation = sc.nextLine();

        System.out.println("Saisissez le motif de l'op\u00e9ration [S(alaire), L(oyer), A(limentation), D(ivers)]");
        motifOperation = sc.nextLine();
    }

    public void afficherLigne()
    {
        if (montantOperation < 0)
            System.out.println("D\u00e9biter : " + montantOperation);
        else
            System.out.println("Cr\u00e9diter : " + montantOperation);

        System.out.println("Le : " + dateDeLOperation + ", motif : " + motifOperation + ", mode : " + modeDePaiement);
    }
}
