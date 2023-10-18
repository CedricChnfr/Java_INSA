package Partie3;

public class Exercice3_3 {
	public static void main(String[] args) {
		Voiture3 Voiture1 = new Voiture3(); // Instances
		Voiture3 Voiture2 = new Voiture3(); // Instances
		
		Voiture1.demarre(50);
		Voiture2.demarre();
		
        // Afficher le type et la place mémoire de voiture1
        System.out.println("Type de voiture1 : " + Voiture1.getClass().getName());
        System.out.println("Place mémoire de voiture1 : " + System.identityHashCode(Voiture1));

        // Supprimer voiture1
        Voiture1 = null;
	}
}
