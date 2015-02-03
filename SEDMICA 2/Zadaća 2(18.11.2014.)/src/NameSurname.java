import java.util.Scanner;
public class NameSurname {

	public static void main(String args[]){

		Scanner in=new Scanner(System.in);

		char flname;
		char flsurname;
		int brojacname;
		int brojacsurname;
		String namesurname;
		String name;
		String surname;

		System.out.println("Enter you name and surname divided by space: ");	
		namesurname=in.nextLine();
		
		name=namesurname.substring(0,namesurname.indexOf(" ",0));
		surname=namesurname.substring(namesurname.indexOf(" ",0)+1,namesurname.length());

		brojacname=name.length();
		brojacsurname=surname.length();

		flname=name.charAt(0);
		flsurname=surname.charAt(0);

		System.out.println("Your name is "+name + ", which has " +brojacname+ " characters.");
		System.out.println("Your surname is "+surname + ", which has " +brojacsurname+ " characters.");
		System.out.println("Your initials are: " +flname+ "." +flsurname+ ".");

	}
}
