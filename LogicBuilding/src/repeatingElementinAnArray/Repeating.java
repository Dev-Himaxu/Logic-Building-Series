// Que: Find repeating element in an Array;

package repeatingElementinAnArray;

public class Repeating {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 1, 2, 2, 1 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				continue;
			}
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;
					count++;
				}
			}
			System.out.println(arr[i] + " is repeating " + count + " times ");
		}
	}

}
