// Que: WRITE A PROGRAM TO SORT AN ARRAY ACCORDING TO THE ORDER DEFINED BY ANOTHER ARRAY.

package sortAnArrayinOrderOfAnother;

import java.util.Arrays;

public class Order {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int arr1[] = { 1, 2, 4, 5, 3 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
//If the elements match, it means arr1[j] is in arr but not necessarily in the correct position.
				if (arr[i] == arr1[j]) {
//The value of arr1[j] (the matching element) is stored in a temporary variable temp.
					int temp = arr1[j];
// The value at arr1[j] is swapped with the value at arr1[i].This places the matching value in the correct position in arr1 relative to arr.
					arr1[j] = arr1[i];
					arr1[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
	}

}



// EXPLANATION
/* 
Let’s work through the code with arr = {1, 2, 3, 4, 5} and arr1 = {1, 2, 4, 5, 3}.

	Initial State:
	arr = {1, 2, 3, 4, 5}
	arr1 = {1, 2, 4, 5, 3}
1). Outer Loop (i = 0, arr[0] = 1):
	Inner Loop:
	j = 0: arr[0] == arr1[0] → Match found.
	Swap arr1[0] with arr1[0] (no change).
	arr1 = {1, 2, 4, 5, 3}.
2). Outer Loop (i = 1, arr[1] = 2):
	Inner Loop:
	j = 1: arr[1] == arr1[1] → Match found.
	Swap arr1[1] with arr1[1] (no change).
	arr1 = {1, 2, 4, 5, 3}.
3).Outer Loop (i = 2, arr[2] = 3):
	Inner Loop:
	j = 4: arr[2] == arr1[4] → Match found.
	Swap arr1[4] with arr1[2].
	arr1 = {1, 2, 3, 5, 4}.
4).Outer Loop (i = 3, arr[3] = 4):
	Inner Loop:
	j = 4: arr[3] == arr1[4] → Match found.
	Swap arr1[4] with arr1[3].
	arr1 = {1, 2, 3, 4, 5}.
5).Outer Loop (i = 4, arr[4] = 5):
	Inner Loop:
	j = 4: arr[4] == arr1[4] → Match found.
	Swap arr1[4] with arr1[4] (no change).
	arr1 = {1, 2, 3, 4, 5}.
	*/