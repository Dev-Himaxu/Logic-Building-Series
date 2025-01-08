//Que: Find the Sum of digits of the number;

package sumOfDigitsOfNum;

public class DigitSum {
	public static void main(String[] args) {
		int digit = 1235677;
		int sum = 0;
		while (digit != 0) {
			sum += (digit % 10);
			digit = digit / 10;
		}
		System.out.println(sum);
	}
}
