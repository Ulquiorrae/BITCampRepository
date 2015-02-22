package ba.bitcamp.controller;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import ba.bitcamp.model.*;
import ba.bitcamp.view.*;

public class ApplicationController {

	/**
	 * calls the method to show the home
	 * view
	 */
	public static void home(){
		//prikaz home GUI-a
		ApplicationView.home();
	}
	
	/**
	 * calls the method to show the add form
	 */
	public static void addContact(){
		ApplicationView.addContact();
	}
	
	public static void create(String name, String surname, String number){
		Contact newContact = new Contact(name, surname, number);
		if( newContact.save() == true){
			//TODO redirect to contact info
			show(newContact.getId());
		} else {
			JOptionPane.showMessageDialog(null, "There has been a mistake", "Error saving Contact", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public static void list(){
		Contact[] all = Contact.all();
		ApplicationView.list(all);
	}
	
	public static void show(int id){
		Contact current = Contact.find(id);
		ApplicationView.show(current);
	}
	
	public static void update(int id){
		Contact current = Contact.find(id);
		ApplicationView.updateContact(current);
	}
	
	public static void update(Contact c){
		c.update();
		ApplicationView.show(c);
	}
	
	public static void delete(int id){
		Contact.delete(id);
		list();
	}
	
	public static void main(String[] args) {	
		//try to initialize the database connection
		try {
			Application.init("phonebook");
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
		//initialize the main view
		Main.init();
		home();
	}

}
