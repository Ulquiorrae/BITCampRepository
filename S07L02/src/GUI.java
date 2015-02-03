import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GUI {

	public static void main(String[] args) {
		
		ButtonHandler listener = new ButtonHandler();
		
		JFrame window = new JFrame("Gui101");
		window.setName("NOVO IME");
		window.setSize(300, 300);
		window.setMaximumSize(new Dimension(300, 300));
		
		JPanel panel = new JPanel();
		
		JButton dugme = new JButton("DUGME");
		dugme.addActionListener(listener);
		panel.add(dugme);
		
		JButton dugme2 = new JButton("DUGME22");
		dugme2.addActionListener(listener);
		panel.add(dugme2);
		
		window.add(panel);
		
		window.setVisible(true);
	
		
	}

	private static class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			System.out.println("DADADADA");
			JButton b = (JButton) e.getSource(); //vrati objekt tipa component a mi ga pretvorimo u JButton
			b.setText("KLIKNUTO");
			
		}
		
		public void mouseClicked(MouseEvent e) {
			
			
			
		}
		
	}
	
}
