// Que: Check if Strings Contains only Digits.

package checkStringContainOnlyNumber;

public class ContainNumber {
	public static void main(String[] args) {
		String str = "12b348c";
		boolean isDigit = true;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				isDigit = true;
			} else {
				isDigit = false;
				break;
			}
		}
		if (isDigit) {
			System.out.println("String has only numbers");
		} else {
			System.out.println("String has Alphabet values");
		}
	}

}
