import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HowOldAreYouGUI {

	private static class Canvas extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.WHITE);
			g.setColor(Color.BLACK);
			// g.drawString("How old are you??",20,30);

		}
	}

	public static class MouseButtonHandler implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (((Component) e.getSource()).getName().equals("okButton")) {
				JOptionPane
						.showMessageDialog(null, "You are 18 years old!! :D");
				System.exit(0);
			}
			if (((Component) e.getSource()).getName().equals("cancelButton")) {
				JOptionPane.showMessageDialog(null,
						"You are NOT 18 years old!! >)");
				System.exit(0);
			}
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

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		MouseButtonHandler oklistener = new MouseButtonHandler();
		MouseButtonHandler nolistener = new MouseButtonHandler();

		Canvas canvasPanel = new Canvas();

		JButton okButton = new JButton("YES");
		okButton.setName("okButton");
		okButton.setPreferredSize(new Dimension(40, 60));
		okButton.addMouseListener(oklistener);
		// okButton.setLocation(20,20);
		JButton cancelButton = new JButton("NO");
		cancelButton.setName("cancelButton");
		cancelButton.setPreferredSize(new Dimension(40, 60));
		cancelButton.addMouseListener(nolistener);

		JLabel textField = new JLabel("      Are you\n18 years\nold?");
		canvasPanel.add(textField);

		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		content.add(textField, BorderLayout.CENTER);
		content.add(okButton, BorderLayout.NORTH);
		content.add(cancelButton, BorderLayout.SOUTH);

		JFrame mainWindow = new JFrame("How old are you ??");
		mainWindow.setContentPane(content);
		mainWindow.setSize(200, 200);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);

	}

}
