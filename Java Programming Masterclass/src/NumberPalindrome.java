public class NumberPalindrome {

	public static boolean isPalindrome(int number) {
		int reverseNumber = 0, remainder, originalNumber = number;
		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			originalNumber /= 10;
		}

		if (reverseNumber == number) {
			return true;
		} else {
			return false;
		}
	}
}
