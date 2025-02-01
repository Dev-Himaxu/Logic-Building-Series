package hollowPyramid;

public class HollowPyramid {
	public static void main(String[] args) {
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (j >= i) {
					if (j == 4 || i == 0 || j == i) {
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
		System.out.println("-----01234------");
//		Hollow Pyramid using Numbers
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (j >= i) {
					if (j == 4 || i == 0 || j == i) {
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
		System.out.println("-----11111------");
//		Hollow Pyramid using Numbers
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (j >= i) {
					if (j == 4 || i == 0 || j == i) {
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
		System.out.println("-----AAAAA------");
//		Hollow Pyramid using Alphabets
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (j >= i) {
					if (j == 4 || i == 0 || j == i) {
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
		System.out.println("-----ABCDE------");
//		Hollow Pyramid using Alphabets
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (j >= i) {
					if (j == 4 || i == 0 || j == i) {
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
