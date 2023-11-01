package partie6;

public class ErrDepl extends Exception {
	private int x; int y;
	public void deplace(int dx, int dy) throws ErrDepl {
		if (((x+dx) < 0) || ((y+dy) <0)) throw new ErrDepl();
		x += dx ; y +=dy;
		}
}
