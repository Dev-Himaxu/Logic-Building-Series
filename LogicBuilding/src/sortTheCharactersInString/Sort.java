// Que: Sort the characters in the string;

package sortTheCharactersInString;

public class Sort {
	public static void main(String[] args) {
		String str = "hello world";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length - 1; j++) {
				if (ch[j] > ch[j + 1]) {
					char temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;

				}
			}
		}
		System.out.println(ch);
	}

}
