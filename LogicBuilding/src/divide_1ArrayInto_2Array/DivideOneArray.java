// Que: write a program to divide one array into two array;

package divide_1ArrayInto_2Array;

import java.util.Arrays;

public class DivideOneArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int arr1[];
		int arr2[];
		if (arr.length % 2 != 0) {
			arr1 = new int[arr.length / 2];
			arr2 = new int[(arr.length / 2) + 1];
		} else {
			arr1 = new int[arr.length / 2];
			arr2 = new int[arr.length / 2];
		}
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr1));
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[arr1.length + i];
		}
		System.out.println(Arrays.toString(arr2));
	}

}
