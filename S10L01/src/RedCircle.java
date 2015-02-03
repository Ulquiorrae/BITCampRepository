import java.awt.Color;
import java.awt.Graphics;


public class RedCircle extends Circle {

	public RedCircle(Graphics g) {
		super(g);
	}
	
	@Override
	public void drawAt(int x, int y) {
		Color previousColor = g.getColor();
		g.setColor(Color.RED);
		super.drawAt(x, y);
		g.setColor(previousColor);
	}
}
