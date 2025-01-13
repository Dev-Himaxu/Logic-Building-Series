//Que: write a program to check if a number is perfect or not

// Logic 

/* int num=6 (sum of its divisor = num) then it is perfect number.
 * 6 Divided by 1, 2, 3 so the sum of 1+2+3=6
 * so 6 is perfect number
 */

package perfectNumber;

public class PerfectNum {
	public static void main(String[] args) {
		int num = 6;
		int divisorSum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				divisorSum += i;
			}
		}
		if (divisorSum == num) {
			System.out.println(num + " is a perfect Number");
		} else {
			System.out.println(num + " is not a perfect Number");
		}
	}
}
