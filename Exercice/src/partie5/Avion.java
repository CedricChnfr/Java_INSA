package partie5;

public class Avion extends Object{
	double vitesse;
	double puissance;
	
	//Constructeur
	public Avion(double vi, double pui) {
		this.vitesse = vi;
		this.puissance = pui;
	}
	
	// Méthode
	public boolean equals(Object o) {
		if(o instanceof Avion) {
			Avion avion = (Avion) o;
			return this.vitesse == avion.vitesse && this.puissance == avion.puissance;
		}
		else {
			return false;
		}
			
		
		
	}
}