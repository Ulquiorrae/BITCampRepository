import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class GuessingGameGUI {
	
	static int counter = 0;
	static int endGame = 0;
	
	//static JTextField guess;
	
	
	public static class MouseButtonHandler implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (((Component) e.getSource()).getName().equals("smallerButton")) {
				JOptionPane.showMessageDialog(null, "TOO SMALL");
				counter++;
			}
			if (((Component) e.getSource()).getName().equals("higherButton")) {
				JOptionPane.showMessageDialog(null, "TOO HIGH");
				counter++;
			}
			if (((Component) e.getSource()).getName().equals("correctButton")) {
				JOptionPane.showMessageDialog(null, "CORRECT!");
				endGame = 1;
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
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		
	}
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		MouseButtonHandler smaller = new MouseButtonHandler();
		MouseButtonHandler higher = new MouseButtonHandler();
		MouseButtonHandler correct = new MouseButtonHandler();
		
		int numberToGuess = in.nextInt();
		
		//frame
		JFrame window = new JFrame("GuessingGame");
		window.setName("Guessing Game");
		window.setSize(300, 300);
		window.setMaximumSize(new Dimension(300, 300));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
//		//guess
//		guess = new JTextField();
//		giess.setEnabled(false);
//		guess.setPreferredSize(new Dimension(500,500));
//		guess.setFont(new Font(Aeri))
		
		JPanel panel = new JPanel();
		
		JButton smallerButton = new JButton("SMALLER");
		smallerButton.setName("smallerButton");
		smallerButton.addMouseListener(smaller);
		panel.add(smallerButton);
		
		JButton higherButton = new JButton("HIGHER");
		higherButton.setName("higherButton");
		higherButton.addMouseListener(higher);
		panel.add(higherButton);
		
		JButton correctButton = new JButton("CORRECT: ");
		correctButton.setName("correctButton");
		correctButton.addMouseListener(correct);
		panel.add(correctButton);
		
		JLabel number = new JLabel("" + numberToGuess);
		panel.add(number);
		
		
		window.add(panel);
		window.setVisible(true);
		
		playGuessingGame();
		
	}



	private static void playGuessingGame() {

		
	}


	
}
