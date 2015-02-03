import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LocationPrinter extends MouseMotionAdapter {
	public static void main(String args[]) {
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(300, 200));
		panel.addMouseMotionListener(new LocationPrinter());
		
		JFrame frame = new JFrame("Location Window");
		frame.getContentPane().add(panel);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public void mouseMoved(MouseEvent me) {
		int screenX = me.getXOnScreen();
		int screenY = me.getYOnScreen();
		System.out.println("screen(X,Y) = " + screenX + "," + screenY);
	}
	
}