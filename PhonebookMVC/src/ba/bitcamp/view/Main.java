package ba.bitcamp.view;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JFrame;

public class Main {
	
	private static JFrame window = null;
	protected static int windowWidth = 400;
	protected static int windowHeight = 500;
	
	/**
	 * Initializes the JFrame the application
	 * will use to display the views
	 */
	public static void init(){
		window = new JFrame("BitBook");
		window.setSize(windowWidth, windowHeight);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
	}
	/**
	 * shows the JFrame and re-validates
	 * repaints the JFrame if need be
	 */
	protected static void setVisible(){
		window.validate();
		window.repaint();
		window.setVisible(true);
	}
	
	/**
	 * Replaces the current content pane
	 * with the new one. Enabling the app to use
	 * only one JFrame
	 * @param panel the panel we want to show
	 */
	protected static void replaceContent(Container panel){
		window.setContentPane(panel);
		setVisible();
	}

}
