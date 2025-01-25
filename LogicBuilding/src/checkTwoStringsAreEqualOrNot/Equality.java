// Que: Check If Strings Are Equal are not.

package checkTwoStringsAreEqualOrNot;

public class Equality {
	public static void main(String[] args) {
		String str = "hello";
		String str1 = "hello";
		boolean isEqual = true;
		if (str.length() != str1.length()) {
			isEqual = false;
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != str1.charAt(i)) {
					isEqual = false;
					break;
				}
			}
		}
		if (isEqual) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}

}
