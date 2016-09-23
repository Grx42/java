package training_Livre;

public class Livre {

	public String titre, nomAuteur, prenomAuteur, categorie, numISBN, codeAlphaUnique;

	public void setTitre(String t)
	{
		titre = t;
	}

	public void setNomAuteur(String na)
	{
		nomAuteur = na;
	}

	public void setPrenomAuteur(String pa)
	{
		prenomAuteur = pa;
	}

	public void setCategorie(String c)
	{
		categorie = c;
	}

	public void setISBN(String isbn)
	{
		numISBN = isbn;
	}

	public void setCodeAlphaUnique(String cau)
	{
		codeAlphaUnique = cau;
	}

	public String calculerLeCode()
	{
		String buildCode = "";
		buildCode += nomAuteur.substring(0, 2);
		buildCode += prenomAuteur.substring(0, 2);
		buildCode += categorie;
		buildCode += numISBN.substring(numISBN.length() - 2, numISBN.length());
		return buildCode;
	}

	public void afficherUnLivre()
	{
		System.out.println(titre);
		System.out.println(nomAuteur);
		System.out.println(prenomAuteur);
		System.out.println(categorie);
		System.out.println(numISBN);
		if(codeAlphaUnique != null && !codeAlphaUnique.isEmpty())
		{
			System.out.println(codeAlphaUnique);
		}
	}



}
