package partie5;

public class TestAvion {

	public static void main(String[] args) {
		Avion avion1 = new Avion(4, 5);
		AvionElectrique avion2 = new AvionElectrique();
		
		System.out.println("Comparaison avion : "+ avion1.equals(avion2)); // true si même vitesse
	}

}
