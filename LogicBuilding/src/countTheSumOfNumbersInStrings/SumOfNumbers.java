// Que: Write a program to count the sum of numbers in String.

package countTheSumOfNumbersInStrings;

public class SumOfNumbers {
	public static void main(String[] args) {
		String str = "1a375354";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				int j = str.charAt(i);
				j = j - 48;
				sum += j;
			}
		}
		System.out.println("Sum of numbers in string= " + sum);
	}

}
