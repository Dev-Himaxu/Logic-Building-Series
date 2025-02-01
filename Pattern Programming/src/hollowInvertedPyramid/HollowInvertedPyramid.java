package hollowInvertedPyramid;

public class HollowInvertedPyramid {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= i) {
					if (i == 0 || j == 4 || i == j) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("-----01234--------");
//		Hollow Inverted Pyramid Using (Numbers)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= i) {
					if (i == 0 || j == 4 || i == j) {
						System.out.print(j + " ");
					} else {
						System.out.print("  ");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("-----00000--------");
//		Hollow Inverted Pyramid Using (Numbers)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= i) {
					if (i == 0 || j == 4 || i == j) {
						System.out.print(i + " ");
					} else {
						System.out.print("  ");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("-----AAAAA--------");
//		Hollow Inverted Pyramid Using (Numbers)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= i) {
					if (i == 0 || j == 4 || i == j) {
						System.out.print((char) ('A' + i) + " ");
					} else {
						System.out.print("  ");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("-----ABCDE--------");
//		Hollow Inverted Pyramid Using (Numbers)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= i) {
					if (i == 0 || j == 4 || i == j) {
						System.out.print((char) ('A' + j) + " ");
					} else {
						System.out.print("  ");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
