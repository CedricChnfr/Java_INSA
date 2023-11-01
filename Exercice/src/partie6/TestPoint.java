package partie6;

public class TestPoint {

	public static void main(String[] args) {
		try {
			Point a = new Point(10, 4);
			a.affiche();
			a.deplace(-12, 7);
			a.affiche();
		} catch (ErrConst e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Erreur Construction");
			System.exit(-1);
		} catch (ErrDepl e) {
			System.out.println("Erreur de déplacement ! Les coordonnées finales seraient négatives.");
            System.exit(-1);
		}
	}
}
