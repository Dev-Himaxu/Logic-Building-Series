// Que: Right rotation of an array by x position;

package rightRotationOfAnArrayBy_x_positions;

import java.util.Arrays;

public class RightRotation {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int x = 3;
		for (int i = 0; i < x; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
