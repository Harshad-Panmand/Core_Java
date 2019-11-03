
public class IntEqualityPrinter {
	public static void printEqual(int firstValue, int secondValue, int thirdValue) {
		if ((firstValue < 0) || (secondValue < 0) || (thirdValue < 0)) {
			System.out.println("Invalid Value");
			return;
		}

		if (firstValue == secondValue) {
			if (secondValue == thirdValue) {
				if (firstValue == thirdValue) {
					System.out.println("All numbers are equal");
					return;
				} else {
					System.out.println("Neither all are equal or different");
					return;
				}
			} else {
				System.out.println("Neither all are equal or different");
				return;
			}
		} else if (firstValue == thirdValue) {
			System.out.println("Neither all are equal or different");
			return;
		} else if (secondValue == thirdValue) {
			System.out.println("Neither all are equal or different");
			return;
		} else {
			System.out.println("All numbers are different");
			return;
		}
	}
}
