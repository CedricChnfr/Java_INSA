package partie6;

public class Point2 {
	private int x;
	private int y;
	
	public Point2(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void affiche() {
		System.out.println("Valeur de x : "+this.x+" et y "+this.y);
	}
	
	public int getx() {
		return this.x;
	}
	public int gety() {
		return this.y;
	}
	
	public boolean equals(Object pp) {
		Point2 p = (Point2)pp;
		return ((this.x == p.x) && (this.y == p.y));
	}
	
	public int hashCode() {
		return x+y;
	}
}
