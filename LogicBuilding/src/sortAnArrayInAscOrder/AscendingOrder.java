// Que: Sort an Array in ascending order;

package sortAnArrayInAscOrder;

import java.util.Arrays;

public class AscendingOrder {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 3, 7, 8 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) { // Here we compared to number in array.
					int temp = arr[j]; // Here We used swapping Method
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		System.out.println("Sorted Array = " + Arrays.toString(arr));
	}
}
