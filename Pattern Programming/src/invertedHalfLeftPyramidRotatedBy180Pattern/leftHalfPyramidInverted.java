package invertedHalfLeftPyramidRotatedBy180Pattern;

public class leftHalfPyramidInverted {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------11111---");
//		Inverted Half Pyramid Rotated By 180 Pattern Using (Numbers)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= i) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------12345---");
//		Inverted Half Pyramid Rotated By 180 Pattern Using (Numbers)
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {
				if (j <= 5 - i) {
					System.out.print(" ");
				} else {
					System.out.print(j - (5 - i));
				}
			}
			System.out.println();
		}
		System.out.println("------AAAAA---");
//		Inverted Half Pyramid Rotated By 180 Pattern Using (Alphabets)
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				if (j >= i) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------ABCDE---");
////		Inverted Half Pyramid Rotated By 180 Pattern Using (Alphabets)
//		for (char i = 'A'; i <= 'E'; i++) {
//			for (char j = 'A'; j <= j - (i - 'E'); j++) {
//				if (j < i) {
//					System.out.print(" ");
//				} else {
//					System.out.print(j);
//				}
//			}
//			System.out.println();
//		}
	}

}
