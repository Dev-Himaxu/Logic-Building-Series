package hollowHalfLeftPyramid;

public class HollowHalfLeft {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j + i == 4 || j == 4 || i == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----01234--------");
//		Hollow Half Left Pyramid Using (Numbers)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j + i == 4 || j == 4 || i == 4) {
					System.out.print(j + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----44444--------");
//		Hollow Half Left Pyramid Using (Numbers)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j + i == 4 || j == 4 || i == 4) {
					System.out.print(i + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----ABCDE--------");
//		Hollow Half Left Pyramid Using (Alphabets)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j + i == 4 || j == 4 || i == 4) {
					System.out.print((char) ('A' + j) + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----EEEEE--------");
//		Hollow Half Left Pyramid Using (Alphabets)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j + i == 4 || j == 4 || i == 4) {
					System.out.print((char) ('A' + i) + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}