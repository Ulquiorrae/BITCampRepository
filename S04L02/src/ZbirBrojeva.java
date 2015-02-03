import java.util.InputMismatchException;
import java.util.Scanner;
public class ZbirBrojeva {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		try{
			
			if(args.length != 0){
				
				if(jeProst(Integer.parseInt(args[0])) && (Integer.parseInt(args[0]) != 0)){
					System.out.printf("Broj %s je prost. \n",args[0]);
				}
				else if((Integer.parseInt(args[0]) != 0)){
					System.out.printf("Broj %s nije prost. \n",args[0]);
				}
			}
		}
		catch(NumberFormatException e){
			
			System.out.println("GREŠKA!");
		}
		unesiInteger();
	}
	
private static boolean jeProst(int parseInt) {
		
		for(int i=2; i<parseInt; i++){
			
			if(parseInt%i==0) return false;
			
		}
		
	return true;
	}

private static void unesiInteger() {
		
		Scanner in=new Scanner(System.in);
		
		while(true){
			System.out.println("Unesi jedan cijeli broj: ");
			try{
				System.out.println();
				int broj=in.nextInt();
				if(broj==0) {
					
					System.out.println("KRAJ!");
					break;
				}
				
				if(prost(broj)==true) System.out.println("Broj je prost!");
				else System.out.println("Broj nije prost!");
				
			}
			catch(InputMismatchException exception){
				
				System.out.println("Molimo vas da unesete cijeli broj!");
				in.nextLine();
			}
		}
	}

	private static boolean prost(int broj) {
	
		for(int i=2; i<broj; i++){
			
			if(broj%i==0) return false;
		}
		return true;
	}
	
}
