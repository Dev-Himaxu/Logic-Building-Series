// Que: Search an element in a matrix

package searchAnElementInmatrix;

public class Search {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 5, 6, 7 } };
		int element = 5;
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == element) {
					found = true;
					break;
				}
			}
		}
		if (found) {
			System.out.println("Element " + element + " is present in Matrix");
		} else {
			System.out.println("Not Found in Matrix");
		}
	}

}
