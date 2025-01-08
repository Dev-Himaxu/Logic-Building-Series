// Que: Check If Number Is Palindrome or Not.

package palindrome;

public class Palindrome {
	public static void main(String[] args) {
		int num = 1234321;
		int reverse = 0;
		int n1 = num;
		while (num != 0) {
			int rem = (num % 10); // it gives the last digit of the number.
			reverse = (reverse * 10) + rem; // it adds the remainder in reverse variable;
			num = num / 10; // it removes the last digit after each loop;
		}
		if (n1 == reverse) {
			System.out.println(n1 + " is Palindrome");
		} else {
			System.out.println(n1 + "Not a Palindrome ");
		}
	}
}
