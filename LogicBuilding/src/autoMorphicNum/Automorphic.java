// Que: Write a program to check Automorphic Number. 
// if we have to find two digit then (square%100) use this.

package autoMorphicNum;

public class Automorphic {
	public static void main(String[] args) {
		int num = 5;
		int square = num * num;
		if (square % 10 == num) {
			System.out.println(num + " is An automorphic number");
		} else {
			System.out.println(num + " is not an Automorphic number");
		}
	}

}
