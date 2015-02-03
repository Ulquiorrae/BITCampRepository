
public class rekurzijaTest {

	public static void main(String[] args) {
		int broj=4;
		prvaRekurzija(4);
	}

	public static void prvaRekurzija(int broj){
		if(broj==1){
			System.out.println("Broj je 1");
		}
		else{
			prvaRekurzija(broj-1);
		}
	}
}
