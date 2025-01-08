//Que: Find the sum of first n number of natural number.

package sumOfNaturalNo;

import java.util.Iterator;

public class NaturalNo {
	public static void main(String[] args) {
		int num = 5;
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
