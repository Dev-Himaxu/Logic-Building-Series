// Que: Write a program to print upper triangular matrix;

package printUpperTriangularMatrix;

public class UpperTriangular {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		int output[] = { { 1, 2, 3 }, { 0, 5, 6 }, { 0, 0, 9 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i <= j) {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
