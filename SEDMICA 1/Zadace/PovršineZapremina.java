
public class PovršineZapremina {

	public static void main(String args[]) {

		//pov obim kvadrata, kruga, koliko puta površina tog kvadrata može stati u površinu tog kruga?(cijeli broj-int mora bit) Ž
		//duzina stranice od 0,5 do 36,7 se poveca svaki put duzina stranice i izracunaj zapreminu valjka

		int stranica=3;
		float PI=(float) 3.14;
		float povrsinaKvadrata=stranica*stranica;
		float obimKvadrata=4*stranica;
		float povrsinaKruga=stranica*stranica*PI;
		float obimKruga=2*stranica*PI;
		double minimum=0.5;
		double maximum=36.7;
		double randomNum;
		double povrsinaValjka;

		randomNum = minimum + (int)(Math.random()*maximum); 


		float broj;


		broj=povrsinaKruga/povrsinaKvadrata;
		System.out.print(broj);

		povrsinaValjka=randomNum*povrsinaKruga;

	}
}