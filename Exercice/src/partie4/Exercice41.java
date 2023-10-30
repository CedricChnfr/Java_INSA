//Cédric Chanfreau
package partie4;

public class Exercice41 {

	public static void main(String[] args) {
		Voiture34 voiture1 = new Voiture34();
		Voiture34 voiture2 = new Voiture34();
		VehiculePrioritaire vehiculePrioritaire1 = new VehiculePrioritaire();
		
		voiture1.setname('A');
		voiture2.setname('Z');

		System.out.println("La voiture à les feux allumé : "+vehiculePrioritaire1.getGyro());
		vehiculePrioritaire1.allumeGyrophare();
		System.out.println("La voiture à les feux allumé : "+vehiculePrioritaire1.getGyro());
		
		System.out.println("La vitesse est "+vehiculePrioritaire1.getVitesse());
		vehiculePrioritaire1.accelere(15); // // 4 + 10 + 15 = 29
		System.out.println("La vitesse est "+vehiculePrioritaire1.getVitesse());
		

		System.out.println("Voici la liste des voitures :");
		for(Voiture34 voiture: Voiture34.getListeVoitures()) {
			if (voiture!=null) {
				System.out.println(voiture.getNom());
			}
		}
		
	}

}
