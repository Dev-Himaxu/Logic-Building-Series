// Que: find the transpose of a Matrix;

package transposeOfMatrix;

public class TransposeOfaMatrix {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 4, 5 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

}