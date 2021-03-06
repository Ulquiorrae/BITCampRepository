package GUI;

import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class LoginGui {

	private TextField username;
	private JPasswordField password;
	private String host;
	private int port;
	
	
	public LoginGui(String host, int port) {
		this.host = host;
		this.port = port;
		
		JFrame window = new JFrame("Login");
		JPanel content = new JPanel();
		
		JLabel user = new JLabel("Username:");
		JLabel pw = new JLabel("Password:");
		
		username = new TextField();
		username.setPreferredSize(new Dimension(250, 20));
		
		password = new JPasswordField(20);
		password.setPreferredSize(new Dimension(250, 20));
		
		
		//privatna klasa handlera za ovaj button
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ButtonHandler());
		
		
		
		//anonimna klasa handlera za ovaj button
		JButton quitButton = new JButton("Quit");
		quitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		
		});
		
		
		content.add(user);
		content.add(username);
		content.add(pw);
		content.add(password);
		content.add(loginButton);
		content.add(quitButton);
		
		window.add(content);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(280, 150);
		window.setVisible(true);
		
		
	}
	
	private class ButtonHandler extends KeyAdapter implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String uname = username.getText();
			String pass = new String(password.getPassword());
			
			//osigurati da neko ne unese samo jedan space, ili par spaceova, pa zamijenimo sve razmake.
			uname = uname.replaceAll(" ","");
			pass = pass.replaceAll(" ", "");
			
			System.out.println(uname);
			System.out.println(pass);
			
			//If user didnt enter username or password, programs pops an error window.
			if(uname.equals("") || pass.equals("")) {
				showError("You need to enter both username or password!!!");
				return;
			}
			
			Socket client;
			try {
				client = new Socket(host, port); //napravimo socket
				
				OutputStream os = client.getOutputStream();
				InputStream is = client.getInputStream();
				
				//prvo šaljemo username i password
				os.write((username + "\n").getBytes());
				os.write((password + "\n").getBytes());
				
				//onda čekamo povratnu informaciju od servera, da li je uspjelo logovanje
				int result = is.read(); //ako je result 0 onda startamo GUI, ako je -1, bacamo error korisniku
				
				if(result == 0) {
					ChatGui gui = new ChatGui(client);
					new Thread(gui).start();
				} else {
					showError("Username or password are not valid!");
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
		
	}
	
	
	/**
	 * This method allows us to display program errors and warning useing JOptionPane
	 * @param message
	 */
	private void showError(String message) {
		JOptionPane.showMessageDialog(null, message, "ERROR", JOptionPane.WARNING_MESSAGE);
	}
	
	


	
	
}
