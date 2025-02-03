// Que: Convert a string to uppercase and lowercase

package upperCaseOrLowerCase;

public class UpperAndLowerCase {
	public static void main(String[] args) {
		String str = "hello WORLD";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		System.out.println(ch);
	}

}
