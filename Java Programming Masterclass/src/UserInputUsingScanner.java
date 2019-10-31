import java.util.Scanner;

public class UserInputUsingScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your birth year");
		if (scanner.hasNextInt()) {
			int yearOfBirth = scanner.nextInt();

			scanner.nextLine();// handle next line character(enter key)

			System.out.println("Enter your name");
			String name = scanner.nextLine();

			int age = 2019 - yearOfBirth;
			if (age >= 0 && age <= 100) {
				System.out.println(
						"Your name is " + name + " your birth year is " + yearOfBirth + " and you are " + age + " old");
			} else {
				System.out.println("Please enter valid birth year");
			}

		} else {
			System.out.println("Please enter your birth year in number");
		}
		scanner.close();
	}
}
