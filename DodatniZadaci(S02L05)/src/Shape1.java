/**
 * Napišite program koji traži od korisnika da unese prirodne brojeve m i n, pri čemu je m > n. Nakon
 * toga, program treba da na ekranu iscrta figuru oblika “< >” sastavljenu od zvjezdica, čija je širina m a visina n znakova.
 *
 * Primjer:    *         *
			  *           *
			 *             *
			*****************
			 *             *
			  *           *
			   *         *
 */



import java.util.Scanner;
public class Shape1 {
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int n,m,temp=0;
		
		System.out.println("Unesi prvi prirodan broj m: ");
		m=in.nextInt();
		
		System.out.println("Unesi prvi prirodan broj n: ");
		n=in.nextInt();
		
		if(n>m){
			
			temp=n;
			n=m;
			m=temp;
			
		}
		
		
		
		
	}

}
