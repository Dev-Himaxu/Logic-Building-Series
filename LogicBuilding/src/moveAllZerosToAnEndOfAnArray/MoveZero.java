// Que: Move all zero to an end of an array;

package moveAllZerosToAnEndOfAnArray;

import java.util.Arrays;

public class MoveZero {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 0, 3, 0, 4, 5 };
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
				index++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
