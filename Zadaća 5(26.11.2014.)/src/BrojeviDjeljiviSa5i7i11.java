import java.util.Scanner;
import java.util.InputMismatchException;
public class BrojeviDjeljiviSa5i7i11 {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		int broj=0;
		int[]niz;
		niz=new int [1000];
		boolean tacno=false;
		
		while(!tacno){
			
			try{
				System.out.println("Unesi jedan cijeli broj: ");
				broj=in.nextInt();
				break;
				
				
				
			}
			catch(InputMismatchException exception){
				
				System.out.println("Molimo vas da unesete cijeli broj!!");
				in.nextLine();
			}
		}
		int j=0;
		for(int i=1;i<=broj;i++){
			
			
			if (jeDijeljiv(i)==true){
				
				niz[j]=i;
			}
			else{
				j--;
			}
			j++;
		}
		
		System.out.printf("Brojevi u intervalu (0,%d) koji su djeljivi sa 5,7 ili 11 su: ",broj);
		for(int i=0;i<niz.length;i++){
			
			if(niz[i]!=0){
			System.out.print(niz[i]+" ");
			}
		}
	
	}
	
	/**
	 * Ova funkcija prima kao parametar broj tipa integer a vraća vrijednost true(ako je broj djeljiv sa 5,7 ili11) ili false(ako nije)
	 * @param Broj tipa integer.
	 * @return True ako je broj djeljiv sa 5,7 ili 11, a false ako nije.
	 */
	public static boolean jeDijeljiv(int broj){
		
			if(broj%5==0 || broj%7==0 || broj%11==0) return true;
		
		return false;
	}
	
}
