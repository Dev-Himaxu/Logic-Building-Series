package removeDuplicateElementsfromAnArray;

import java.util.Arrays;

public class DuplicateElements {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 2, 1, 1, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				continue;
			}
//			j starts from 1 index of arr 
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
