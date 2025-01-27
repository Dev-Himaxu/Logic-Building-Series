// Que: Write a program to check if string contains another string

package checkIfStringContainAnother_String;

public class CheckString {
	public static void main(String[] args) {
		String str = "hello world hello hello";
		String subStr = "hello";
		int count = 0;
		for (int i = 0; i <= str.length() - subStr.length(); i++) {
			boolean isMatch = true;
			for (int j = 0; j < subStr.length(); j++) {
				if (str.charAt(j + i) != subStr.charAt(j)) {
					isMatch = false;
					break;
				}
			}
			if (isMatch) {
				count++;
			}
		}
		System.out.println("Yes the string \"" + subStr + "\"  Occurs  \"" + count + "\"  times in String");
	}

}
