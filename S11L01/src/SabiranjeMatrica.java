public class SabiranjeMatrica {

	public static void main(String[] args) {

		int mat1[][] = new int[3][3];
		int mat2[][] = new int[3][3];

		int temp = 0;

		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				mat1[i][j] = temp++;
			}
		}

		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[i].length; j++) {
				mat2[i][j] = temp++;
			}
		}

		int[][] mat3 = addMatrix(mat1, mat2);

		printMatrix(mat1);
		System.out.println();
		printMatrix(mat2);
		System.out.println();
		printMatrix(mat3);
	}

	
	private static void printMatrix(int[][] mat3) {
		for (int i = 0; i < mat3.length; i++) {
			for (int j = 0; j < mat3.length; j++) {
				System.out.print(mat3[i][j] + " ");
			}
			System.out.println();
		}
	}

	
	public static int[][] addMatrix(int[][] mat1, int[][] mat2) {
		int newMat[][] = new int[3][3];
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1.length; j++) {
				newMat[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		return newMat;
	}

}
