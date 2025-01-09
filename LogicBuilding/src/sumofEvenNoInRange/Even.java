package sumofEvenNoInRange;

public class Even {
	public static void main(String[] args) {
		int n = 30;
		int evenSum = 0;
		for (int i = 11; i <= n; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			}
		}
		System.out.println(evenSum);
	}
}
