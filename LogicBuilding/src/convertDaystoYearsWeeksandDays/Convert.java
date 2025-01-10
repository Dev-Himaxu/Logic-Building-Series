// Que: Convert No of days into Years,Weeks and Days.

package convertDaystoYearsWeeksandDays;

public class Convert {
	public static void main(String[] args) {
		int inputDays = 1000;

		int years = (inputDays / 365);
		int weeks = (inputDays % 365) / 7;
		int days = (inputDays % 365 % 7);

		System.out.println(years + " Years " + weeks + " Weeks " + days + " Days ");

	}
}
