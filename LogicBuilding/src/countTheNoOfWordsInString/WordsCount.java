// Que: Write a program to count the number of words in string;

package countTheNoOfWordsInString;

public class WordsCount {
	public static void main(String[] args) {
		String str = "hello hello world how are you";
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("Words Count: " + count);
	}

}
