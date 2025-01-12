// Que: Check if year is LeapYear or Not.

package leapYearCheck;

public class Leapyear {
	public static void main(String[] args) {
		int year = 1000;
		if (year % 400 == 0) {
			System.out.println(year + " is a Century Leap Year");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " is Leap Year");
		} else {
			System.out.println(year + " is not a Leap Year");
		}

	}
}
