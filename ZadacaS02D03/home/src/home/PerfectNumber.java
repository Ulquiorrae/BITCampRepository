package home;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String args []){
	Scanner in=new Scanner(System.in);
	
	int broj;
	int suma=0;
	
	System.out.println("Unesi jedan broj: "); 
	broj=in.nextInt();
	
	for(int i=1;i<broj;i++){
		
		if(broj%i==0){
			
			suma=suma+i;
			
		}
		
	}
	
	
	if(broj==suma){
		
		System.out.println("Broj je savr�en broj!");
		
		
	}
	else{
		
		System.out.println("Broj NIJE savr�en broj!");
		
	}
	
	
	}
}