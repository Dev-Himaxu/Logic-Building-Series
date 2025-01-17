// Que: find the Second largest no in an array.

package findTheSecondLargestNumInArray;

public class SecondLargestInAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 7, 8, 3, 6 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Second Largest Number In An Array = " + arr[arr.length - 2]);
	}
}
