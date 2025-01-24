// Que: Parenthesis Checker;

package parenthesisChecker;

public class Parenthesis {
	public static void main(String[] args) {
		String str = "(a(b*c))";
		int c1 = 0;
		int c2 = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '(') {
				c1++;
			}
			if (ch[i] == ')') {
				c2++;
			}
		}
		if (c1 == c2) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}
}
