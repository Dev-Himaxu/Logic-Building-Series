//Que: Find the Factorial of any Number.

package findFactorial;

public class Factorials {
	public static void main(String[] args) {
		int num = 5; // Declaring the number whose factorial we req.
		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}
}
