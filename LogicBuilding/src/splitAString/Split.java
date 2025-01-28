// Que: Write a program to split a string.

package splitAString;

import java.util.Arrays;

public class Split {
	public static int wordCount(String str) {
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "hello hello world";
		String[] s = new String[wordCount(str)];
		String new_str = "";
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				s[index++] = new_str;
				new_str = "";
			} else if (i == str.length() - 1) {
				new_str += str.charAt(i);
				s[index++] = new_str;
				new_str = "";

			} else {
				new_str = new_str + str.charAt(i);
			}
		}
		System.out.println(Arrays.toString(s));

	}

}
