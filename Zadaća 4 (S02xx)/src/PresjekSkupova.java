import java.util.Scanner;
public class PresjekSkupova {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int a,b,c,d;
		
		System.out.println("Skup S1=[a,b].\nUnesi a: ");
		a=in.nextInt();
		System.out.println("Unesi b:");
		b=in.nextInt();
		
		System.out.println("Skup S2=[c,d].\nUnesi c: ");
		c=in.nextInt();
		System.out.println("Unesi d:");
		d=in.nextInt();
		
		if((a<c && b<d)||(a>c && b>d)){
			System.out.println("Skupovi S1 i S2 se ne sijeku!");
			return;
		}
		
		
		if(a<c&&b>d) System.out.println("Skup S2 je sadržan u skupu S1!");
		
		if(c<a&&d>b) System.out.println("Skup S1 je sadržan u skupu S2!");
		
		if(a>c&&d<b) System.out.printf("Presjek skupova S1 i S2 je skup: [%d,%d]",a,d);
		if(c>a&&b<d) System.out.printf("Presjek skupova S1 i S2 je skup: [%d,%d]",c,b);

		
	}
}