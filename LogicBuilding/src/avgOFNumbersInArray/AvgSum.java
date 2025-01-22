//Que: Write a program to find the average of numbers in an array.

package avgOFNumbersInArray;

public class AvgSum {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int avg = sum / arr.length;
		System.out.println(avg);
	}

}
