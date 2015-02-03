
public class UnosZadatak2 {

	public static void main(String[] args) {
		
		TextIO.readUserSelectedFile();
		
		
		String ime=TextIO.getWord();
		String broj=TextIO.getWord();
		
			
		if(Integer.parseInt(broj)>18) System.out.println("PUNOLJETAN");	
		else System.out.println("MALOLJETAN");
		
		}
		
		
	}
	
