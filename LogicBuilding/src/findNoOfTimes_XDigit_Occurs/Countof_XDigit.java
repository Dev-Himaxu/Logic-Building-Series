//Que: Find The number of times "X" Digit occurs in a given input.

package findNoOfTimes_XDigit_Occurs;

public class Countof_XDigit {
	public static void main(String[] args) {
		int num = 121111;
		int count = 0;
		int x = 1;
		while (num != 0) {
			int rem = num % 10;
			if (rem == x) {
				count++;
			}
			num /= 10;
		}
		System.out.println(count);
	}
}
