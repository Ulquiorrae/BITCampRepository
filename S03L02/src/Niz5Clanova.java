import java.util.Scanner;
public class Niz5Clanova {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		
		int[]niz;
		niz=new int[5];
		
		for(int i=0;i<niz.length;i++){
			
			System.out.printf("Unesi %d. član niza: ",i+1);
			niz[i]=in.nextInt();
		}
		
		
		for(int i=0;i<niz.length;i++){
			
			System.out.printf(niz[i]+" ");
		}
		
   }
}
