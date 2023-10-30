package partie5;

public class Carré extends Forme{
	public double cote;
	
	public Carré(double cot) {
		this.cote = cot;
	}
	
	public double perimetre() {
		return this.cote*4;
	}
	
	public double surface() {
		return cote*cote;
	}
}
