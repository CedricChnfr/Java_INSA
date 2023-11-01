package partie6;

public class ErrConst extends Exception{
	private String message;
	private int abs; int ord;
	
	public ErrConst() {}
	
	public String getMessage() {
		return super.getMessage() + " Valeurs fournies : x = " + this.abs + ", y = " + this.ord;
	}
	
	public ErrConst(int x, int y) {
		this.abs = x;
		this.ord = y;
		}
	
	public int getAbs() {
		return this.abs;
	}
	public int getOrd() {
		return this.ord;
	}
}
