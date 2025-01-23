// Que: Check whether A String is Palindrome or not?

package checkStringIsPalindrome;

public class Palindrome {
	public static void main(String[] args) {
		String str = "level";
		boolean isPalindrome = true;
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				isPalindrome = false;
				break;
			}
			i++;
			j--;
		}
		if (isPalindrome) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
