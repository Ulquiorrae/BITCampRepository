import java.awt.Color;
import java.awt.Graphics;


public class RedCircleDecorator extends Circle{

	private Circle decoratedCircle;
	
	public RedCircleDecorator(Circle decoratedCircle) {
		super(decoratedCircle.g);
		this.decoratedCircle = decoratedCircle;
	}

	
	@Override
	public void drawAt(int x, int y) {
		
		Color previousColor = decoratedCircle.getColor();
		decoratedCircle.g.setColor(Color.RED);
		decoratedCircle.drawAt(x, y);
		decoratedCircle.g.setColor(previousColor);
		
		
	}
	
}
