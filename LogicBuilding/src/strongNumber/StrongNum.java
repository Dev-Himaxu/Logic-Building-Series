// Que: Write a program to check if a number is strong number or not.
/* let number = 145 (split it's degit and find the multiple of each and sum them)
 *  1=1
 *  4=1x2x3x4=24;
 *  5=1x2x3x4xx5=120
 *  145=1+24+120
 *  145=145(Strong Number);
 */
package strongNumber;

public class StrongNum {
	public static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		int num = 145;
		int result = 0;
		int number = num;
		while (num != 0) {
			int rem = num % 10;
			result += factorial(rem);
			num /= 10;
		}
		if (number == result) {
			System.out.println(number + " is Strong number");
		} else {
			System.out.println(number + " is not Strong number");
		}
	}
}
