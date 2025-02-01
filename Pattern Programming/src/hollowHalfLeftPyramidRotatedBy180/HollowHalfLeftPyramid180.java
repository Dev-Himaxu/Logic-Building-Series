package hollowHalfLeftPyramidRotatedBy180;

public class HollowHalfLeftPyramid180 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || j == 4 || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----01234-----");
//		Hollow Half Left Pyramid Rotated By180(Numbers)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || j == 4 || i == j) {
					System.out.print(j + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----00000-----");
//		Hollow Half Left Pyramid Rotated By180(Numbers)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || j == 4 || i == j) {
					System.out.print(i + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----AAAAA-----");
//		Hollow Half Left Pyramid Rotated By180(Numbers)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || j == 4 || i == j) {
					System.out.print((char) ('A' + i) + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----ABCDE------");
//		Hollow Half Left Pyramid Rotated By180(Numbers)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || j == 4 || i == j) {
					System.out.print((char) ('A' + j) + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
