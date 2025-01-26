// Que: Count the number of words that starts with a vowels in a string.

package countTheNumberOfWordsStartsWithVowelsInString;

public class VowelsCount {
	public static boolean vowelsCount(char ch) {
		return ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
				|| ch == 'U' || ch == 'u';
	}

	public static void main(String[] args) {
		String str = "all is well umbrella";
		char[] ch = str.toCharArray();
		int count = 0;

		if (vowelsCount(ch[0])) {
			count++;
		}
		for (int i = 1; i < ch.length; i++) {
			if (ch[i - 1] == ' ' && vowelsCount(ch[i])) {
				count++;
			}
		}
		System.out.println(count);

	}

}