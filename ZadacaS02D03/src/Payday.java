import java.util.Scanner;
public class Payday {
	public static void main(String args []){ //Program to print pay based on base pay and hours worked.
		
		
		Scanner in=new Scanner(System.in);
		
		int basePay;
		int hoursWorked;
		int payment;
		
		System.out.println("Enter you base payment - how much do you earn per hour?");
		basePay=in.nextInt();
		
		System.out.println("Enter how many hours did you work: ");
		hoursWorked=in.nextInt();
			
		payment=basePay*hoursWorked;
		
		System.out.println("Today, you earned: "+ payment + " km, keep up the good work!" );
		
		
	}
}
