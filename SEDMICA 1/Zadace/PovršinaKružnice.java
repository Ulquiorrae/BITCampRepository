public class PovršinaKružnice {

	public static void main(String args[]) {

		//napiši program koji æe izraèunati površinu kruga r2 * PI


		float R =4;
		float PI=(float) 3.14;


		float povrsina = R*R*PI;
		float obim = 2*R*PI;
		System.out.print("Površina kružnice je:");
		System.out.println(povrsina);
		System.out.print("Obim kružnice je:");
		System.out.println(obim);

	}
}