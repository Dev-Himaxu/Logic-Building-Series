// Que:Find The LCM of Two Numbers.

package lcm;

public class LcmofNumber {
	public static void main(String[] args) {
		int n1 = 12;
		int n2 = 18;
		int greater = 0;

		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				greater = i;
			}
		}
		int lcm = n1 * n2 / greater;
		System.out.println(lcm);
	}
}
//	          	-----OR------

//		greater = (n1 > n2) ? n1 : n2;
//		int lcm = greater;
//		
//		while (true) {
//			if (lcm % n1 == 0 && lcm % n2 == 0) {
//				System.out.println(lcm);
//				break;
//			}
//			lcm += greater;
//		}

//	}
//}
// EXPLANATION

/*
 * Both are same syntax. if (num1 > num2){ greater = num1; }else { greater =
 * num2; }
 */

/*
 * Imagine you're trying to find the LCM of 3 and 5.
 * 
 * greater (the larger number) is 5. lcm is initially set to 5.
 * 
 * then iteration:1 Check if lcm (currently 5) is divisible by both 3 and 5.
 * It's not.
 * 
 * lcm += greater which is lcm = 5 + 5;. lcm is now updated to 10. Iteration 2:
 * 
 * Check if lcm (currently 10) is divisible by both 3 and 5. It's not. lcm +=
 * greater; becomes lcm = lcm + greater; which is lcm = 10 + 5;. lcm is now
 * updated to 15. Iteration 3:
 * 
 * Check if lcm (currently 15) is divisible by both 3 and 5. It is! The loop
 * breaks, and 15 is identified as the LCM of 3 and 5.
 */