import java.util.Scanner;
/**
 * ispisuje piramidu:
 * 1
 * 12
 * 123
 * ...
 * 123...n
 * @param n
 */
public class Piramide {

	public static void main(String args []){
	Scanner in=new Scanner(System.in);
	
	int stranica;
	int f=1;
	
	System.out.println("Unesi dužinu stranice trougla!!");
	stranica=in.nextInt();
	
	
	for(int i=1;i<=stranica;i++)
	{
		for(int j=1;j<=stranica-i;j++){
			System.out.printf("%3s", "");
			
		}
		for(int k=1;k<=i;k++){
			
			System.out.printf("%3d", k);
			
			
		}
		System.out.println();
		
	
	}
	
	
	
	}
}

	
		
	
	


