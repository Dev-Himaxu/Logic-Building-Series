// Que: Write a program to replace a specific character from a string.

package replaceASpecificCharacterFromString;

public class Replace {
	public static void main(String[] args) {
		String str = "hello";
		char[] ch = str.toCharArray();
		char target = 'e';
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == target) {
				ch[i] = 'd';
			}
		}
		System.out.println(ch);
	}

}
