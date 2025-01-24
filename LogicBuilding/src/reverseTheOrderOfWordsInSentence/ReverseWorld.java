// Que:Reversing the order of words in a sentence.

package reverseTheOrderOfWordsInSentence;

public class ReverseWorld {
	public static void reverse(int i, int j, char[] arr) {
		while (i < j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		String str = "hello hello world";
		char[] ch = str.toCharArray();
		reverse(0, ch.length-1, ch);
//		System.out.println(ch);
		int i = 0;
		for (int j = 0; j < ch.length; j++) {
			if (ch[j] == ' ') {
				reverse(i, j - 1, ch);
				i = j + 1;
//				System.out.println(ch);
			}
			if (j == ch.length - 1) {
				reverse(i, j, ch);
			}
		}
		System.out.println(ch);
	}
}
