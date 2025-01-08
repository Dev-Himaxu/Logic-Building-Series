// Que: Check if number is armstrong or not;

package armstrong;


public class Armstrong {
	public static void main(String[] args) {
		int num = 153;
		int sum = 0;
		int n1 = num;

		while (num != 0) {
			int rem = (num % 10);
			
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (sum == n1) {
			System.out.println(n1 + " is an armstrong");
		} else {
			System.out.println(n1 + " is not an armstrong");
		}

	}
}
