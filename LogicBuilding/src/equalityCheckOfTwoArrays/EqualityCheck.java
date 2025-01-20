// Que: check the Equality of two arrays.

package equalityCheckOfTwoArrays;

public class EqualityCheck {
	public static boolean check(int a[], int b[]) {
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 4 };

		if (check(a, b))

		{
			System.out.println("Both Arrays are of Equal Size");
		} else {
			System.out.println("Not Equal");
		}

	}
}
