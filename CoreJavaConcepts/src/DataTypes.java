/**
 * DataTypes class contains examples of auto boxing of Primitive data type to
 * Object type and vice versa.
 * 
 * Also contain different ways of implementation of Object type based on java
 * version.
 * 
 * @author hpanmand
 *
 */
public class DataTypes {
	public static void main(String[] args) {
		// Below type of declaration is deprecated from java 9
		Integer myInteger1 = new Integer(11);
		// Direct assignment of object type to primitive data type is possible because
		// of auto boxing from java 5
		int myInt1 = myInteger1;
		System.out.println(myInt1);

		// Now you can use below type of declaration from java 9 onwards
		Integer myInteger2 = Integer.valueOf(22);
		int myInt2 = myInteger2;
		System.out.println(myInt2);

		// Direct assignment of object type to primitive data type is possible because
		// of auto boxing from java 5 and vice-versa
		int myInt3 = 33;
		Integer myInteger3 = myInt3;
		System.out.println(myInteger3.intValue());
	}
}
