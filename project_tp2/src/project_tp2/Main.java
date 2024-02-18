package project_tp2;

public class Main {

	public static void main(String[] args) {
		Livre livre1 = new Livre("Le ciel", "Lina", 2000);
		Livre livre2 = new Livre("Les vagues", "Adnan", 1900);
		
		
		livre1.afficherDetails("Le ciel", "Lina", 2000);
		livre2.afficherDetails("Les vagues", "Adnan", 1900);
		
		
		Bibliotheque bib = new Bibliotheque();	
		bib.ajouterLivre(livre1);
		bib.ajouterLivre(livre2);
		
		
		bib.afficherLivres();
		
	}
			
	}


