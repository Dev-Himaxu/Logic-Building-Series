// Que: Write a  program to convert decimal and octal;

package decimalToOctal;

public class Octal {
	public static void main(String[] args) {
		int decimal = 2345;
		String octal = "";

		while (decimal != 0) {
			int rem = decimal % 8;
			octal = rem + octal;
			decimal /= 8;
		}
		System.out.println("Octal = " + octal);
	}
}
