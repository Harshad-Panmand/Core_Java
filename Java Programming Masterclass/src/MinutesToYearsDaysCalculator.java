
public class MinutesToYearsDaysCalculator {
	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
			return;
		}

		long hours = minutes / 60;
		long days = hours / 24;
		long year = days / 365;
		int remainingDays = (int) (days % 365);

		System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
	}
}
