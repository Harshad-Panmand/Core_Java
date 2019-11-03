
public class DecimalComparator {
	public static boolean areEqualByThreeDecimalPlaces(double firstDecimalValue, double secondDecimalValue) {
		double firstValue = firstDecimalValue * 1000;
		double secondValue = secondDecimalValue * 1000;

		if ((int) firstValue - (int) secondValue == 0) {
			return true;
		} else {
			return false;
		}
	}
}
