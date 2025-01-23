 //Que: Write a program to find the largest element in an array.

package LargestElementinAnArray;

public class Largest {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 17, 8, 9, 8 };
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest element: " + largest);
	}

}
