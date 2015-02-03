import java.util.Scanner;

public class SidesofTRIANGLE {

	public static void main(String args[]) {

		int a, b, c;
		double poluopseg;
		double povrsina;
		double alfa, beta, gama;
		double max;
		

		Scanner in = new Scanner(System.in);

		System.out.println("Unesi prvu stranicu trougla: ");
		a = in.nextInt();
		while (a < 0) {
			System.out
					.println("Stranica trougla ne može biti negativan broj! Unesi pozitivan broj!: ");
			a = in.nextInt();
		}
		System.out.println("Unesi drugu stranicu trougla: ");
		b = in.nextInt();
		while (b < 0) {
			System.out
					.println("Stranica trougla ne može biti negativan broj! Unesi pozitivan broj!: ");
			b = in.nextInt();
		}

		System.out.println("Unesi treću stranicu trougla: ");
		c = in.nextInt();
		while (c < 0) {
			System.out
					.println("Stranica trougla ne može biti negativan broj! Unesi pozitivan broj!: ");
			c = in.nextInt();
		}
		
		poluopseg=(double)(a+b+c)/2;
		
		povrsina=Math.sqrt(poluopseg*(poluopseg-a)*(poluopseg-b)*(poluopseg-c));
		
		alfa=Math.acos((b*b+c*c-a*a)/(2*b*c));
		beta=Math.acos((a*a+c*c-b*b)/(2*a*c));
		gama=Math.acos((a*a+b*b-c*c)/(2*a*b));
		
		if ((a > 0) && (b > 0) && (c > 0) && ((a + b) > c) && ((a + c) > b)
				&& ((b + c) > a)) {

			System.out.println("Unesene stranice mogu kreirati trougao!!");
			System.out.printf("Površina trougla stranica a=%d cm,b=%d cm i c=%d cm je %1.2f cm kvadratnih! ",a,b,c,povrsina);
			System.out.println();
			
			max = alfa;

			if ((beta > alfa) && (beta > gama)) {

				max = beta;

			}

			if ((gama > alfa) && (gama > beta)) {

				max = gama;

			}

			System.out.println("Najveći ugao trougla je: " + max +" stepeni.");
			
			
			
			
		} else {

			System.out.println("Unesene stranice NE MOGU kreirati trougao!");

		}
		
		
		
	}
}
