// Que: find a Missing number in an array 1 of 10;

package findAMissingNo1_10;

public class MissingNo {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
//		formula used TotalSum of Number in range =(n*(n+1))/2;
		int n = 10;
		int expectedSum = (n * (n + 1)) / 2;
		int actualSum = 0;
		for (int i = 0; i < arr.length; i++) {
			actualSum += arr[i];
		}
		int missingNumber = expectedSum - actualSum;
		System.out.println("Missing No = " + missingNumber);
	}

}
