// Que: Write a program to concatenate two strings without using built in functions.

package concatenateTwoStrings;

public class ConcatenateStrings {
	public static void main(String[] args) {
		String s = "hello";
		String s1 = "world";
		String new_str = "";
		for (int i = 0; i < s.length(); i++) {
			new_str += s.charAt(i);

		}
		for (int i = 0; i < s1.length(); i++) {
			new_str += s1.charAt(i);
		}
		System.out.println(new_str);
	}

}
