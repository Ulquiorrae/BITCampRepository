import java.util.Scanner;
public class IksOks {

	public static void main(String[] args) {
		
		igrajIgricuIksOks('X', 'O',' ');
		
	}

	private static void igrajIgricuIksOks(char prviIgrac, char drugiIgrac,char nijedanIgrac) {

		int aktivniIgrac=0; //0 - igracX;1 - igrac O
		String izabranoPolje=null;
		char[][] poljanaZaIgru=new char[3][3];
		boolean krajIgre=false;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				poljanaZaIgru[i][j]=nijedanIgrac;
			}
		}
		
//		for(int i=0,j=0;i<3 && j<3;){
//			poljanaZaIgru[i][j]=nijedanIgrac;
//			j++;
//			if(j==3){
//				j=0;
//				i++;
//			}
//		}
//		drugi nacin da se napiše ova gore dupla petlja, sa "i" i "j"
		
		do{
			do{
				
				izabranoPolje=unesiPolje(aktivniIgrac);
				
			}while(!izabranoPoljeJeIspravno(izabranoPolje,poljanaZaIgru,nijedanIgrac));
			
			postaviPolje((aktivniIgrac==0 ? prviIgrac : drugiIgrac),izabranoPolje,poljanaZaIgru); //ako je aktivni igrac true vrati prviigrac(X) ako nije 0 onda vrati drugiigrac(O)
			
			krajIgre=krajIgre(poljanaZaIgru,nijedanIgrac);
			
			if(!krajIgre){
				aktivniIgrac=promijeniAktivnogIgraca(aktivniIgrac);
				
			}
			ispisiStanjeIgrice(poljanaZaIgru);
		}while(!krajIgre);
		
		if(nemaPobjednika(poljanaZaIgru)){
			ispisiRemi();
		}
		else{
			ispisiPobjednika(aktivniIgrac == 0 ? prviIgrac : drugiIgrac);
			
		}
	}

	private static void ispisiStanjeIgrice(char[][] poljanaZaIgru) {

		for(int i=2; i>=0; i--){
			
			System.out.printf("+---+---+---+\n| %s | %s | %s |\n",poljanaZaIgru[i][0],poljanaZaIgru[i][1],poljanaZaIgru[i][2]);
			
		}
		System.out.println("+---+---+---+");
	}

	private static void ispisiPobjednika(char aktivniIgrac) {

			System.out.println("Pobjednik je igrač " + aktivniIgrac + ", a onaj drugi je LUZER :D");
		
	}

	private static void ispisiRemi() {

		System.out.println("Ovo je partija bez pobjednika. \nNisi LUZER :)");
		
	}

	private static boolean nemaPobjednika(char[][] poljanaZaIgru) {

		for (int i=0; i<3; i++){
			boolean kraj=false;
			kraj=(poljanaZaIgru[i][0]==poljanaZaIgru[i][1]) && (poljanaZaIgru[i][0]==poljanaZaIgru[i][2]);
			if(kraj==true) {
				
				return false;
			}
			kraj=(poljanaZaIgru[0][i]==poljanaZaIgru[1][i]) && (poljanaZaIgru[0][i]==poljanaZaIgru[2][i]);
			if(kraj==true) {
				
				return false;
			}
			
			kraj=(poljanaZaIgru[0][0]==poljanaZaIgru[1][1]) && (poljanaZaIgru[0][0]==poljanaZaIgru[2][2]);
			if(kraj==true) {
				
				return false;
			}
			kraj=(poljanaZaIgru[2][0]==poljanaZaIgru[1][1]) && (poljanaZaIgru[2][0]==poljanaZaIgru[0][2]);
			if(kraj==true) {
				
				return false;
			}
		}
		
		return true;
	}
	
	
	/**
	 * Funkcija prima varijablu aktivniIgrac i ako je on 1,vraća 0 da promjeni igraca (jedan igrač je označen sa 1 a drugi sa 0.
	 * @param aktivniIgrac
	 * @return integer
	 */
	private static int promijeniAktivnogIgraca(int aktivniIgrac) {
		if(aktivniIgrac==0) return 1;
		return 0;
	}

	
	private static boolean krajIgre(char[][] poljanaZaIgru, char nijedanIgrac) {

		int popunjenihPolja = 0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
			if(poljanaZaIgru[i][j] != nijedanIgrac){
				
				popunjenihPolja++;
				
			}
			}
		}
		if(popunjenihPolja==9){
			
			return true;
		}
		for(int i=0;i<3;i++){
			
			boolean kraj=false;
			kraj=(poljanaZaIgru[i][0]!=nijedanIgrac) && (poljanaZaIgru[i][0]==poljanaZaIgru[i][1]) && (poljanaZaIgru[i][0]==poljanaZaIgru[i][2]);
			if(kraj==true) {
				
				return true;
			}
			kraj=(poljanaZaIgru[0][i]!=nijedanIgrac) && (poljanaZaIgru[0][i]==poljanaZaIgru[1][i]) && (poljanaZaIgru[0][i]==poljanaZaIgru[2][i]);
			if(kraj==true) {
				
				return true;
			}
		}
		boolean kraj=false;
		kraj=(poljanaZaIgru[0][0]!=nijedanIgrac) && (poljanaZaIgru[0][0]==poljanaZaIgru[1][1]) && (poljanaZaIgru[0][0]==poljanaZaIgru[2][2]);
		if(kraj==true) {
			
			return true;
		}
		kraj=(poljanaZaIgru[2][0]!=nijedanIgrac) && (poljanaZaIgru[2][0]==poljanaZaIgru[1][1]) && (poljanaZaIgru[2][0]==poljanaZaIgru[0][2]);
		if(kraj==true) {
			
			return true;
		}
		return false;
	}

	
	
	private static void postaviPolje(char igrac, String izabranoPolje,char[][] poljanaZaIgru) {

		int polje = Integer.parseInt(izabranoPolje);
		poljanaZaIgru[(polje-1)/3][(polje-1)%3] = igrac;
	}

	
	
	private static boolean izabranoPoljeJeIspravno(String izabranoPolje,char[][] poljanaZaIgru,char nijedanIgrac) {

		/*
		 * 7 8 9
		 * 4 5 6           (2-br1)*3+br2+1 --- sa ovim pretvorim polja [i][j] u brojeve od 1 do 9 
		 * 1 2 3           br1=(x-1)/3     br2=(x-1)%3
		 */
		
		try{
			int polje = Integer.parseInt(izabranoPolje);
			if((polje < 10)&&(polje>0)) {
				
				if(poljanaZaIgru[(polje-1)/3][(polje-1)%3]==nijedanIgrac) {    //ovdje smo pretvorili koordinate u brojeve preko formula koje pišu gore iznad
				return true;
				}
			}
		}
		catch(Exception e){
			return false;
		}
		return false;
	}

	
	
	private static String unesiPolje(int aktivniIgrac) {

		Scanner in=new Scanner(System.in);
		System.out.println("Unesi polje koje želiš odigrati:\n+---+---+---+\n| 7 | 8 | 9 |\n| 4 | 5 | 6 |\n| 1 | 2 | 3 |\n+---+---+---+");
		return in.nextLine();
	}
}
