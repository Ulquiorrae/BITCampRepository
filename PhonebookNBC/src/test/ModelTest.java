package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sound.midi.SysexMessage;

import ba.bitcamp.vedadz.model.Application;
import ba.bitcamp.vedadz.model.Contact;

public class ModelTest {

	private static class DBConnection {

		
		private Connection db;
		
		public void DBConnection() throws SQLException{
			db = DriverManager.getConnection("jdbc:sqlite:phonebook.db");
			
		}
		
		public void cleanDatabase(String[] tableNames) {
			Statement stmt = null;
			try {
				stmt = db.createStatement();
			} catch (SQLException e) {
				System.err.println("Unable to create statement.");
				System.exit(1);
			}
			for(int i=0; i < tableNames.length; i++) {
				String sql = String.format("DELETE FROM %s;", tableNames [i]);
				try {
					stmt.execute(sql);
				} catch (SQLException e) {
					System.err.println("Not able to delete data from table" + tableNames[i]);
				}
			}
		}
		
	}
	
	
	private static void testFind() {
		Contact c = Contact.find(1);
		if(!c.getName().equals("Bob") || !c.getSurname().equals("Bobs") || !c.getPhoneNumber().equals("1234565")) {
			//TODO add equals method to Contact class and rewrite this part of the test.
			System.err.println("Contact not FOUND!");
		}
		c = Contact.find(4);
		if(c != null) {
			System.err.println("Found non existing contact.");
		}
	}
	
	//metoda za testiranje
	private static void testAll() {
		
		Contact[] all = Contact.all();
		
		if(all.length != 3) {
			System.err.println("Lenght does not match!");
			return;
		}
		
		if(!all[0].getName().equals("Bob") || !all[0].getSurname().equals("Bobs") || !all[0].getPhoneNumber().equals("1234565")) {
			System.err.println("Contact not FOUND!");
		}
		if(!all[1].getName().equals("Jeff") || !all[1].getSurname().equals("Jefferson") || !all[1].getPhoneNumber().equals("98356565")) {
			System.err.println("Contact not FOUND!");
		}
		if(!all[2].getName().equals("Jane") || !all[2].getSurname().equals("Janice") || !all[2].getPhoneNumber().equals("2745858")) {
			System.err.println("Contact not FOUND!");
		}
	}
	
	public static void main(String[] args) {
		try {
			Application.init("PhonebookTest");
		} catch (SQLException e) {
			System.err.println("Test failed : no connection.");
			System.exit(1);
		}
		
		new Contact(1, "Bob", "Bobs", "1234565").save();
		new Contact(2, "Jeff", "Jefferson", "98356565").save();
		new Contact(3, "Jane", "Janice", "2745858").save();
		
		/*
		System.out.println("Testomg find: ");
		testFind();
		System.out.println("Testing all: ");
		testAll();
		
		String[] tableNames = {"contacts"};
		new DBConnection().cleanDatabase(tableNames);
		System.out.println("Done testing.");
		*/
		
	}
	
}
