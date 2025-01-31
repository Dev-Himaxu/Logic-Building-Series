package LeftHalfPyramid180RotatedPattern;

public class lefthalfPyramid {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("--------12345---------");
// Left Half Pyramid 180 Rotated Pattern with (numbers-1)
		for (int i = 5; i >= 1; i--) {
			int k = 1;
			for (int j = 1; j <= 5; j++) {
				if (j >= i) {
					System.out.print(k);
					k++;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------55555-----------");
// Left Half Pyramid 180 Rotated Pattern with (numbers-1)
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (j <= i) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------EEEEE---------");
// Left Half Pyramid 180 Rotated Pattern with (Alphabets)
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'E'; j >= 'A'; j--) {
				if (j <= i) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------ABCDE---------");
// Left Half Pyramid 180 Rotated Pattern with (Alphabets)
		for (char i = 'E'; i >= 'A'; i--) {
			char A = 'A';
			for (char j = 'A'; j <= 'E'; j++) {
				if (j >= i) {
					System.out.print(A);
					A++;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}