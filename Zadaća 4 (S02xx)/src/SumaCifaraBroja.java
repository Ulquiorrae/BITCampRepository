import java.util.InputMismatchException;
import java.util.Scanner;
public class SumaCifaraBroja {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int broj;
		int cifra;
		int suma=0;
		int temp;
		boolean tacno=false;
		
		while(tacno==false){
			 
            try{
            	
            	while(true){
                    System.out.println("Unesi jedan prirodan broj: ");
                    broj=in.nextInt();
                    
                    temp=broj;
                    while(temp!=0){
            			
            			cifra=temp%10;
            			suma=suma+cifra;
            			
            			temp=temp/10;

            		}
            		
            		System.out.printf("Suma cifara broja %d je %d. \n",broj,suma);
            		return;
            	}
            }
            catch(InputMismatchException exception){
                   
                    System.out.println("Molimo vas da unesete cijeli broj!");
                    in.nextLine();
                   
            }
           
            }
		
		
		
		
	}
}
