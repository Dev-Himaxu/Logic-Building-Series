// Que: Write a program to find the smallest number in an array;

package smallestElementinAnArray;

public class Smallest {
	public static void main(String[] args) {
		int arr[] = { 10, 2, 3, 4, 5, 6 };
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest element of an Array: " + smallest);
	}

}
