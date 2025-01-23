// Que: Check if two Strings Are Anagrams.

package checkTwoStringsAreAnagram;

public class Anagrams {
	public static void main(String[] args) {
		String str = "worth";
		String str1 = "throw";
		if (str.length() == str1.length()) {
			char[] ch1 = str.toCharArray();
			char[] ch2 = str1.toCharArray();
			for (int i = 0; i < ch1.length; i++) {
				for (int j = 0; j < ch1.length - 1; j++) {
					if (ch1[j] > ch1[j + 1]) {
						char temp = ch1[j];
						ch1[j] = ch1[j + 1];
						ch1[j + 1] = temp;
					}
					if (ch2[j] > ch2[j + 1]) {
						char temp = ch2[j];
						ch2[j] = ch2[j + 1];
						ch2[j + 1] = temp;
					}
				}
			}
			boolean isAnagram=true;
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i]!=ch2[i]) {
					isAnagram=false;
					break;
				}
			}
			if (isAnagram) {
				System.out.println("Strings Are Anagrams");
			} else {
				System.out.println("Strings are not Anagrams");

			}
		} else {
			System.out.println("Strings are not of Equal length");
		}
	}

}
