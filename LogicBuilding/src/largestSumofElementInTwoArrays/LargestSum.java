// Que: Find the largest sum of element from two arrays;

package largestSumofElementInTwoArrays;

public class LargestSum {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 1, 2, 3, 4 };
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < a.length; i++) {
			sum1 += a[i];
		}
		for (int i = 0; i < b.length; i++) {
			sum2 += b[i];
		}
		if (sum1 > sum2) {
			System.out.println(" Sum1 greater");
		} else if (sum1 < sum2) {
			System.out.println("Sum2 greater");
		} else {
			System.out.println("Both are equal");
		}
	}

}
