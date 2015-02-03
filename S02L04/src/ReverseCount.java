import java.util.Scanner;
public class ReverseCount {

	public static void main(String args[]){
		
		Scanner in=new Scanner(System.in);
		
		int[]numbers;
		int count=0;
		int num;
		
		numbers=new int[100];
		count=0;
		
		System.out.println("Enter 100 positive integers, enter 0 to stop the loop: ");
		
		for(int i=0;i<100;i++){
			
			num=in.nextInt();
	
			if(num<=0){
				System.out.println("GOTOVO!");
				break;
			}
			
			numbers[i]=num;
			count++;
		}
		System.out.println("Brojevi ispisani unazad su: ");
		for(int i=count-1;i>=0;i--){
			
			System.out.printf("%d ",numbers[i]);
			
		}
		
		
		
	}
}
