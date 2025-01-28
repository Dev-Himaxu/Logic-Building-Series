// Que: Remove Spaces in the String;

package removingSpacesInTheString;

public class RemoveSpace {
	public static void main(String[] args) {
		String str = "hello world";
		String new_str = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				new_str += str.charAt(i);
			}
		}
		System.out.println(new_str);
	}
}
