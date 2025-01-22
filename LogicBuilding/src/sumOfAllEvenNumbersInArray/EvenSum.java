//Que: write a program to find the sum of all even number in array;

package sumOfAllEvenNumbersInArray;

public class EvenSum {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 45, 5 };
		int EvenSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				EvenSum += arr[i];
			}
		}
		System.out.println("Sum of all even number: " + EvenSum);
	}

}
