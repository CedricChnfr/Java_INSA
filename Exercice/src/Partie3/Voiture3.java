package Partie3;

public class Voiture3 {
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
	
	public void demarre(int vi) {
		this.vitesse = vi;
		this.estDemaree=true;
		System.out.println("La voiture démarre à la vitesse de " + vitesse + " km/h !");
	}
	
	
}