public class Povr�inaKru�nice {

	public static void main(String args[]) {

		//napi�i program koji �e izra�unati povr�inu kruga r2 * PI


		float R =4;
		float PI=(float) 3.14;


		float povrsina = R*R*PI;
		float obim = 2*R*PI;
		System.out.print("Povr�ina kru�nice je:");
		System.out.println(povrsina);
		System.out.print("Obim kru�nice je:");
		System.out.println(obim);

	}
}