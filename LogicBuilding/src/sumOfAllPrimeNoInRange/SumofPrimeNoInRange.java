//QUE: WRITE A PROGRAM TO FIND THE SUM OF ALL PRIME NUMBERS BETWEEN GIVEN RANGE.

package sumOfAllPrimeNoInRange;

public class SumofPrimeNoInRange {

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		System.out.println("Sum of prime nos in Range:" + n + " = " + sum);
	}

}
