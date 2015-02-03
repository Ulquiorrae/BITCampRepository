import java.util.Scanner;
public class MatriceDugiZadatak {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		int visina,sirina; //korisnik unosi
		
		System.out.println("Unesi visinu matrice: ");
		visina=in.nextInt();
		
		System.out.println("Unesi širinu matrice: ");
		sirina=in.nextInt();
		
		int[][] matrica=kreirajMatricu(visina,sirina); //napraviti funkciju koja kreira matricu
		
		ispisiMatricu(matrica);
		
		matrica=postaviVrijednost(matrica);
		ispisiMatricu(matrica);
	}
	
	private static int[][] postaviVrijednost(int[][] matrica) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Unesi index reda(i): ");
		int i=in.nextInt();
		
		System.out.println("Unesi index kolone(j): ");
		int j=in.nextInt();
		
		System.out.printf("Unesi vrijednost kojom želiš popuniti mjesto [%d][%d] u matrici: ",i,j);
		int broj=in.nextInt();
		
		matrica[i][j]=broj;
		
		
		return matrica;
	}

	
	private static void ispisiMatricu(int[][] matrica) {

		for(int i=0;i<matrica.length;i++){
			for(int j=0;j<matrica[i].length;j++){
				
				System.out.print(matrica[i][j]+ " ");
				 
			}
			System.out.println();
			
		}
		
	}

	
	private static int[][] kreirajMatricu(int visina, int sirina) {

		int[][]matrica=new int[visina][sirina];
		
		return matrica;
	}

	
	public static void ispisi1DNiza(int[]niz){
		
		for(int i=0;i<niz.length;i++){
			
			System.out.print(niz[i]+" ");
		}
		System.out.println();
	}
	
	
	
	
	
}
