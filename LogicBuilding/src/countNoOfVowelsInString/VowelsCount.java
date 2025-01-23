// Que: Count Number of Vowels in a String;

package countNoOfVowelsInString;

public class VowelsCount {
	public static void main(String[] args) {
		String str = "Hello World";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'E' || str.charAt(i) == 'e'
					|| str.charAt(i) == 'I' || str.charAt(i) == 'i' || str.charAt(i) == 'O' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'U' || str.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("No of Vowels: "+count);
	}

}
