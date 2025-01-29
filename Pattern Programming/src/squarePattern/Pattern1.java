package squarePattern;

public class Pattern1 {
	public static void main(String[] args) {
//		Square pattern of (*);
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
//		Square pattern of (number-12345)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j );
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
//			Square pattern of (number-11111)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
//		Square pattern of (Alphabet-ABCDE).
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
