// Que: How to count the occurrence of each character in string;

package countTheOccurrenceOfEachCharacterInString;

public class CharacterOccurences {
	public static void main(String[] args) {

		String str = "helloworldhello";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 0) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = 0;
					count++;

				}
			}
			if (count > 0) {
				System.out.println("Character \"" + ch[i] + "\" is \"" + count + "\" times in string ");
			}
		}
	}

}
