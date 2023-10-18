package Partie3;

public class Voiture {
	public int puissance;
	public double vitesse;
	public boolean estDemaree;
	
	public Voiture(int pu, double vi, boolean dem) {	// Constructeur
		this.puissance = pu;
		this.vitesse = vi;
		this.estDemaree = dem;
	}
	
	public Voiture(int pu) {
		this.puissance = 10;
	}
	
	public Voiture() {
		this.puissance = 0;
        this.vitesse = 0;
        this.estDemaree = false;
	}
	
}
