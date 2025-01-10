//Que: Find the greatest common divisor(GCD)Or HCF(Highest common factor).

package greatestCommonDivisor;

public class GCD {
	public static void main(String[] args) {
		int n1 = 12;
		int n2 = 18;
		int gcd = 0;

		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd + " is Greatest common divisor of " + n1 +" "+ n2);
	}

}
