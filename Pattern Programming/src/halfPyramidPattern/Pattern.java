package halfPyramidPattern;

public class Pattern {
	public static void main(String[] args) {
//		Right Angle Triangle Pattern of(*)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------");
//		Right Angle Triangle Pattern of(numbers-1)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("----------------------");
//		Right Angle Triangle Pattern of(numbers-1)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("----------------------");
//		Right Angle Triangle Pattern of(Alphabets-A)
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("----------------------");
//		Right Angle Triangle Pattern of(Alphabets-A)
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
