package hollowSquare;

public class HollowSquarePattern {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || j == 0 || j == 4 || i == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----00000---");
//		Hollow Square pattern using (Numbers);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || j == 0 || j == 4 || i == 4) {
					System.out.print(i + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----01234---");
//		Hollow Square pattern using (Numbers);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || j == 0 || j == 4 || i == 4) {
					System.out.print(j + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("---ABCDE----");
//		Hollow Square pattern using (Alphabets);
		for (char i = 'A'; i <='E'; i++) {
			for (char j ='A'; j <='E'; j++) {
				if (i == 'A' || j == 'A' || j == 'E' || i == 'E') {
					System.out.print(j+" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("---AAAAA----");
//		Hollow Square pattern using (Alphabets);
		for (char i = 'A'; i <='E'; i++) {
			for (char j ='A'; j <='E'; j++) {
				if (i == 'A' || j == 'A' || j == 'E' || i == 'E') {
					System.out.print(i +" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
