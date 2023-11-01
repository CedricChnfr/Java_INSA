//Cédric Chanfreau
package partie4;
import java.util.Date;

public class Voiture34 {
	private char nom;
	private static int nbVoitures = 0;
	private static Voiture34[] listeVoitures = new Voiture34[10];
	private Date dateCreation;
	
	private double vitesse;

	
	// Assesseur
	public char getNom() {
		return nom;
	}
		
	public void setname(char name) {
		this.nom = name;
	}
	
	public double getVitesse() {
		return vitesse;
	}

	// Méthode de classe 
	
	public void accelere(double vit) {
		this.vitesse += vit;
	}
	
	public static Voiture34[] getListeVoitures(){
		return listeVoitures;
	}

	public static int getNbVoitures() {
		return nbVoitures;
	}
	
    public Date getDateCreation() {
        return dateCreation;
    }
	

	// Constructeur
	
	public Voiture34(double vi) {
		this.vitesse = vi;
		this.dateCreation = new Date();
	}
	
	// Constructeur
	public Voiture34() {
		listeVoitures[nbVoitures] = this;
		nbVoitures++;
		}
		
		
}
