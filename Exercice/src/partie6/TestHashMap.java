package partie6;

import java.util.HashMap;
import java.util.Iterator;

public class TestHashMap {

	public static void main(String[] args) {
		Point2 p1 = new Point2(1,3);
		Point2 p2 = new Point2(2,2);
		Point2 p3 = new Point2(4,5);
		Point2 p4 = new Point2(1,3);
		HashMap<Point2, Integer> hashMapPoints = new HashMap<Point2, Integer>();
		hashMapPoints.put(p1, 10);
        hashMapPoints.put(p2, 20);

        affiche(hashMapPoints);

        System.out.println("Valeur associée à la clé p1 : " + hashMapPoints.get(p1));
        System.out.println("p1 appartient à la collection : " + hashMapPoints.containsKey(p1));
        System.out.println("La collection contient la valeur 10 : " + hashMapPoints.containsValue(10));
        
        System.out.println("HashCode de p4 : " + p4.hashCode());
        System.out.println("p4 appartient à la collection : " + hashMapPoints.containsKey(p4));
        
        System.out.println("Are p1 and p4 equal? " + p1.equals(p4));

	}
	
	public static void affiche(HashMap <Point2, Integer> ens) {
		Iterator<Point2> iter = ens.keySet().iterator();
		while(iter.hasNext()){
		Point2 p = iter.next();
		System.out.println( "key: " + p.hashCode() + " value: " + ens.get(p) );
		}
	}

}
