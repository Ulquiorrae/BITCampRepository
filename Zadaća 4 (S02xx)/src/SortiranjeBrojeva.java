import java.util.Arrays;
import java.util.Scanner;

public class SortiranjeBrojeva {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		
		int broj1,broj2,broj3;
		int niz[];
		int brojac=0;
		
		niz=new int[3];
		
		
		System.out.println("Unesi prvi broj: ");
		broj1=in.nextInt();
		
		if(broj1<50 || broj1>200){
			
			System.out.println("GREŠKA! Unesi broj izmeðu 50 i 200!");
			return;
		}
		niz[0]=broj1;
		brojac++;
		
		System.out.println("Unesi drugi broj: ");
		broj2=in.nextInt();
		
		if(broj2<50 || broj2>200){
			
			System.out.println("GREŠKA! Unesi broj izmeðu 50 i 200!");
			return;
		}
		niz[1]=broj2;
		
		if(broj2!=broj1) brojac++;
		
		System.out.println("Unesi treæi broj: ");
		broj3=in.nextInt();
		
		if(broj3<50 || broj3>200){
			
			System.out.println("GREŠKA! Unesi broj izmeðu 50 i 200!");
			return;
		}
		niz[2]=broj3;
		
		if(broj3!=broj1 && broj3!=broj2) brojac++;
		
		Arrays.sort(niz);
		
		System.out.println("Sortiran niz glasi: ");
		for(int i=0;i<niz.length;i++){
			
			System.out.println(niz[i]);
			
		}
		
		System.out.printf("Razlièitih brojeva u nizu je: %d",brojac);
		
		
	}
	
}
