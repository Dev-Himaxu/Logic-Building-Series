// Que: Write a program to find the shortest distance to a character

package shortestDistanceToACharacter;

public class ShortestDistance {
	public static void main(String[] args) {
		String str = "hellos world";
		char target = 's';
		int lCount = 0;
		int rCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				break;
			}
			lCount++;
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == target) {
				break;
			}
			rCount++;
		}
		if (lCount > rCount) {
			System.out.println("Smallest distance is from right: " + rCount);
		} else {
			System.out.println("Smallest distance is from left:  " + lCount);
		}

	}
}