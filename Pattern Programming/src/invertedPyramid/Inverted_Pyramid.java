package invertedPyramid;

public class Inverted_Pyramid {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= i) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("----11111------");
//		Inverted Pyramid using(Numbers-11111);
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= i) {
					System.out.print(i + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("----12345------");
//		Inverted Pyramid using(Numbers-12345);
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= i) {
					System.out.print(j + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("----ABCDE------");
//		Inverted Pyramid using(Numbers-12345);
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				if (j >= i) {
					System.out.print(j + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("----AAAAA------");
//		Inverted Pyramid using(Numbers-12345);
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				if (j >= i) {
					System.out.print(i + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
