import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CircleDrawing {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Circle");
		Panel myPanel = new Panel();
		jf.add(myPanel);
		jf.setSize(500, 500);
		jf.setLocation(1200, 200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

	}

	public static class Panel extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Circle circle = new Circle(g);
			g.setColor(Color.BLACK);
			circle.drawAt(40, 40);
			
			RedCircle rc = new RedCircle(g);
			rc.drawAt(290, 30);
			
			CrossedCircle cc = new CrossedCircle(g);
			cc.drawAt(150, 120);
		}
	}

}
