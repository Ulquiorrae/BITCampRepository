package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatGUI implements KeyListener, Runnable {

	private JTextArea textArea;
	private JTextField textField;
	private Socket connection;
	private InputStream is;
	private OutputStream os;

	public ChatGUI(Socket connection) throws IOException {
		
		this.connection = connection;
		this.is = connection.getInputStream();
		this.os = connection.getOutputStream();
		
		JFrame frame = new JFrame("Chat");

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(400, 300));

		this.textArea = new JTextArea();
		// textArea.setPreferredSize(new Dimension(300,200)); //iskomentarisano
		// jer JScroll dodaje čitav textarea sa scrollbarom. Nije bilo potrebno
		// dodavati textArea zasebno pa na njega scrool
		textArea.setLineWrap(true);
		textArea.setEditable(false);

		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setPreferredSize(new Dimension(390, 220));
		panel.add(scroll);
		scroll.setVisible(true);

		this.textField = new JTextField();
		textField.setPreferredSize(new Dimension(200, 25));

		JButton send = new JButton("SEND");
		send.setPreferredSize(new Dimension(100, 25));

		send.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText();
				String old = textArea.getText();
				str = str + "\n";
				try {
					os.write(str.getBytes());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				textArea.setText(old + str);
			}
		});

		textField.addKeyListener(this);

		// panel.add(textArea); //iskomentarisano jer JScroll dodaje čitav
		// textarea sa scrollbarom. Nije bilo potrebno dodavati textArea zasebno
		// pa na njega scrool
		panel.add(textField);
		panel.add(send);

		frame.add(panel);

		frame.setSize(new Dimension(400, 300));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == 10) {
			String str = textField.getText();
			String old = textArea.getText();
			str = str + "\n";
			try {
				os.write(str.getBytes());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			textArea.setText(old + str);
			textField.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	
	public void listenForNetwork() throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(is));
		String line = null;
		while ((line = input.readLine()) != null) {
			if (!line.equals("")) {
				textArea.append("Client: " + line + "\n");
				line = null;
			}
		}
	}

	@Override
	public void run() {
		try {
			listenForNetwork();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
