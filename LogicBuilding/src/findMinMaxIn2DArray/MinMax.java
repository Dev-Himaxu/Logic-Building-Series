// Que: Find Min and max values in 2D Array

package findMinMaxIn2DArray;

public class MinMax {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };
		int min = arr[0][0];
		int max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
			System.out.println("Maximum value: " + max);
			System.out.println("Minimum value: " + min);
	}
}
