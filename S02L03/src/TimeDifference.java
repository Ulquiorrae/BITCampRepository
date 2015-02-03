import java.util.Scanner;
public class TimeDifference {
	public static void main(String args[]){
		
		Scanner in=new Scanner(System.in);
		
		int sati1,minute1,sekunde1;
		int sati2,minute2,sekunde2;
		long ukupnoSekundi1, ukupnoSekundi2;
		long razlika;
		long razlikaSati,razlikaMinute,razlikaSekunde;
		long razlikaTEMP;
		
		
		System.out.println("START - Unesi sate: ");
		sati1=in.nextInt();
		
		System.out.println("START - Unesi minute: ");
		minute1=in.nextInt();
		
		System.out.println("START - Unesi sekunde: ");
		sekunde1=in.nextInt();
		
		System.out.println("FINISH - Unesi sate: ");
		sati2=in.nextInt();
		
		System.out.println("FINISH - Unesi minute: ");
		minute2=in.nextInt();
		
		System.out.println("FINISH - Unesi sekunde: ");
		sekunde2=in.nextInt();
		
		ukupnoSekundi1=sati1*3600 + minute1*60 + sekunde1;
		ukupnoSekundi2=sati2*3600 + minute2*60 + sekunde2;
		
		razlika=ukupnoSekundi1-ukupnoSekundi2;
		razlikaTEMP=razlika;
		
		razlikaSati=razlikaTEMP/3600;
		razlikaTEMP=razlikaTEMP%3600;
		razlikaMinute=razlikaTEMP/60;
		razlikaTEMP=razlikaTEMP%60;
		razlikaSekunde=razlikaTEMP;
		
		System.out.println("Razlika između ova 2 unesena vremena je: "+ (-1)*razlikaSati+ " : " +(-1)*razlikaMinute + " : " + (-1)*razlikaSekunde);
		
		
	}
}
