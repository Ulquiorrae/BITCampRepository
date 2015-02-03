
public class UcitavanjeUFile {

	public static void main(String[] args) {

		int broj=0;
		int suma=0;
		
		TextIO.writeUserSelectedFile();
		
		for(int i=0; i<20; i++){
			TextIO.putln(broj++);
		}
		
		TextIO.readUserSelectedFile();
		
		while(TextIO.eof() !=true){
			
			try{
			String line=TextIO.getln();
			int number=Integer.parseInt(line);
			suma=suma+number;
			} 
			catch(NumberFormatException e){
				TextIO.putln("NE NE NE NE ");
			}
			catch(IllegalArgumentException ia){
				TextIO.putln("SKONTATI GETWORD!!");
				
			}
		}
	
		System.out.println("SUma brojeva je: "+suma);
		
		
	}

}
