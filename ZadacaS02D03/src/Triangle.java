
import java.util.Scanner;
public class Triangle {

	public static void main(String args []){
	Scanner in=new Scanner(System.in);
	
	int stranica;
	int f=1;
	
	System.out.println("Unesi du�inu stranice trougla!!");
	stranica=in.nextInt();
	
	
	for(int i=1;i<=stranica;i++)
	{
		for(int j=1;j<=stranica;j++)
		{
			if(j<=i) System.out.print(" " + f++);
			
		}
		System.out.println();
		f=1;
	}
	
	
	
	}
}