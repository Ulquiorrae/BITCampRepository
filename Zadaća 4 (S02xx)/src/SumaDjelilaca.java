import java.util.InputMismatchException;
import java.util.Scanner;
public class SumaDjelilaca {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int broj;
		int suma=0;
		boolean tacno=false;
		
		while(tacno==false){
			 
            try{
            	
            	while(true){
                    System.out.println("Unesi jedan prirodan broj: ");
                    broj=in.nextInt();
                    
                    if(broj==0) {
                    	System.out.println("KRAJ!");
                    	return;
                    }
                    for(int i=1;i<=broj;i++){
                    	
                    	if(broj%i==0) suma=suma+i;

                    }

                    System.out.printf("Suma svih djelilaca broja %d je: %d",broj,suma);
                    System.out.println();
                    suma=0;
                    break;
            	}
            }
            catch(InputMismatchException exception){
                   
                    System.out.println("Molimo vas da unesete cijeli broj!");
                    in.nextLine();
                   
            }
           
            }

		
		
		
		
		
		
		
	}
}
