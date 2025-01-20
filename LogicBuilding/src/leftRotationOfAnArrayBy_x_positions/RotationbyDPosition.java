// Que: Array left rotation by x position;

package leftRotationOfAnArrayBy_x_positions;

import java.util.Arrays;

public class RotationbyDPosition {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int x = 3;
//	Stores the first index value in temp variable.
		for (int i = 0; i < x; i++) {
			int temp = arr[0];

			for (int j = 0; j < arr.length - 1; j++) {
//	Stores the next value in first index of the array.till the number shifted by d position.
				arr[j] = arr[j + 1];

			}
			arr[arr.length - 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
