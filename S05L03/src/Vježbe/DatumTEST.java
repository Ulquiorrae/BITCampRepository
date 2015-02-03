package Vježbe;
import java.util.Scanner;
public class DatumTEST {

	public static void main(String[] args) {

		Datum prviDatum = new Datum(10, 12, 2014);  //naš konstruktor prima dan,mjesec,godina
		Datum drugiDatum = new Datum(10, 12, 2014);
		
		
		System.out.println(prviDatum.toString());
		System.out.println(drugiDatum.toString());
		
//		if(prviDatum.equals(drugiDatum)){
//			System.out.println("Jednaki su!");
//		}
//		else{
//			System.out.println("Nisu jednaki!");
//		}
			
		
		if((prviDatum.compare(drugiDatum))==-1) System.out.println("Prvi datum je manji od drugog!");
		if((prviDatum.compare(drugiDatum))==1) System.out.println("Prvi datum je veći od drugog!");
		if((prviDatum.compare(drugiDatum))==0) System.out.println("Datumi su jednaki!");
	}

}
