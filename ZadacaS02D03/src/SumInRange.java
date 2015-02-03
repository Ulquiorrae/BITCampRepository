import java.util.Scanner;
public class SumInRange {

	//Print out all the numbers in a range in one column and the sum of the divisors for each number in the second column.

	
	public static void main(String[] args) {
		
		int start;
		int end;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter starting position: ");
		start=in.nextInt();
		
		System.out.println("Enter finishing position: ");
		end=in.nextInt();
		
		
		for(int i=start;i<end;i++){
			
			int sum=0;
			
			for(int j=1;j<i;j++){
				
				if(i%j==0){
					
					sum=sum+j;
						
				}
			}
				
				System.out.printf("%d \t %d \n" ,i,sum);

			
		}
		
		
		
	}
}
