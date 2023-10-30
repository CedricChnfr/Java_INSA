package Partie3;

public class Exercice34 {
	public static void main(String[] args) {
		Voiture34 voiture1 = new Voiture34();
		Voiture34 voiture2 = new Voiture34();
		
		voiture1.setname('A');
		voiture2.setname('Z');
		System.out.println("Le nombre total de voitures créées est : " + Voiture34.getNbVoitures());
		
		System.out.println("Utilisation de tableau comme variable statique");
		for(Voiture34 voiture: Voiture34.getListeVoitures()) {
			if (voiture!=null) {
				System.out.println(voiture.getNom());
			}
		}
		
		System.out.println("Utilisation de la classe ArrayList");
		for(int i = 0; i < Voiture34.getListeVoitures2().size(); i++) {
				System.out.println(Voiture34.getListeVoitures2().get(i).getNom());
		}
		
	}
}
