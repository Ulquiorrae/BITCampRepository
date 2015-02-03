import java.util.Scanner;
public class IstiZnakoviUStringu {

	public static void main(String args[]) {

		
		Scanner in = new Scanner(System.in);
		
		String recenica;
		System.out.println("Unesi jednu recenicu/string: ");
		recenica = in.next( );
		String temp1;
		String temp2;
		int i=0;
		int j=0;
		
		for(i=0;i<recenica.length()-1;i++){
			
			temp1=recenica.substring(i,i+1);
		
		for(j=0;j<recenica.length()-1;j++){
				 
			temp2=recenica.substring(j,j+1);
		
		if(temp1.equals(temp2)==true){
			
		System.out.println("Svi znakovi u stringu nisu različiti !!!");	
		return;
			
		}
		
		
		
		}
		}
		
		System.out.println("SVI ZNAKOVI SU RAZLIĆITI !!!");	
		
		
	
		
		
		}
		
			
			
		}