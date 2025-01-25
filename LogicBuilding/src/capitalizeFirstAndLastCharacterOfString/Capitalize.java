// Que: Capitalize first and last character of string.

package capitalizeFirstAndLastCharacterOfString;

public class Capitalize {
	public static char toUpperCase(char ch) {
		if (ch >= 'a' && ch <= 'z') {
			ch = (char) ((char) ch - 32);
		}
		return ch;
	}

	public static void main(String[] args) {
		String str = "hello world world";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				ch[i - 1] = toUpperCase(ch[i - 1]);
				ch[i + 1] = toUpperCase(ch[i + 1]);
			} else if (i == 0 || i == ch.length - 1) {
				ch[i] = toUpperCase(ch[i]);
			}
		}
		System.out.println(ch);
	}

}
