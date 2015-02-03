import java.util.InputMismatchException;
import java.util.Scanner;
public class ParneNeparneCifre {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		boolean tacno=false;
		int broj;
		int neparneCifre;
		int parneCifre;
		
		
		while(tacno==false){
            try{
            	
            	while(true){
                    System.out.println("Unesi jedan prirodan broj: ");
                    broj=in.nextInt();
                    
                    if(broj==0) {
                    System.out.println("KRAJ!");
                    return;
                    }
                    
                    System.out.println("Unesi true za parne ili false za neparne cifre broja: ");
                    boolean parni=in.nextBoolean();
                    
                    if(parni==true){
                    	
                    	parneCifre=podbroj(broj,true);
                    	System.out.println("Parne cifre unesenog broja su: "+parneCifre);
                    	return;
                    }
                    if(parni==false){
                    	
                    	neparneCifre=podbroj(broj,false);
                    	System.out.println("Neparne cifre unesenog broja su: "+neparneCifre);
                    }
                    
                    
                    break;
            	}
            }
            catch(InputMismatchException exception){
                   
                    System.out.println("Molimo vas da unesete cijeli broj!");
                    in.nextLine();
            }
            }
	}
	

	/**
	 * Ova funkcija tipa int prima uneseni broj tipa integer i boolean vrijednost true ili false.
	 * Ukoliko je boolean vrijednost koja je proslijeđena TRUE, onda funkcija vraća broj tipa integer koji sadrži samo parne cifre tog broja
	 * Ukoliko je boolean vrijednost koja je proslijeđena FALSE, onda funkcija vraća broj tipa integer koji sadrži samo neparne cifre tog broja
	 * @param Broj "n" tipa integer
	 * @param Vrijednost "parnost" tipa boolean
	 * @return Broj tipa integer
	 */
	public static int podbroj(int n,boolean parnost){
		
		int obrnutiBroj=0;
		
		if(parnost==true){
			
			int temp=n;
			int noviBroj=0;
			
			while( temp != 0 ){
		      
				noviBroj = noviBroj * 10;
				
				if((temp%10)%2==0){
				noviBroj = noviBroj + temp%10;
				}
				else{
					
					noviBroj=noviBroj/10;
				}
		          temp = temp/10;
		    }
				
			int temp1=noviBroj;
			
			while( temp1 != 0 ){
		      
				obrnutiBroj = obrnutiBroj * 10;
				obrnutiBroj = obrnutiBroj + temp1%10;
		          temp1 = temp1/10;
		    }
		}
		
		if(parnost==false){
			

			int temp=n;
			int noviBroj=0;
			
			while( temp != 0 ){
			      
				noviBroj = noviBroj * 10;
				
				if((temp%10)%2!=0){
				noviBroj = noviBroj + temp%10;
				}
				else{
					
					noviBroj=noviBroj/10;
				}
		          temp = temp/10;
		    }
				
			int temp1=noviBroj;
			
			while( temp1 != 0 ){
		      
				obrnutiBroj = obrnutiBroj * 10;
				obrnutiBroj = obrnutiBroj + temp1%10;
		          temp1 = temp1/10;
		    }
			
		}
		return obrnutiBroj;
	}
	
	}
