// Que: Find the nearest smaller number on the left side in an array.

package nearestSmallerNoOnTheLeftSideOfArray;

public class Nearest {
	public static void main(String[] args) {
		int arr[] = { 4, 5, 1, 4, 2, 3 };
		int smallest = arr[0];
		for (int i = 0; i <= arr.length / 2; i++) {
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest: " + smallest);
	}

}
