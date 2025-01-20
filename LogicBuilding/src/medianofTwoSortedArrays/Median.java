// Que: Median of two sorted arrays of equal size;

package medianofTwoSortedArrays;

import java.util.Arrays;

public class Median {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 6 };
		int b[] = { 4, 5, 6, 7 };
//		Concatenation of Two arrays
		int c[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}
//		Arranging them in ASC Order.
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length - 1; j++) {
				if (c[j] > c[j + 1]) {
					int temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}
//		Formula Used: n= total number /2;
//		 			median=	(n-1+n)/2

//		int mid = c.length / 2;
//		double median = (c[mid - 1] + c[mid]) / 2;

//		Formula Used: median=(first digit + lastDigit)/2;
		double median = (c[0] + c[c.length - 1]) / 2;
		System.out.println("Median = " + median);
		System.out.println(Arrays.toString(c));
	}

}
