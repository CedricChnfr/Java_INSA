//Cédric Chanfreau
package Partie3;
import java.util.ArrayList;

public class Voiture34 {
	private char nom;
	private static int nbVoitures = 0;
	private static Voiture34[] listeVoitures = new Voiture34[10];
	private static ArrayList<Voiture34> listeVoitures2 = new ArrayList<Voiture34>();
	
	// Assesseur
	public char getNom() {
		return nom;
	}
		
	public void setname(char name) {
		this.nom = name;
	}
	
	// Méthode de classe 
	public static int getNbVoitures() {
		return nbVoitures;
	}
	
	public static Voiture34[] getListeVoitures(){
		return listeVoitures;
	}
	
	public static ArrayList<Voiture34> getListeVoitures2() {
		return listeVoitures2;
		}
	
	// Constructeur
	public Voiture34() {
		listeVoitures[nbVoitures] = this;
		nbVoitures++;
		listeVoitures2.add(this);
	}
		
		
}
