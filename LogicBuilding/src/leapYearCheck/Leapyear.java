// Que: Check if year is LeapYear or Not.

package leapYearCheck;

public class Leapyear {
	public static void main(String[] args) {
		int year = 2024;

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // Logic for finding leapYear or Century LeapYear.
			System.out.println(year + " is Leap Year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}
}
