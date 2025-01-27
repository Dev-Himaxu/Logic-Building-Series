// Que: Write a program to remove duplicate character from String.

package removeDuplicateCharacterfromString;

public class Duplicate {
	public static void main(String[] args) {
		String str = "helloooooh";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = ' ';
				}
			}
		}
		System.out.println(ch);
	}

}
