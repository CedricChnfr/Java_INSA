package partie4;

public class VehiculePrioritaire extends Voiture34 {
	private boolean gyrophare;
	
	// Appel aux constructeur de la super classe
	public VehiculePrioritaire() {
		super(4);
	}
	//Méthode
	public void allumeGyrophare() {
		gyrophare = true;
		super.accelere(10); 
	}
	
	public boolean getGyro() {
		return gyrophare;
	}
}
