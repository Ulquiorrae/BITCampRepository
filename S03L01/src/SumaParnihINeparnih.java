public class SumaParnihINeparnih {

	/**
	 * Program izračunava sumu svih parnih i neparnih brojeva u intervalu (start,end)
	 * @param args
	 */
	public static void main(String[] args) {
		
		int start,end;
		int sumaParnih=0,sumaNeparnih=0;
		System.out.println("Unesi početak intervala: ");
		start=TextIO.getInt();
		
		System.out.println("Unesi kraj intervala: ");
		end=TextIO.getInt();
		
		for(int i=start;i<end;i++){
			
			if(paran(i)==true){
				
				sumaParnih=sumaParnih+i;
				
			}
			else{
				sumaNeparnih=sumaNeparnih+i;
				
			}
		}
		
		System.out.println("Suma svih parnih brojeva u intervalu je: "+sumaParnih);
		System.out.println("Suma svih neparnih brojeva u intervalu je: " +sumaNeparnih);

	}
	
	/**
	 * Ova funkcija provjerava da li je neki broj paran broj
	 * @param broj koji je broj iz intervala (start,end)
	 * @return true ako je broj paran, a false ako broj nije paran
	 */
	public static boolean paran(int broj){
		
		if(broj%2==0) return true;
		
		return false;
	}

}

