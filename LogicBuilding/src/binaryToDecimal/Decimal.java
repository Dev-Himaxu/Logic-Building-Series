// Que: Convert Binary(0 and 1) to Decimal(10 digits);
/* binary=1010 
 * split digit =1, 0, 1, 0
 * 
 * decimal =1x2³+ 0x2² + 1x2¹ +0x2⁰=10;
 * 
 */
package binaryToDecimal;

public class Decimal {
	public static void main(String[] args) {

		int binary = 1001;
		int decimal = 0;
		int power = 1;
		while (binary != 0) {
			int rem = binary % 10;
			if (rem == 1) {
				decimal += power;
			}
			binary /= 10;
			power *= 2;
		}
		System.out.println("Decimal Number = " + decimal);
	}
}
