package training_Livre;

import java.util.Scanner;

public class Livre {

	private String titre, nomAuteur, prenomAuteur, categorie, numISBN, codeAlphaUnique;

	public Livre()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez le titre du livre : ");
		setTitre(sc.nextLine());

		System.out.println("Entrez le nom de l'auteur : ");
		setNomAuteur(sc.nextLine());

		System.out.println("Entrez le prenom de l'auteur : ");
		setPrenomAuteur(sc.nextLine());

		System.out.println("Entrez la categorie du livre : ");
		setCategorie(sc.nextLine());

		System.out.println("Entrez le numero ISBN du livre : ");
		setISBN(sc.nextLine());
		
		setCode();
	}
	
	public Livre(String t)
	{
		setTitre(t);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez le nom de l'auteur : ");
		setNomAuteur(sc.nextLine());

		System.out.println("Entrez le prenom de l'auteur : ");
		setPrenomAuteur(sc.nextLine());

		System.out.println("Entrez la categorie du livre : ");
		setCategorie(sc.nextLine());

		System.out.println("Entrez le numero ISBN du livre : ");
		setISBN(sc.nextLine());
		
		setCode();
	}
	
	public Livre(String t, String na)
	{
		setTitre(t);
		setNomAuteur(na);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le prenom de l'auteur : ");
		setPrenomAuteur(sc.nextLine());

		System.out.println("Entrez la categorie du livre : ");
		setCategorie(sc.nextLine());

		System.out.println("Entrez le numero ISBN du livre : ");
		setISBN(sc.nextLine());
		
		setCode();
	}
	
	public Livre(String t, String na, String pa)
	{
		setTitre(t);
		setNomAuteur(na);
		setPrenomAuteur(pa);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez la categorie du livre : ");
		setCategorie(sc.nextLine());

		System.out.println("Entrez le numero ISBN du livre : ");
		setISBN(sc.nextLine());
		
		setCode();
	}
	
	public Livre(String t, String na, String pa, String c)
	{
		setTitre(t);
		setNomAuteur(na);
		setPrenomAuteur(pa);
		setCategorie(c);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le numero ISBN du livre : ");
		setISBN(sc.nextLine());
		
		setCode();
	}
	
	public Livre(String t, String na, String pa, String c, String isbn)
	{
		setTitre(t);
		setNomAuteur(na);
		setPrenomAuteur(pa);
		setCategorie(c);
		setISBN(isbn);		
		setCode();
	}
	
	public String getTitre()
	{
		return titre;
	}
	
	public void setTitre(String t)
	{
		titre = t;
	}

	public String getNomAuteur()
	{
		return nomAuteur;
	}
	
	public void setNomAuteur(String na)
	{
		nomAuteur = na;
	}

	public String getPrenomAuteur()
	{
		return prenomAuteur;
	}
	
	public void setPrenomAuteur(String pa)
	{
		prenomAuteur = pa;
	}

	public String getCategorie()
	{
		return categorie;
	}
	
	public void setCategorie(String c)
	{
		categorie = c;
	}

	public String getISBN()
	{
		return numISBN;
	}
	
	public void setISBN(String isbn)
	{
		numISBN = isbn;
	}

	public String getCode()
	{
		return codeAlphaUnique;
	}
	
	private void setCode()
	{
		String buildCode = "";
		buildCode += nomAuteur.substring(0, 2);
		buildCode += prenomAuteur.substring(0, 2);
		buildCode += categorie;
		buildCode += numISBN.substring(numISBN.length() - 2, numISBN.length());
		codeAlphaUnique = buildCode;
	}

	public void afficherUnLivre()
	{
		System.out.println(getTitre());
		System.out.println(getNomAuteur());
		System.out.println(getPrenomAuteur());
		System.out.println(getCategorie());
		System.out.println(getISBN());
		System.out.println(getCode());
	}



}
