import java.util.Scanner;
public class TrecaStranicaTrougla {

public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Unesi prvu stranicu trougla(a): ");
		a=in.nextInt();
		
		System.out.println("Unesi drugu stranicu trougla(b): ");
		b=in.nextInt();
		
		
		for(int i=1;i>0;i++){
			
			if((a+b>i)&&(a+i>b)&&(b+i>a)){
				
				System.out.printf("Da bi trougao sa stranicama %d cm i %d cm postojao, stranica c mora biti duga najmanje %d cm.",a,b,i);
				return;
				
			}
			
			
		}
		
	}
}
