package halfRightinvertedPyramidPatternrotated180;

public class rigthhalfPyramidPattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------54321----------");
//		Inverted Right Angle Triangle Pattern for(numbers-54321)
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("--------55555------------");
//		Inverted half pyramid with (numbers-55555)
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("-------12345-------------");
//		Inverted half pyramid with (numbers-12345)
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("--------11111------------");
//		Inverted half pyramid with (numbers-11111)
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("-------EDCBA------------");
//		Inverted half pyramid with (Alphabets-EDCBA)
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'E'; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-------EEEEE---------");
//		Inverted half pyramid with (Alphabets-EEEEE)
		for (char i = 'E'; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("-------ABCDE---------");
//		Inverted half pyramid with (Alphabets-ABCDE)
		for (char i = 'E'; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-------AAAAA---------");
//		Inverted half pyramid with (Alphabets-AAAAA)
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'E'; j >= i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
