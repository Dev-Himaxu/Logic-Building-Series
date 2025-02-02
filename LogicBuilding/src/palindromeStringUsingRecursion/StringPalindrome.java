//Que: Check if String is palindrome Using Recursion.  

package palindromeStringUsingRecursion;

public class StringPalindrome {
	public static boolean isPalindrome(int i, int j, String str) {
		if (i > j) {
			return true;
		}
		if (str.charAt(i) != str.charAt(j)) {
			return false;
		}
		return isPalindrome(i+1, j-1, str);
	}

	public static void main(String[] args) {
		String str = "level";
		if (isPalindrome(0, str.length() - 1, str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
