package ba.bitcamp.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 * The contacts model we are using It is both a class definition and connection
 * to the database
 * 
 * @author benjamin
 *
 */
public class Contact extends Application {

	// primary key
	private int id;
	private String name;
	private String surname;
	private String number;
	// so we don't have to write it every time
	private final static String tableName = "contacts";

	public Contact() {
		this.id = -1;
		this.name = "Unknown";
		this.surname = "Unknown";
		this.number = "";
	}
	
	public Contact(int id, String name, String surname){
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	public Contact(String name, String surname, String number) {
		this.id = -1;
		this.name = name;
		this.surname = surname;
		this.number = number;
	}

	public Contact(int id, String name, String surname, String number) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.number = number;
	}

	/**
	 * Retrieves data for the contact with the given ID from the database and
	 * creates a object from it
	 * 
	 * @param id
	 *            id of the contact
	 * @return a object with the given id, null if there is no such contact
	 */
	public static Contact find(int id) {
		ResultSet res = Application.find(id, tableName);
		try {
			int cId = res.getInt("id");
			String cName = res.getString("name");
			String cSurname = res.getString("surname");
			String cNumber = res.getString("number");
			return new Contact(cId, cName, cSurname, cNumber);
		} catch (SQLException e) {
			System.err.println("Contact find: "+e.getMessage());
			return null;
		}
	}
	
	public boolean save(){
		String values = null;
		if(this.id != -1)
			values = String.format("('%d', '%s', '%s', '%s')", this.id, this.name, this.surname, this.number);
		else
			values = String.format("(?, '%s', '%s', '%s')", this.name, this.surname, this.number);
		int id = Application.save(tableName, values);
		if( id == -1)
			return false;
		else {
			this.id = id;
			return true;
		}
	}
	
	public static Contact[] all(){
		ResultSet rs = Application.all(tableName, "id, name, surname");
		if( rs == null)
			return new Contact[0];
		LinkedList<Contact> cl = new LinkedList<Contact>();
		try {
			while(rs.next()){
				int id = rs.getInt("id");
				String cName = rs.getString("name");
				String cSurname = rs.getString("surname");
				
				cl.add(new Contact(id, cName, cSurname));
			}
			Contact[] all = new Contact[cl.size()];
			cl.toArray(all);
			return all;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return new Contact[0];
		}
	}
	
	//update TABLENAME set kolone WHERE id = 'id'
	public void update(){
		String sql = String.format("name = '%s', surname = '%s', number = '%s'", this.name, this.surname, this.number);
		Application.update(tableName, this.id, sql);
	}
	
	public static void delete(int id){
		Application.delete(tableName, id);
	}

	public String getDisplayName(){
		return this.name + " " + this.surname;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
