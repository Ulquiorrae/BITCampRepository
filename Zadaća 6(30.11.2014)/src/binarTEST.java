import java.util.Scanner;
public class binarTEST {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);

		System.out.println("Unesi jedan broj: ");
		int broj=in.nextInt();
		String binarniBroj="";
		String reverse="";
		int temp;
		
		while(broj!=0){
			
			temp=broj%2;
			binarniBroj=binarniBroj+temp;
			broj=broj/2;
		}
		
		for(int i=binarniBroj.length()-1;i>=0;i--) reverse=reverse+binarniBroj.charAt(i);
			
		System.out.printf("Broj %d u binarnom obliku: %s",broj,reverse);
		
		
	}
	
}
