// Que: Write a program for camelCase pattern Matching;

package camelCasePattern;

public class CamelCase {
	public static void main(String[] args) {
		String str = "WoRld";
		char[] ch = str.toCharArray();
		boolean isCamel = false;
		if (ch[0] >= 'a' && ch[0] <= 'z') {
			for (int i = 1; i < ch.length; i++) {
				if (ch[i] >= 'A' && ch[i] <= 'Z') {
					isCamel = true;
					break;
				}
			}
			if (isCamel) {
				System.out.println(" Yes ");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("NO");
		}

	}
}
