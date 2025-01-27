// Que: Remove the given character from the string;

package removeGivenCharacterfromString;

public class GivenCharacter {
	public static void main(String[] args) {
		String str = "hello world";
		char[] ch = str.toCharArray();
		char target = 'w'; 
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == target) {
				ch[i] = ' ';
			}
		}
		System.out.println(ch);
	}
}
