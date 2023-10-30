package partie5;

public class Cercle extends Forme{
	public double rayon;
	
	public Cercle(double ray) {
		this.rayon = ray;
	}
	
	public double perimetre() {
		return 2*Math.PI*rayon;
	}
	
	public double surface() {
		return Math.PI*Math.PI*rayon;
	}
	
	
}
