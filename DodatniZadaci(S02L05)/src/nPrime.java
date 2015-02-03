/**
 * Napišite program koji za prirodan broj n unesen sa tastature nalazi i ispisuje n-ti po redu prost broj.
Na primjer, ukoliko se unese n = 30, program treba da ispiše 113, jer je 113 trideseti po redu prost
broj.
 */

import java.util.Scanner;
public class nPrime {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int pozicija;
		int brojac=-1;
		int j=0;
		
		System.out.println("Unesi koji po redu prosti broj želiš da ispišeš: ");
		pozicija=in.nextInt();
		pozicija++;
		int niz[];
		niz=new int[pozicija];
		
		for(int i=2;i>0;i++){
			
			if(prost(i)==true){
				
				niz[j]=i;
				brojac++;
				j++;
				
			}
			
			if(brojac==pozicija-1){
				System.out.printf("%d. prosti broj po redu je %d !", pozicija-1,niz[brojac]);
				break;
			}
			
		}
				
		}
		

	public static boolean prost(int a){
		
		int tacno=1;
		
		for(int i=2;i<a/2;i++){
			
			if(a%i==0){
				tacno=0;
				break;
				
			}
			
		}
		
		if(tacno==0){
		return false;
		}
		
		return true;
		
	}

}
