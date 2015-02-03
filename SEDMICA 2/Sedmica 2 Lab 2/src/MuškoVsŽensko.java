import java.util.Scanner;
public class MuškoVsŽensko {

public static void main(String args[]) {
		
	Scanner in = new Scanner(System.in);
	
	String ime;
	
	System.out.print("Unesi svoje ime: ");
	ime = in.next();
	String capsIme=ime.toUpperCase();
	
	String zadnji=capsIme.substring(capsIme.length()-1,capsIme.length());
	int slovo=Integer.parseInt(zadnji);
	
	
	if(slovo==10){
		System.out.println("Ti si djevojka ! ");
		
		
	}
	
	else{
		System.out.println("Ti si momak ! ");
		
	}
	

	
			
	
}

}
