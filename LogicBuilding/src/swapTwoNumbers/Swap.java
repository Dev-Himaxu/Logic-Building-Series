// Que: Swap two numbers without using third Variables;

package swapTwoNumbers;

public class Swap {
	public static void main(String[] args) {

//	by Addition and Subtraction
		int a = 2;
		int b = 4;

		a = a + b; // a=2+4=6
		b = a - b; // b=6-4=2
		a = a - b; // a=6-2=4

//  by Division and Multiplication

//		a = a * b; // a=2*4 =8
//		b = a / b; // b=8/4 =2
//		a = a / b; // a=8/2 =4

//  With using third variables;
//
//		int temp = a;
//		a = b;
//		b = temp;

		System.out.println(a + " " + b);
	}
}
