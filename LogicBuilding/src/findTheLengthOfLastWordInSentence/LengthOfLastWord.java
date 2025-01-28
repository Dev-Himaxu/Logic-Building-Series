// Que: Write a program to find the length of last word of in sentence.

package findTheLengthOfLastWordInSentence;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String str = "hello world hello";
		char ch[] = str.toCharArray();
		int length = 0;
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == ' ') {
				break;
			}
			length++;
		}
		System.out.println(length);
	}
}
