// Que: Print Repetitive characters in a String;

package printRepetitiveCharactersInAString;

public class RepetitiveCharacters {
	public static void main(String[] args) {
		String str = "helloworld";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 0) {
				continue;
			}
			int count = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = 0;
					count++;
				}
			}
			if (count > 0) {
				System.out.println(ch[i] + " Repeated " + count + " times ");
			}
		}
	}

}
