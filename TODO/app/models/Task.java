package models;

import java.util.List;

import javax.persistence.*;

import play.data.validation.Constraints.MaxLength;
import play.data.validation.Constraints.MinLength;
import play.db.ebean.Model;

@Entity
public class Task extends Model {
	@Id
	public int id;
	
	@MinLength(2)
	public String name;
	//u Finder<> ide prvo Integer jer je to ID, a drugi parametar treba da bude ono što želimo da dobijemo, u ovom slučaju task
	static Finder<Integer, Task> find = new Finder<Integer, Task>(Integer.class, Task.class);
	
	public static void create(Task t) {
		t.save();
	}
	
	public static void remove(int id) {
		find.byId(id).delete();
	}
	
	public static List<Task> all() {
		return find.all(); //ode u bazu, pokupi sve taskove, strpa ih u objekte, strpa objekte u listu i vrati nam listu
		
		
	}
}
