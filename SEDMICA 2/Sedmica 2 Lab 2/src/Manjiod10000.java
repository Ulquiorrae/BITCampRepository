import java.util.Scanner;
//korisnik unese broj. ako unese broj manji od 100 program ispiše da je broj manji od 100 
//a ako unese broj koji je manji od 1000 program ispiše da je broj manji od 1000 
//i ako unese broj manji od 10.000 on upiše da je on manji od 10.000
public class Manjiod10000 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);


		int broj;
		System.out.println("Unesi jedan broj:");
		broj=in.nextInt();

		if(broj<10000){

			System.out.println("Uneseni broj je manji od 10.000 !");


			if(broj<1000){

				System.out.println("Uneseni broj je manji od 1000 !");

				if(broj<100){

					System.out.println("Uneseni broj je manji od 100 !");


				}



			}


		}


		else{



			System.out.println("Uneseni broj je veći od od 10.000 !");




		}


	}


}
	