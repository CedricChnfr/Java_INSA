package partie6;

public class Point {
	public int x; int y;
	public Point (int x, int y) throws ErrConst{
		if ((x < 0) || (y < 0)) throw new ErrConst();
		this.x = x; this.y = y;
	}
	public void affiche() {
		System.out.println("Coordonnees : "+x+" "+y);
	}
	
	public void deplace(int dx, int dy) throws ErrDepl {
		if (((x+dx) < 0) || ((y+dy) <0)) throw new ErrDepl();	//si x ou y inférieur à 0 alors appel ErrDepl
		x += dx ; y +=dy;
		}
}
