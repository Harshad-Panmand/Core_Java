import jdk.nashorn.api.tree.YieldTree;

public class SwitchStatements {
	public static void main(String[] args) {
		int day = 2;
		switch (day) {
		case 1:
			System.out.println("Its Monday");
			break;
		case 2:
			System.out.println("Its Tuesday");
			break;
		case 3:
			System.out.println("Its Wednesday");
			break;
		case 4:
			System.out.println("Its Thursday");
			break;
		case 5:
			System.out.println("Its Friday");
			break;
		case 6:
			System.out.println("Its Saturday");
			break;
		case 7:
			System.out.println("Its Sunday");
			break;
		default:
			System.out.println("Invalid day");
		}

		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Its Weekday");
			break;
		case 6:
		case 7:
			System.out.println("Its Weekend");
			break;
		default:
			System.out.println("Invalid day");
		}
	}
}