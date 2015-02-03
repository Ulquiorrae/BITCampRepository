public class ArgumentiVježba {
	
public static void main(String[] args) {
	
	int suma=0;
	
	if(args.length==0){
		
		System.out.println("Greška: Dodajte argumente koje program treba sabrati! ");
	}
	for(String brojevi : args){
		System.out.println(brojevi);
	}
	System.out.println();
	
	for(String arg : args){
		try{
		suma=suma + Integer.parseInt(arg);
		}
		catch(NumberFormatException e){
			System.out.printf("UPOZORENJE! Vrijednost %s nije ispravan broj. Preskačem!", arg);
		}
	}
	System.out.println("Suma brojeva je: "+suma);
}
}
