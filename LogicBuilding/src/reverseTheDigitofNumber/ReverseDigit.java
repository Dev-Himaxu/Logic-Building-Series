// Que: Reverse the Digits of the number;

package reverseTheDigitofNumber;

public class ReverseDigit {
	public static void main(String[] args) {
		int n = 1234;
		int reverse = 0;
		while (n != 0) {
			int rem = n % 10;
			reverse = (reverse * 10) + rem;
			n /= 10;
		}
		System.out.println("Reverse: "+reverse);
	}
}
