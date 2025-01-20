// Que: Reverse an Array

package reverseAnArray;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
//	indexing =        0, 1, 2, 3, 4
		int arr[] = { 1, 2, 3, 4, 5 };
//	index number of i = 0;
		int i = 0;
//	index number of j = 4;
		int j = arr.length - 1;
//		runs till the index of i<j.
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
//			inc. the index value of i;
			i++;
//			dec. the index value of j;
			j--;
		}
		System.out.print(Arrays.toString(arr));
	}
}
