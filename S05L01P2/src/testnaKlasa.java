
public class testnaKlasa {

	public static void main(String[] args) {
		
		int niz[]={12,2,33,41,15};
		int array1[]={1,2,3,4,5,6,7,8,9,10};
		int array2[]=new int[8];
//		int matrica[][] = AraayUtil.dajMatricu();
		boolean ascending;
		
		try{
//		AraayUtil.copyArrayExtend(array1,array2);
			
//		AraayUtil.pomjeriUdesno(array1);	
			
//		int kolona[]=AraayUtil.getColumn(matrica, 0);
			
//		int indexBroja=AraayUtil.linearSearch(niz,4);
//		System.out.println("Uneseni broj se nalazi na poziciji pod indexom: " + indexBroja);
			
		AraayUtil.sortArray(niz, true);	
		
		AraayUtil.printArray(niz);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}
