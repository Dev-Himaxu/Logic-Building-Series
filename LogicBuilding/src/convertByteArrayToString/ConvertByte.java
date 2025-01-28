// Que: convert byte Array to string

package convertByteArrayToString;

public class ConvertByte {
	public static void main(String[] args) {
		byte[] b = { 72, 101, 108, 108, 111 };
		String s = "";
		for (int i = 0; i < b.length; i++) {
			s += (char) b[i];
		}
		System.out.println(s);
	}

}
