// Que: Find all pairs of elements in an array whose sum is equal to given number.

package findPairOfElementsEqualtoSum;

public class PairofElements {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int num = 10;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == num) {
					System.out.println("Pairs Are: (" + arr[i] + " + " + arr[j] + ") = " + num);
				}
			}
		}
	}

}
