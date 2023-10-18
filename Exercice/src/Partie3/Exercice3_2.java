package Partie3;

public class Exercice3_2 {
	public static void main(String[] args) {
		Voiture2 Voiture1 = new Voiture2(); // Instances
		
		Voiture1.setPuissance(15);
		Voiture1.setVitesse(30);
		Voiture1.setDemaree(false);
		
		System.out.println("La puissance est de "+Voiture1.getPuissance());
		System.out.println("La vitesse est de "+Voiture1.getVitesse());
		System.out.println("La voiture démarre : "+Voiture1.getDemaree());
		
		Voiture1.demarre();
		System.out.println("La voitur démarre : "+Voiture1.getDemaree());
	}
}
