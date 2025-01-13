// Que: Print a table of any number.

package tableOfAnyNumber;

public class Table {
	public static void main(String[] args) {
		int num = 2;
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = num * i;
			System.out.println(num + " x " + i + " = " + sum);
		}
	}

}
