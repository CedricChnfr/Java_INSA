
public class Exercice2_1 {
		
	public static void main (String[] argv) {
		final int Tableau_entier [] = new int [5];
		final char[] Tableau_carac = {'a', 'b', 'c', 'd', 'e'};
		
		Tableau_entier[0] = 2;
		Tableau_entier[1] = 7;
		Tableau_entier[2] = 8;
		Tableau_entier[3] = 5;
		Tableau_entier[4] = 3;
		
		afficheTableau(Tableau_entier);
		
		for (char current : Tableau_carac) {
			System.out.println(current);
		}
	}
	
	public static void afficheTableau (int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Elément du tableau "+ i + ": "+ tab[i]);
		}
	}
}

/*
• public : cette fonction est accessible de partout et sans aucune restriction (vous pouvez
essayer « private », qui signifie que cette fonction n'est accessible qu'au sein de la classe
dans laquelle il est déclaré (c'est-à-dire la classe Exercice21).
• static : cette fonction ne change pas
• void : cette fonction ne retourne pas de résultat
*/
