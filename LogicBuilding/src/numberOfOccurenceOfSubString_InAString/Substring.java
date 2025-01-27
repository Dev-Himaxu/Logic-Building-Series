// Que: find the numbers of occurrences of substring in string;

package numberOfOccurenceOfSubString_InAString;

public class Substring {
	public static void main(String[] args) {
		String str = "hello world hello";
		String subStr = "hello";
		int count = 0;
		for (int i = 0; i <= str.length() - subStr.length(); i++) {
			boolean isMatch = true;
			for (int j = 0; j < subStr.length(); j++) {
				if (str.charAt(i + j) != subStr.charAt(j)) {
					isMatch = false;
					break;
				}
			}
			if (isMatch) {
				count++;
			}
		}
		System.out.println("The substring \"" + subStr + "\"  Occurs  \"" + count + "\"  times");
	}

}
