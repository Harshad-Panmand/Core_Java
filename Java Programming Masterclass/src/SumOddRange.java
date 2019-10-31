
public class SumOddRange {

	public static boolean isOdd(int number) {
		if (number <= 0) {
			return false;
		}
		if (number % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static int sumOdd(int start, int end) {
		if ((start < 0) || (end < 0) || (end < start)) {
			return -1;
		}

		int sumOfOddNumbers = 0;

		for (int number = start; number <= end; number++) {
			if (isOdd(number)) {
				sumOfOddNumbers += number;
			}
		}

		return sumOfOddNumbers;
	}
}
