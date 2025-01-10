//Que: Check If Number is perfect square or not.

package perfectSquare;

public class Perfect {
	public static void main(String[] args) {
		int n = 67;
		boolean isPerfectSquare = false;
		for (int i = 0; i * i <= n; i++) {
			if (i * i == n) {
				isPerfectSquare = true;
				break;
			}
		}
		if (isPerfectSquare) {
			System.out.println(n + " Is perfect Square");
		} else {
			System.out.println(n + " Is not a perfect Square");
		}
	}
}
