import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.dnd.MouseDragGestureRecognizer;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Rectangle {

//	@SuppressWarnings("unused")
//	private static class Canvas extends JPanel{
//		@Override
//		public void paintComponent(Graphics g) {
//			super.paintComponent(g);
//			g.setColor(new Color((float)Math.random(), (float)Math.random(), (float)Math.random()));
//			g.fillRect(10, 10, getWidth() - 20	, getHeight() - 20);
//		}
//	}
	
	public static class RepaintListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			Component source = (Component)e.getSource();
			source.repaint();
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}
	
	public static class StampListener implements MouseListener, MouseMotionListener{
		
		private Color selectedColor = Color.RED;
		
		@Override
		public void mouseClicked(MouseEvent e){
//			Component source = (Component) e.getSource();
//			Graphics g = source.getGraphics();
//			g.setColor(new Color((float)Math.random(), (float)Math.random(), (float)Math.random()));
//			g.fillOval(e.getX(), e.getY(), 50, 50);
//			
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			int colorpickerSize = 30;
			Component source = (Component) e.getSource();

			if (e.getY() >= source.getHeight() - colorpickerSize) {
				if (e.getX() < colorpickerSize) {
					selectedColor = (Color.RED);
				} else if (e.getX() < colorpickerSize * 2) {
					selectedColor = (Color.GREEN);
				} else if (e.getX() < colorpickerSize * 3) {
					selectedColor = (Color.BLUE);
				}
			}

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseDragged(MouseEvent e) {

			Component source = (Component) e.getSource();
			Graphics g = source.getGraphics();
//			g.setColor(new Color((float)Math.random(), (float)Math.random(), (float)Math.random()));
			g.setColor(selectedColor);
			int ovalDiameter = 90;
			int colorpickerSize = 30;
			if(e.getX()>colorpickerSize*3 || e.getY()<source.getHeight()-colorpickerSize){
			g.fillOval(e.getX() - ovalDiameter/2, e.getY()- ovalDiameter/2, ovalDiameter, ovalDiameter);
			}
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	public static class Canvas extends JPanel{
		@Override
		public void paintComponent(Graphics g){
			int colorpickerSize = 30;
			g.setColor(Color.RED);
			g.fillRect(colorpickerSize*0, getHeight()-colorpickerSize, colorpickerSize, colorpickerSize);
			
			g.setColor(Color.GREEN);
			g.fillRect(colorpickerSize*1, getHeight()-colorpickerSize, colorpickerSize, colorpickerSize);
			
			g.setColor(Color.BLUE);
			g.fillRect(colorpickerSize*2, getHeight()-colorpickerSize, colorpickerSize, colorpickerSize);
		}
	}
	
	public static void main(String[] args) {
		StampListener listener = new StampListener();

		
		Canvas canvasPanel = new Canvas();
		canvasPanel.addMouseListener(listener);
		canvasPanel.addMouseMotionListener(listener);
		JFrame mainWindow = new JFrame("Rectangle");
		mainWindow.setContentPane(canvasPanel);
		mainWindow.setSize(800, 600);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
		
		JPanel content = new JPanel();
		
		
	}
	
}
