import java.util.Scanner;
public class ZbirSvihProstihBrojevaUIntervalu {

	/**
	 * Program izračunava sumu svih prostih brojeva u intervalu (start,end)
	 * @param args
	 */
	public static void main(String[] args) {
		
		int start,end;
		int sum=0;
		System.out.println("Unesi početak intervala: ");
		start=TextIO.getInt();
		
		System.out.println("Unesi kraj intervala: ");
		end=TextIO.getInt();
		
		for(int i=start;i<end;i++){
			
			if(prost(i)==true){
				
				sum=sum+i;
				
			}
		}
		
		System.out.println("Suma je: "+sum);

	}
	
	/**
	 * Ova funkcija provjerava da li je neki broj prost
	 * @param broj koji je broj iz intervala (start,end)
	 * @return true ako je broj prost, a false ako broj nije prost
	 */
	public static boolean prost(int broj){
		
		for(int i=2;i<broj;i++){
			
			if(broj%i==0) return false;
		}
		return true;
	}

}
