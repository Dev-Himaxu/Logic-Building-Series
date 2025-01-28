// Que: Write a program to check whether a character is vowel or consonant.

package checkCharacterIsVowelOrConsonant;

public class Charactercheck {
	public static void main(String[] args) {
		char ch = 'c';
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
				|| ch == 'o' || ch == 'u') {
			System.out.println(ch + " is Vowel");
		} else {
			System.out.println(ch + " is consonant");
		}
	}

}
