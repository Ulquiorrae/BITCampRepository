package home;
import java.util.Scanner;
public class Triangle {

	public static void main(String args []){
	Scanner in=new Scanner(System.in);
	
	int stranica;
	
	System.out.println("Unesi dužinu stranice kvadrata!!");
	stranica=in.nextInt();
	
	
	for(int i=1;i<=stranica;i++)
	{
		for(int j=1;j<=stranica;j++)
		{
			if(j<=i) System.out.print("*");
		}
		System.out.println();
	}
	
	
	
	}
}