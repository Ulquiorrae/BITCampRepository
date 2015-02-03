import java.util.InputMismatchException;
import java.util.Scanner;
public class SimetričanBroj {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		boolean tacno=false;
		int broj;
		
		
		while(tacno==false){
            try{
            	
            	while(true){
                    System.out.println("Unesi jedan prirodan broj: ");
                    broj=in.nextInt();
                    
                    if(broj==0) {
                    System.out.println("KRAJ!");
                    return;
                    }
                    if(simetrican(broj)==true) System.out.printf("Uneseni broj %d je simetričan!\n",broj);
                    else System.out.printf("Uneseni broj %d NIJE simetričan!\n",broj);
                    break;
            	}
            }
            catch(InputMismatchException exception){
                   
                    System.out.println("Molimo vas da unesete cijeli broj!");
                    in.nextLine();
            }
            }
	}
	
	/**
	 * Ova boolean funkcija ima zadatak da provjeri da li je uneseni broj simetričan(true=da,false=ne)
	 * @param Broj tipa integer
	 * @return True ako je broj simetričan i false ako broj nije simetričan
	 */
	public static boolean simetrican(int broj){
		
		int obrnutiBroj=0;
		int temp=broj;
		
		while( temp != 0 )
	      {
			obrnutiBroj = obrnutiBroj * 10;
			obrnutiBroj = obrnutiBroj + temp%10;
	          temp = temp/10;
	      }
		
		if(obrnutiBroj==broj) return true;
		
		return false;
	}
}
