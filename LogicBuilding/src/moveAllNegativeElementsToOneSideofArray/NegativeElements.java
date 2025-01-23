// Que: WRITE A PROGRAM TO MOVE ALLTHE NEGATIVE ELEMENTS TO ONE SIDE OF THE ARRAY.

package moveAllNegativeElementsToOneSideofArray;

import java.util.Arrays;

public class NegativeElements {
	public static void main(String[] args) {
		int arr[] = { 1, -2, 4, 5, -3, -7 };
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index++] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
