// Que: Sort An array containing 0,1,2;

package sortAnArrayContainingNo0_1_2;

import java.util.Arrays;

public class SortArrays {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 0 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
