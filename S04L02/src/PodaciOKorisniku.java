public class PodaciOKorisniku {

	public static void main(String[] args) {
		
//		System.out.println("Unesi svoje ime: ");
//		TextIO.writeUserSelectedFile();
//		TextIO.getln();
//		TextIO.writeStandardOutput();
		
		String niz[]=new String[4];
		
		System.out.println("Unesi svoje ime: ");
		niz[0]=TextIO.getln();
		
		System.out.println("Unesi svoje prezime: ");
		niz[1]=TextIO.getln();
		
		System.out.println("Unesi koliko imaš godina: ");
		niz[2]=TextIO.getln();
		
		System.out.println("Unesi koliko godina radnog iskustva imaš: ");
		niz[3]=TextIO.getln();
		
		
		TextIO.writeUserSelectedFile();
		for(int i=0; i<niz.length; i++){
			TextIO.putln(niz[i]);
		}
		
		
	}
	
	

}
