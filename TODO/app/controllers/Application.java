package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;
import models.*;
import views.html.*;

public class Application extends Controller {

	static Form<Task> submitForm = new Form<Task>(Task.class);
	
    public static Result index() {
    	
        return ok(index.render("Welcome to TODO.", submitForm));
    }
    
    public static Result createTask() {
    	Task.create(submitForm.bindFromRequest().get());
    	
    	return index();
    }
    
    public static Result deleteTask() {
    	return TODO;
    	
    }
    
}
