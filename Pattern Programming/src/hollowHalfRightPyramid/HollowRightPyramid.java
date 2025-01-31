package hollowHalfRightPyramid;

public class HollowRightPyramid {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == i || i == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("---01234---------");
//		Hollow half right pyramid using(Numbers)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == i || i == 4) {
					System.out.print(j+" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("---44444---------");
//		Hollow half right pyramid using(Numbers)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == i || i == 4) {
					System.out.print(i+" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------EEEEE--------");
//		Hollow half right pyramid using(Alphabets)
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				if (j == 'A' || j == i || i == 'E') {
					System.out.print(i+" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------ABCDE--------");
//		Hollow half right pyramid using(Alphabets)
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				if (j == 'A' || j == i || i == 'E') {
					System.out.print(j+" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
