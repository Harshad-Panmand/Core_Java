package hpJava.java12;

/**
 * <pre>
 * This class will give you all information about Switch expression of java 12
 * feature
 * 
 * More information available at 
 * https://openjdk.java.net/jeps/325
 * https://blog.codefx.org/java/switch-expressions/
 * </pre>
 * 
 * @author hpanmand
 *
 */

public class SwitchExpression {

	private static String switchStatementFunc(int dayOfWeek) {
		String returnStatement = null;
		switch (dayOfWeek) {
		case 1:
			returnStatement = "This is week day";
			break;
		case 2:
			returnStatement = "This is week day";
			break;
		case 3:
			returnStatement = "This is week day";
			break;
		case 4:
			returnStatement = "This is week day";
			break;
		case 5:
			returnStatement = "This is week day";
			break;
		case 6:
			returnStatement = "This is weekend day";
			break;
		case 7:
			returnStatement = "This is weekend day";
			break;
		default: {
			if (dayOfWeek < 1) {
				// you can replace break with return
				// `return` is only possible from block
				returnStatement = "Day of week should be positive value";
			} else {
				// `return` is only possible from block
				// you can replace break with return
				returnStatement = "Day of week should not be greater value than 7. Day of week starts from value 1[Monday]";
			}
		}
		}
		return returnStatement;
	}

	/**
	 * Retrieve the information of day based on day of week
	 * 
	 * @param dayOfWeek - week day number
	 * @return information about day of week
	 */
	private static String switchExpressionFunc(int dayOfWeek) {
		return switch (dayOfWeek) {
		case 1, 2, 3, 4, 5 -> "This is week day"; // For all the days that comes from monday to friday considered as
													// week day
		case 6, 7 -> "This is weekend day"; // direct return statement will not work here
		default -> {
			if (dayOfWeek < 1) {
				// you can replace break with return
				// `return` is only possible from block
				break "Day of week should be positive value";
			} else {
				// `return` is only possible from block
				// you can replace break with return
				break "Day of week should not be greater value than 7. Day of week starts from value 1[Monday]";
			}
		}
		};
	}

	public static void main(String[] args) {

		String typeOfDay = switchExpressionFunc(1);
		System.out.println(typeOfDay);

		typeOfDay = switchExpressionFunc(11);
		System.out.println(typeOfDay);

		typeOfDay = switchExpressionFunc(-1);
		System.out.println(typeOfDay);

		typeOfDay = switchExpressionFunc(6);
		System.out.println(typeOfDay);

		System.out.println("------------------------------------------------");
		System.out.println("Traditional switch statements output");
		typeOfDay = switchStatementFunc(1);
		System.out.println(typeOfDay);

		typeOfDay = switchStatementFunc(11);
		System.out.println(typeOfDay);

		typeOfDay = switchStatementFunc(-1);
		System.out.println(typeOfDay);

		typeOfDay = switchStatementFunc(6);
		System.out.println(typeOfDay);
	}
}
