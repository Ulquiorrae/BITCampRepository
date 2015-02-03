import java.util.Scanner;
public class PrimeInRange {

	public static void main(String args []){
	Scanner in=new Scanner(System.in);
	
	int n1,n2;
	int prost=1;
	String prime=" ";
	System.out.println("Unesi prvi broj: "); 
	n1=in.nextInt();
	
	
	System.out.println("Unesi drugi broj: "); 
	n2=in.nextInt();
	
	
	for(int i=n1;i<n2;i++){
	
		if(i>1){
			
			for(int j=2;j<=i/2;j++){
				
				
				if(i%j==0){
					
					prost=0;
	
				}	
				
				if(prost==1){
					
					prime=prime + i + " ";
				}
				prost=1;
			}

	}
else{
			
			System.out.println("Broj nije prost broj!!!");
		}
	}
	System.out.println("Prosti brojevi u unesenom intervalu su: " + prime);
	
}
}