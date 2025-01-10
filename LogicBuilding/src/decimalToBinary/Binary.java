// Que: Convert a Decimal Number to Binary.

package decimalToBinary;

public class Binary {
	public static void main(String[] args) {
		int num = 10;
		String binary = "";
		while (num != 0) {
			int rem = num % 2;
			binary = rem + binary;
			num /= 2;
		}
		System.out.println(binary);
	}

}
