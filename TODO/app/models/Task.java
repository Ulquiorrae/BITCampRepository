package models;

import javax.persistence.*;

import play.data.validation.Constraints.MinLength;
import play.db.ebean.Model;

@Entity
public class Task extends Model {
	@Id
	public int id;
	
	@MinLength(2)
	public String name;
	
	public static void create(Task t) {
		t.save();
	}
	

}
