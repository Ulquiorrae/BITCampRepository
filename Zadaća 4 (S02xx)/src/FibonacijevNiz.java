import java.util.Scanner;
public class FibonacijevNiz {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n;
		int niz[];
		int clan;
		int j=0;
		
		System.out.println("Unesi koji èlan Fibonaèijevog niza želiš da ispišeš: ");
		n=in.nextInt();
		
		if(n<0||n>50) {
			
			System.out.println("GREŠKA! Broj je van opsega(0-50)!");
			return;
		}
		
		niz=new int[n];
		
		niz[0]=1;
		niz[1]=1;
		
		for(int i=2;i<n;i++){
			
			niz[i]=niz[i-1]+niz[i-2];
			
		}
		
		System.out.printf("%d. èlan Fibonaèijevog niza je: %d",n,niz[n-1]);
	}
}
