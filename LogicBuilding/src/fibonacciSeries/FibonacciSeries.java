// Que: Find the fibonacci series.

package fibonacciSeries;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 10; // No of series we need.
		int firstnum = 0;
		int secondnum = 1;

		System.out.print(firstnum + " " + secondnum);
		for (int i = 2; i < n; i++) { // i=2 coz first two digit of a series are already printed and i < n because we
										// need ten no. of series.
			int nextnum = (firstnum + secondnum);
			firstnum = secondnum;
			secondnum = nextnum;
			System.out.print(" " + nextnum);
		}

	}

}
