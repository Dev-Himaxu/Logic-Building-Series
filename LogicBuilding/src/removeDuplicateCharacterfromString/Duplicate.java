// Que: Write a program to remove duplicate character from String.

package removeDuplicateCharacterfromString;

public class Duplicate {
	public static void main(String[] args) {
		String str = "helloooooh world";
		String newStr = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			boolean isDuplicate = false;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				newStr += ch[i];
			}
		}
		System.out.println(newStr);
	}

}
