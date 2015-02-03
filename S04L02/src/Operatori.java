
public class Operatori {

	public static void main(String[] args) {

		
		double rezultat=0;
		
		if(args.length != 0){
		
			if(args[2].equals("r")){
				System.out.println("GRESKA!!!");
				
			}
			
		if(args[2].equals("+")){
			rezultat=Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		}
		if(args[2].equals("-")){
			rezultat=Integer.parseInt(args[0]) - Integer.parseInt(args[1]);
		}
		
		if(args[2].equals("*")){
			
			rezultat=(double)(Integer.parseInt(args[0]) * Integer.parseInt(args[1]));
		}
		if(args[2].equals("/")){
			rezultat=(double)(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
		}
		if(args[2].equals("%")){
			rezultat=Integer.parseInt(args[0]) % Integer.parseInt(args[1]);
		}
		}
		System.out.println("Rezultat je: "+ rezultat);
	}

}
