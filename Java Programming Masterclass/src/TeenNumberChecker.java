
public class TeenNumberChecker {
	public static boolean hasTeen(int firstValue, int secondValue, int thirdValue) {
		if (isTeen(firstValue) || isTeen(secondValue) || isTeen(thirdValue)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isTeen(int age) {
		if ((age >= 13) && (age <= 19)) {
			return true;
		} else {
			return false;
		}
	}
}
