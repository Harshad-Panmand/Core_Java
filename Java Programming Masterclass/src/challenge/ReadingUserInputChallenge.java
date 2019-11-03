package challenge;

import java.util.*;

public class ReadingUserInputChallenge {
	public static void readUserInputNumbers(int counter) {
		Scanner scanner = new Scanner(System.in);
		int count = 1;
		int sum = 0;
		while (count <= counter) {
			System.out.println("Enter number #" + count);
			if (scanner.hasNextInt()) {
				int inputNumber = scanner.nextInt();
				count++;
				sum += inputNumber;
			} else {
				System.out.println("Invalid Number");
			}
			scanner.nextLine(); // handle end of line (enter key). this will handle multiple enter
		}
		System.out.println("Sum of user input numnbers is = " + sum);
		scanner.close();
	}

	public static void main(String[] args) {
		readUserInputNumbers(10);
	}
}
