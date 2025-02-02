// Que:Write a program to find the root of Quadratic equation.

package rootOfQuadraticEquations;

public class QuadraticEqtn {
	public static double squareRoot(int num, double guess) {
		double new_guess = (guess + num / guess) / 2;
		if (guess == new_guess) {
			return new_guess;
		}
		return squareRoot(num, new_guess);
	}

	public static void main(String[] args) {
		int a = 4, b = 2, c = 1;
		double root1 = 0, root2 = 0;
		int discriminant = (b * b) - 4 * a * c;
		if (discriminant > 0) {
			root1 = (-b + squareRoot(discriminant, discriminant / 2) / 2 * a);
			root2 = (-b - squareRoot(discriminant, discriminant / 2) / 2 * a);
			System.out.println(root1);
			System.out.println(root2);
		} else if (discriminant == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.println("Equal roots" + root1);
		} else {
			System.out.println("Imaginary roots");
		}

	}

}
