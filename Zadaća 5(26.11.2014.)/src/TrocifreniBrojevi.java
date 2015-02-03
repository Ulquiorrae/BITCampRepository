import java.util.Scanner;
import java.util.InputMismatchException;
public class TrocifreniBrojevi {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		int []djeljivi;
		djeljivi=new int[1000];
		int broj=0;
		boolean tacno=false;
		
		while(tacno==false){
			
			try{
				
				System.out.println("Unesi jedan prirodan broj: ");
				broj=in.nextInt();
				
				if(broj==0){
					
					System.out.println("Djeljenje sa nulom nije moguće!");
					continue;
				}
				
				if(broj<0){
					System.out.println("Unesi prirodan broj!");
					continue;
				}
				break;
			}
			catch(InputMismatchException exception){
				
				System.out.println("Molimo vas da unesete broj!");
                in.nextLine();
			}
			
		}
		
		djeljivi=trocifreniBrojeviDjeljivisaBrojem(broj);
		
		for(int i=0;i<djeljivi.length;i++){
			
			System.out.print(djeljivi[i]+" ");
			
		}
	}
	
	/**
	 * Ova funkcija prima broj tipa integer a vraća niz koji sadrži sve trocifrene brojeve koji su djeljivi sa tim brojem
	 * @param Prirodni broj tipa integer
	 * @return Niz btrocifrenih brojeva tipa integer
	 */
	public static int[] trocifreniBrojeviDjeljivisaBrojem(int broj){
		
		int[]niz;
		niz=new int [1000];
		int j=0;
		
		for(int i=100;i<1000;i++){
			
			if(i%broj==0){
				
				niz[j]=i;
				
			}
			else{
				j--;
			}
			j++;
		}
		
		return niz;
	}
	

}
