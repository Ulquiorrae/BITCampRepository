import java.util.Scanner;
public class ProvjeraJMBG {

	public static void main(String args[]) {

		//7*A + 6*B + 5*C + 4*D + 3*E + 2*F + 7*G + 6*H + 5*I + 4*J + 3*K + 2*L                  A B C D E F G H I J K L Z
		Scanner in = new Scanner(System.in);

		System.out.println("Unesi svoj JMBG: ");

		String jmbg;
		int ostatak;
		jmbg = in.next( );
		if(jmbg.length()!=13){

			System.out.println("JMBG mora da sadrži 13 cifara! Unesi ispravan JMBG!");
			jmbg = in.next();

		}

		String prvi=jmbg.substring(0, 1);
		int prvo=Integer.parseInt(prvi);
			
		String drugi=jmbg.substring(1,2);
		int drugo=Integer.parseInt(drugi);		
		
		String treci=jmbg.substring(2, 3);
		int trece=Integer.parseInt(treci);
		
		String cetvrti=jmbg.substring(3, 4);
		int cetvrto=Integer.parseInt(cetvrti);
		
		String peti=jmbg.substring(4, 5);
		int peto=Integer.parseInt(peti);
		
		String sesti=jmbg.substring(5, 6);
		int sesto=Integer.parseInt(sesti);
		
		String sedmi=jmbg.substring(6, 7);
		int sedmo=Integer.parseInt(sedmi);
		
		String osmi=jmbg.substring(7, 8);
		int osmo=Integer.parseInt(osmi);
		
		String deveti=jmbg.substring(8, 9);
		int deveto=Integer.parseInt(deveti);
		
		String deseti=jmbg.substring(9, 10);
		int deseto=Integer.parseInt(deseti);
		
		String jedanaesti=jmbg.substring(10, 11);
		int jedanaesto=Integer.parseInt(jedanaesti);
		
		String dvanaesti=jmbg.substring(11, 12);
		int dvanaesto=Integer.parseInt(dvanaesti);
		
		String trinaesti=jmbg.substring(12, 13);
		int trinaesto=Integer.parseInt(trinaesti);
		
		//7*A + 6*B + 5*C + 4*D + 3*E + 2*F + 7*G + 6*H + 5*I + 4*J + 3*K + 2*L                  A B C D E F G H I J K L Z
		
		
		int formula=7*prvo + 6*drugo + 5*trece + 4*cetvrto + 3*peto + 2*sesto + 7*sedmo + 6*osmo + 5*deveto + 4*deseto + 3*jedanaesto + 2*dvanaesto;
		
		ostatak=formula%11;
		
		
		if(((ostatak==0)&&(trinaesto==0))||(ostatak+trinaesto==11)) {System.out.print("JMBG je ispravan!!!");}
		else {System.out.print("JMBG je neispravan!!!");}
		
		
		}
		
			
			
		}
		
		

		

	