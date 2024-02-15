package project_tp2;


public class Livre {
	private String titre;
	private String auteur;
	int anneePublication;
	
	
	public Livre(String titre, String auteur, int anneePublication) {
		this.titre = titre;
		this.auteur = auteur;
		this.anneePublication = anneePublication;
		
	}
	
	public void afficherDetails(String titre, String auteur, int anneePublication) {
		System.out.println("Voici les informations du livre: \r le titre est: " +titre+ "\r l'auteur est: " +auteur+ "\r l'année de publication est: " +anneePublication );
	}
	public static void main(String[] args) {
		Livre livre1 = new Livre("Le ciel", "Lina", 2000);
		livre1.afficherDetails("Le ciel", "Lina", 2000);
	}
	
}


