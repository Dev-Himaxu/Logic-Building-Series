//Que: convert decimal to Hexadecimal(16 digit)
/* hexNum=0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F
 * Index  0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15   
  * */

package decimalToHexadecimal;

public class Hexadecimal {
	public static void main(String[] args) {
		char[] arr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int decimal = 225;
		String hex = " ";
		while (decimal != 0) {
			int rem = decimal % 16;
			hex = arr[rem] + hex;
			decimal /= 16;
		}
		System.out.println("Hexadecimal = " + hex);
	}
}
