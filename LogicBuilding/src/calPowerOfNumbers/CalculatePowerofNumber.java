//Que: Calculate the power of a Number

package calPowerOfNumbers;

public class CalculatePowerofNumber {
	public static void main(String[] args) {
		int base = 3; //number=3^4
		int exponent = 4;
		int powerOfNumber = 1; // Pre initialize it 1 coz if we put 0, then our whole calculation goes wrong.
		for (int i = 1; i <= exponent; i++) {
			powerOfNumber *= base;
		}
		System.out.println(powerOfNumber);
	}
}
