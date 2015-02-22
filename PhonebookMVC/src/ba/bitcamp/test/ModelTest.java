package ba.bitcamp.test;

import java.sql.*;

import ba.bitcamp.model.Application;
import ba.bitcamp.model.Contact;

public class ModelTest {


	private static void testFind() {
		Contact c = Contact.find(1);
		// TODO add equals method to Contact class and rewrite this part of the
		// test
		if (!c.getName().equals("Bob") || !c.getSurname().equals("Bobs")
				|| !c.getNumber().equals("1234565")) {
			System.err.println("Contact not equal");
		}
		c = Contact.find(4);
		if (c != null)
			System.err.println("Found non existing contact");
	}

	private static void testAll() {
		Contact[] all = Contact.all();

		if (all.length != 3) {
			System.err.println("Length does not macth");
			return;
		}

		if (!all[0].getName().equals("Bob")
				|| !all[0].getSurname().equals("Bobs")
				) {
			System.err.println("Contact not equal");
		}

		if (!all[1].getName().equals("Jeff")
				|| !all[1].getSurname().equals("Jefferson")) {
			System.err.println("Contact not equal");
		}

		if (!all[2].getName().equals("Jane")
				|| !all[2].getSurname().equals("Janice")
				|| !all[2].getNumber().equals("3986247")) {
			System.err.println("Contact not equal");
		}

	}

	public static void main(String[] args) {
		try {
			Application.init("phonebook_test");
			} catch (SQLException e) {
			System.err.println("Test failed: no connection");
			System.exit(1);
		}
		
		new Contact(1, "Bob", "Bobs", "1234565").save();
		new Contact(2, "Jeff", "Jefferson", "565897").save();
		new Contact(3, "Jane", "Janice", "3986247").save();
		
		
		System.out.println("Testing find: ");
		testFind();
		System.out.println("Testing all: ");
		testAll();
		
		String[] tableNames = {"contacts"};
		
		System.out.println("Done testing");
		
	}

}
