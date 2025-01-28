// Que: Write a program to rearrange the array in alternating positive and negative items with O(1) Extra Space.

package rearrangeInAlternatingPositiveAndNegativewithO1extraSpace;

import java.util.Arrays;

public class Rearrange {
	public static void main(String[] args) {
		int arr[] = { -1, 3, 4, -2, 3, -3, 8 };
		int index = 0;
		int neg = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index++] = temp;
			}
		}
		while (neg < arr.length && index < arr.length) {
			int temp = arr[neg];
			arr[neg] = arr[index];
			arr[index++] = temp;
			neg += 2;
		}
		System.out.println(Arrays.toString(arr));
	}
}
