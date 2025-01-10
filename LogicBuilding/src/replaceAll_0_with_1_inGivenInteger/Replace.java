//Que: Replace all 0 with 1 in Given Integer.

package replaceAll_0_with_1_inGivenInteger;

public class Replace {
	public static void main(String[] args) {
		int num = 102030;
		int reverse = 0;
		int place = 1;
		while (num != 0) {
			int rem = num % 10;
			if (rem == 0) {
				rem = 1;
			}
			reverse = reverse + (rem * place);
			num /= 10;
			place *= 10;

		}
		System.out.println(reverse);
	}}

//  			-----OR--------
//
//		int num = 1020;
//		int reverse = 0;
//		while (num != 0) {
//			int rem = num % 10;
//			if (rem == 0) {
//				rem = 1;
//			}
//			reverse = (reverse * 10) + rem;
//			num /= 10;
//		}
//		while (reverse != 0) {
//			int rem = reverse % 10;
//			num = (num * 10) + rem;
//			reverse /= 10;
//		}
//		System.out.println(num);
//	}
//}