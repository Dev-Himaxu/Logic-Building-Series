// Que: Check if a Number is Prime or Not.

package checkPrime;

public class Check {
	public static void main(String[] args) {
		int num = 11;
		boolean isPrime = true;

		for (int i = 2; i <= num / 2; i++) {
			
			if (num % i == 0) {
				isPrime = false;
				break;
			}

		}
		if (isPrime) {
			System.out.println(num + " is a Prime Number.");
		} else {
			System.out.println(num + " is not a prime Number.");
		}
	}
}
