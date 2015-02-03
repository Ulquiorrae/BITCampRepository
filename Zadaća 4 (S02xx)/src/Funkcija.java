import java.util.Scanner;
import java.lang.*;
public class Funkcija {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int a,b,c;
		int funkcija;
		int x;
		
		System.out.println("Unesi koeficijent a: ");
		a=in.nextInt();
		
		System.out.println("Unesi koeficijent b: ");
		b=in.nextInt();
		
		System.out.println("Unesi koeficijent c: ");
		c=in.nextInt();
		
		if(a<-10||a>10||b<-10||b>10||c<-10||c>10){
			
			System.out.println("Koeficijenti a,b,c nisu u zadanom intervalu!");
			return;
		} 
		
		System.out.println("Unesi vrijednost varijable x: ");
		x=in.nextInt();
		
		funkcija=(int) (a*(Math.pow(x, 2)))+b*x+c;
		
		System.out.printf("Vrijednost funkcije u taèki %d je: ",x);
		System.out.printf("f(%d)=%d",x,funkcija);
		System.out.println();
		
		
	}
}
