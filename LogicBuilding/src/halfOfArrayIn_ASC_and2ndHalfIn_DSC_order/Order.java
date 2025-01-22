// Que: Sort first half of an array in ascending and second half in descending order.

package halfOfArrayIn_ASC_and2ndHalfIn_DSC_order;

import java.util.Arrays;

public class Order {
	public static void main(String[] args) {
		int arr[] = { 7, 4, 8, 5, 2, 6 };
		for (int i = 0; i < arr.length / 2; i++) {
			for (int j = 0; j < arr.length / 2 - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		// arr.length/2 = half of array's index+1
		for (int i = arr.length / 2; i < arr.length; i++) {
			for (int j = arr.length / 2; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		System.out.println(
				" Half of Array ( int arr[] = { 7, 4, 8, 1, 2, 3 } ) in Ascending and other half in Descending order "
						+ Arrays.toString(arr));
	}

}
