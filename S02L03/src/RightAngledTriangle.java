import java.util.Scanner;
public class RightAngledTriangle {

	public static void main(String args[]){
		
		Scanner in=new Scanner(System.in);
		
		int kateta1,kateta2,hipotenuza;
		
		System.out.println("Unesi prvu katetu pravouglog trougla: ");
		kateta1=in.nextInt();
		
		System.out.println("Unesi drugu katetu pravouglog trougla: ");
		kateta2=in.nextInt();
		
		System.out.println("Unesi hipotenuzu pravouglog trougla: ");
		hipotenuza=in.nextInt();
		
		int kateta1sq=(int) Math.pow(kateta1,2);
		int kateta2sq=(int) Math.pow(kateta2,2);
		int hipotenuzasq=(int) Math.pow(hipotenuza, 2);
		
		if(kateta1sq+kateta2sq==hipotenuzasq){
			
			System.out.println("Unesene stranice mogu tvoriti pravougli trougao!");
			
		}
		else{
			
			System.out.println("Unesene stranice NE MOGU tvoriti pravougli trougao!");
			
		}
		
	}
}
