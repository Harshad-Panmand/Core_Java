
interface MyFunctionalInterface {
	int abstractLamdaFunc(int a, int b);
}

public class LambdaExpression {
	
	int doCalculation(int a, int b, MyFunctionalInterface mfi) {
		return mfi.abstractLamdaFunc(a, b);
	}
	
	public static void main(String[] args) {
		//	MyFunctionalInterface mfiMultiplication = (int x, int y) -> x * y;	//	This is also valid
		MyFunctionalInterface mfiMultiplication = (int x, int y) -> { return x * y;};
		LambdaExpression le = new LambdaExpression();
		
		int res = le.doCalculation(10, 20, mfiMultiplication);
		System.out.println(res);
		
		MyFunctionalInterface mfiDivision = (int x, int y) -> x / y;
		res = le.doCalculation(10, 20, mfiDivision);
		System.out.println(res);
		
		MyFunctionalInterface mfiAddition = (int x, int y) -> x + y;
		res = le.doCalculation(10, 20, mfiAddition);
		System.out.println(res);
		
		
	}
}