package Partie3;

public class Voiture2 {
	private int puissance;
	private double vitesse;
	private boolean estDemaree;
	
	// Assesseur
	public int getPuissance() {
		return puissance;
	}
	
	public void setPuissance(int puiss) {
		this.puissance = puiss;
	}
	
	public double getVitesse() {
		return vitesse;
	}
	
	public void setVitesse(double vites) {
		this.vitesse = vites;
	}
	
	public boolean getDemaree() {
		return estDemaree;
	}
	
	public void setDemaree(boolean dem) {
		this.estDemaree = dem;
	}
	
	//Méthode
	public void demarre() {
		this.estDemaree=true;
		System.out.println("Démarrage de la voiture");
	}
	
	
}
