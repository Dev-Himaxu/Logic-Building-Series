// Que: Calculate product of elements in an array.

package calProductOfElementsInArray;

public class Product {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int product = 1;
		for (int i = 0; i < arr.length; i++) {
			product *= arr[i];
		}
		System.out.println(product);
	}

}
