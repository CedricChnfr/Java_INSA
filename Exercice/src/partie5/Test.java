package partie5;

public class Test {

	public static void main(String[] args) {
		Cercle cercle = new Cercle(10);
		Carré carré = new Carré(5);
		
		System.out.println("Carre permietre de "+carré.perimetre()+" et surface de "+carré.surface());
		
		System.out.println("Cercle permietre de "+cercle.perimetre()+" et perimetre de "+cercle.surface());
		
		System.out.println("Coefficiant etalement cercle :  "+cercle.etalement()+" et perimetre de "+cercle.surface());
	}

}
