package project_tp2;


public class Livre {
	protected String titre;
	protected String auteur;
	protected int anneePublication;
	
	
	public Livre(String titre, String auteur, int anneePublication) {
		this.titre = titre;
		this.auteur = auteur;
		this.anneePublication = anneePublication;
		
	}
	
	public void afficherDetails(String titre, String auteur, int anneePublication) {
		System.out.println("Voici les informations du livre: \r le titre est: " +titre+ "\r l'auteur est: " +auteur+ "\r l'année de publication est: " +anneePublication );
	}
	

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getAnneePublication() {
		return anneePublication;
	}

	public void setAnneePublication(int anneePublication) {
		this.anneePublication = anneePublication;
	}
	
	
	public static void main(String[] args) {
	}
	
}


