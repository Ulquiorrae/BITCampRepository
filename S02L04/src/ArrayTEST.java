import java.util.Scanner;
public class ArrayTEST {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int broj;
		int[]niz;
		niz=new int[5];
		int brojac=1;
		int brojac2=1;
		int max=0;
		
		for(int j=0;j<niz.length;j++){
		System.out.printf("Unesi %d. član niza: ",brojac);
		System.out.println();
		niz[j]=in.nextInt();
		brojac++;
		}
		
		max=niz[0];
		for(int i=0;i<niz.length;i++){
			
			if(niz[i]>max){
				
				max=niz[i];
			}
			
		}
			
		System.out.printf("Najveći član niza je: %d", max);	
		System.out.println();
			
		
		

		
		for(int i=0;i<niz.length;i++){
			
			System.out.printf("%d. član niza je %d",brojac2,niz[i]);
			brojac2++;
			System.out.println();
		}
		
	}

}
