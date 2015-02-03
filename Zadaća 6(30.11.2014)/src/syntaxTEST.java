
public class syntaxTEST {

	public static void main(String[] args) {

		int niz1[]=new int[] {1,2,3,4,5,6};
		int niz2[]=new int[] {1,2,3,4,5,6};
		
		int niz3[]=new int[6];
		
		int k=0;
		
		for(int i=0,j=0;i<niz1.length;i++,j++){
			
			niz3[k]=niz1[i]+niz2[j];
			k++;
			
		}
		
		System.out.println("Novi niz je: ");
		for(int i=0;i<niz3.length;i++){
			
			System.out.print(niz3[i]+ " ");
			
			
		}
		
		
		
	}

}
