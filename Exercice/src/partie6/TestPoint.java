package partie6;

public class TestPoint {

	public static void main(String[] args) {
		try {
			Point a = new Point(10, 4);
			a.affiche();
			Point b = new Point(-2, 5);
			b.affiche();
			a.deplace(-11, 7);
			a.affiche();
		} catch (ErrConst e) {
			System.out.println(e.getMessage());
			System.out.println("Erreur Construction");
			e.printStackTrace();
			System.exit(-1);
		} catch (ErrDepl e) {
			System.out.println("Erreur de déplacement ! Les coordonnées finales seraient négatives.");
            System.exit(-1);
		}
	}
}