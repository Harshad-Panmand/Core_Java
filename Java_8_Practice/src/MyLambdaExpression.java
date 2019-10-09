/**
 * LambdaExpression class is an example of lambda expression which is introduced in java 8.
 * Lambda expression is implemented using functional interface.
 * Lambda expression can be used to represent instance of functional interface.
 * 
 * The body of a lambda expression can contain zero, one or more statements.
 * When there is a single statement curly brackets are not mandatory and 
 * the return type of the anonymous function is the same as that of the body expression.
 * When there are more than one statements, then these must be enclosed in curly brackets
 * (a code block) and the return type of the anonymous function is the same as the type of 
 * the value returned within the code block, or void if nothing is returned.
 * @author hpanmand
 *
 */

/**
 * MyFunctionalInterface is an function interface. An interface which contains
 * only one abstract method is called as functional interface. Functional
 * interface may have any number of default methods.
 * 
 * An interface with exactly one abstract method is called Functional Interface.
 * 
 * @FunctionalInterface annotation is added so that we can mark an interface as
 *                      functional interface. It is not mandatory to use it, but
 *                      it’s best practice to use it with functional interfaces
 *                      to avoid addition of extra methods accidentally. If the
 *                      interface is annotated with @FunctionalInterface
 *                      annotation and we try to have more than one abstract
 *                      method, it throws compiler error.
 * @author hpanmand
 *
 */
interface MyFunctionalInterface {
	int abstractLamdaFunc(int a, int b);
}

/**
 * LambdaExpression class contains implementation of lambda expression.
 * 
 * @author hpanmand
 *
 */
public class MyLambdaExpression {
	/**
	 * doCalculation performs operation on given parameter based on reference of
	 * MyFunctionalInterface interface.
	 * 
	 * @param paramOne
	 * @param paramTwo
	 * @param mfi
	 * @return
	 */
	int doCalculation(int paramOne, int paramTwo, MyFunctionalInterface mfi) {
		return mfi.abstractLamdaFunc(paramOne, paramTwo);
	}

	public static void main(String[] args) {
		int firstNumber = 23, secondNumber = 12, res = 0;

		MyLambdaExpression le = new MyLambdaExpression();

		// Below lambda expression is also valid
		/*
		 * MyFunctionalInterface mfiMultiplication = (int x, int y) -> { return x * y;
		 * };
		 */

		MyFunctionalInterface mfiMultiplication = (int x, int y) -> x * y;
		// Calling abstract method using class method
		res = le.doCalculation(firstNumber, secondNumber, mfiMultiplication);
		System.out.println(firstNumber + " * " + secondNumber + " = " + res);

		MyFunctionalInterface mfiDivision = (int x, int y) -> x / y;
		res = le.doCalculation(firstNumber, secondNumber, mfiDivision);
		System.out.println(firstNumber + " / " + secondNumber + " = " + res);

		MyFunctionalInterface mfiAddition = (int x, int y) -> x + y;
		res = le.doCalculation(firstNumber, secondNumber, mfiAddition);
		System.out.println(firstNumber + " + " + secondNumber + " = " + res);

		MyFunctionalInterface mfiSubtraction = (int x, int y) -> x - y;
		// Calling abstract method using reference of interface
		res = mfiSubtraction.abstractLamdaFunc(firstNumber, secondNumber);
		System.out.println(firstNumber + " - " + secondNumber + " = " + res);
	}
}