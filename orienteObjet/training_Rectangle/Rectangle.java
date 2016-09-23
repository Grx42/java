package training_Rectangle;

import java.util.*;

public class Rectangle {

    public int xA, yA, xB, yB, xC, yC, xD, yD, couleur;

    public int verifier(int a, int b, int choix)
    {
        Scanner sc = new Scanner(System.in);
        int valeur;
        if (choix == 0)
        {
            do
            {
                System.out.println("Entrez l'abscisse (x) [0-800] : ");
                valeur = sc.nextInt();
            } while (valeur < a || valeur > b);
            return valeur;
        }
        else if(choix == 1)
        {
            do
            {
                System.out.println("Entrez l'ordonn\u00e9e (y) [0-600] : ");
                valeur = sc.nextInt();
            } while (valeur < a || valeur > b);
            return valeur;
        }
        else
        {
            do
            {
                System.out.println("Entrez une couleur [0-10] : ");
                valeur = sc.nextInt();
            } while (valeur < a || valeur > b);
            return valeur;
        }

    }

    public void creer()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Point A (longueur)");
        xA = verifier(0, 800, 0);
        yA = verifier(0, 600, 1);

        System.out.println("Point B (longueur)");
        xB = verifier(0, 800, 0);
        yB = verifier(0, 600, 1);

        System.out.println("Point C (largeur)");
        xC = verifier(0, 800, 0);
        yC = verifier(0, 600, 1);

        System.out.println("Point D (largeur)");
        xD = verifier(0, 800, 0);
        yD = verifier(0, 600, 1);

        System.out.println("Couleur");
        couleur = verifier(0, 10, 2);
    }

    public void afficher()
    {
        System.out.println("Point A : " + xA + " " + yA);
        System.out.println("Point B : " + xB + " " + yB);
        System.out.println("Point C : " + xC + " " + yC);
        System.out.println("Point D : " + xD + " " + yD);
        System.out.println("Couleur : " + couleur);
    }

    public void deplacer(int nx, int ny)
    {
        xA += nx;
        yA += ny;

        xB += nx;
        yB += ny;

        xC += nx;
        yC += ny;

        xD += nx;
        yD += ny;
    }

}
