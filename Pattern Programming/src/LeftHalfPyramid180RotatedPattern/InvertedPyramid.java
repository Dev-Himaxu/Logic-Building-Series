package LeftHalfPyramid180RotatedPattern;

public class InvertedPyramid {
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
//		Left Half Pyramid 180 Rotated Pattern with (numbers-1)
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j <= i) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		System.out.println("------55555-----------");
//		Left Half Pyramid 180 Rotated Pattern with (numbers-1)
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j <= i) {
					System.out.print(i);
				}
			}
			System.out.println();
		}
		System.out.println("------ABCDE---------");
//		Left Half Pyramid 180 Rotated Pattern with (Alphabets)
		for (char i = 'A'; i <= 'E'; i++) {
			for (char k = 'E'; k > i; k--) {
				System.out.print(" ");
			}
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("------EEEEE---------");
//		Left Half Pyramid 180 Rotated Pattern with (Alphabets)
		for (char i = 'A'; i <= 'E'; i++) {
			for (char k = 'E'; k > i; k--) {
				System.out.print(" ");
			}
			for (char j = 'A'; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
