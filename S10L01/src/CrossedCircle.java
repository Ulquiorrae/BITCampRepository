import java.awt.Color;
import java.awt.Graphics;


public class CrossedCircle extends Circle {

	public CrossedCircle(Graphics g) {
		super(g);
	}

	@Override
	public void drawAt(int x, int y) {
		super.drawAt(x, y);
		Color previousColor = g.getColor();
		g.setColor(Color.WHITE);
		g.drawLine(x - size/2, y - size/2, x + size/2, y + size/2);
		g.drawLine(x + size/2, y - size/2, x - size/2, y + size/2);
		g.setColor(previousColor);
		
		
		
		
	}
	
}
