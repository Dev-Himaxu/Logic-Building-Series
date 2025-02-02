// Que: Calculate Square Root of a Number.

package sqrtOfNumbers;

public class SquareRoot {
	public static double squareRoot(int num, double guess) {
		double new_guess = (guess + num / guess) / 2;
		if (guess == new_guess) {
			return new_guess;
		}
		return squareRoot(num, new_guess);
	}

	public static void main(String[] args) {
		System.out.println("Square Root : " + squareRoot(3, 3 / 2));
	}
}
