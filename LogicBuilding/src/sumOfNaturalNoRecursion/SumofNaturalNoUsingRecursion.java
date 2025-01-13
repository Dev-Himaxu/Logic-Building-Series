// Que: write a program to find the sum of natural numbers using recursion .

package sumOfNaturalNoRecursion;

public class SumofNaturalNoUsingRecursion {
	public static int sumOfNaturalNo(int num) {
		if (num == 1) {
			return 1;
		}
		return num + sumOfNaturalNo(num - 1); // first runs factorial(num-1); then runs num * factorial(num-1);
	}

	public static void main(String[] args) {
		System.out.println(sumOfNaturalNo(5));
	}

}
