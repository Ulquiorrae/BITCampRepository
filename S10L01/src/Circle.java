import java.awt.Color;
import java.awt.Graphics;

public class Circle {
	protected Graphics g;
	protected int size = 50;

	public Circle(Graphics g) {
		this.g = g;
	}

	public void drawAt(int x, int y) {
		g.fillOval(x-size/2, y-size/2, size, size);
	}

	public Color getColor() {
		return g.getColor();
	}
	
	
	
	
	
}
