// Que: Concatenation of arrays;

package concatenationOfArrays;

import java.util.Arrays;

public class Concatenation {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 5, 6, 7, 8, 9, 0 };
//		Arrays size are fixed so we have to create a new array of size of both the arrays.
		int c[] = new int[a.length + b.length];
//		inserts the value of array a into array c;
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
//		inserts the value of array b in array c after the values of array a;
		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}
		System.out.println(Arrays.toString(c));
	}

}
