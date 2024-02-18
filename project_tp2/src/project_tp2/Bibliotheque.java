package project_tp2;

import java.util.ArrayList;
import java.util.List;


public class Bibliotheque {
	
	protected List<Livre> Livres;
	
	public Bibliotheque() {
		Livres = new ArrayList<>(); 
	}
	
	public void ajouterLivre (Livre l) {
		Livres.add(l);
	}

	public void afficherLivres() {
		System.out.println("Les livres de la bibliotheque sont: " +Livres);
	}
	
	public static void main(String[] args) {
	
	}

} 





