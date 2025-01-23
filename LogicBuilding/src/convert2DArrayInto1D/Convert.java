// Que: Convert 2D Array into 1D array.

package convert2DArrayInto1D;

import java.util.Arrays;

public class Convert {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int arr1[] = new int[arr.length * arr[0].length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr1[index++] = arr[i][j];
			}
		}
		System.out.println(Arrays.toString(arr1));
	}

}
