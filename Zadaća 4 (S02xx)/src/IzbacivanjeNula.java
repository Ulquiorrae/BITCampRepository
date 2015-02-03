import java.util.Scanner;
public class IzbacivanjeNula {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int broj,broj2;
		int brojac=0;
		int cifra,cifra1;
		int i=0;
		int br=0;
		
		
		System.out.println("Unesi jedan cijeli broj: ");
		broj=in.nextInt();
		broj2=broj;
		
		System.out.println(broj2);
		
		while(broj!=0){
			
			cifra=broj%10;
			
			brojac++;
			broj=broj/10;
			
		}
		
		int niz[];
		niz=new int[brojac];
						
	
		while(broj2!=0){
			
			cifra1=broj2%10;
			
			if(cifra1!=0){
				niz[i]=cifra1;
				br++;
			}
			else {
					i--;
					
					}
			
			
			broj2=broj2/10;
			i++;
			
		}
		
	System.out.println("Uneseni broj bez nula je:");
	
	for(int j=br-1;j>-1;j--){
		
		System.out.print(niz[j]);
		
		
	}
		
	}
	
}

