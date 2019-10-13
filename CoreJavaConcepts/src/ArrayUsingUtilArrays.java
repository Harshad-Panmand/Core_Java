
/**
 * <pre>
 * ArrayUsingUtilArrays class contains basic ways of implementing & performing operations on array in java as well as using java.util.Arrays
 * 
 * Point to Remember:
 * 1) Array length cannot be change.
 * 2) Please check example of Employee object sorting using lambda expression.
 * </pre>
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayUsingUtilArrays {
	public static void main(String[] args) {
		// Initializing array to default value of its data type
		System.out.println("Initializing array to its default value of int data type");
		int[] firstArray = new int[10];
		for (int i : firstArray) {
			System.out.println(i);
		}
		System.out.println("----------------------------------------------------------");

		// Initializing array to specific value of its data type
		System.out.println("Initializing array to its specific value of int data type");
		int[] secondArray = new int[10];
		Arrays.fill(secondArray, 2);
		for (int i : secondArray) {
			System.out.println(i);
		}
		System.out.println("----------------------------------------------------------");

		// Initializing array elements with specified values using 'new' keyword
		int[] thirdArray = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// Initializing array elements with specified values without using 'new' keyword
		int[] fourthArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// Copying array using Arrays class method
		int[] fifthArray = Arrays.copyOf(fourthArray, fourthArray.length);
		for (int i : fifthArray) {
			System.out.println(i);
		}
		System.out.println("----------------------------------------------------------");

		// Sorting array using sort() of Arrays
		int[] sixthArray = { 4, 5, 8, 2, 9, 1, 7, 0, 6, 3 };
		Arrays.sort(sixthArray);
		// Sort array in ascending order
		System.out.println(Arrays.toString(sixthArray));
		System.out.println("----------------------------------------------------------");

		// To sort array in descending order we have to use Integer array instead of
		// primitive type int
		Integer[] seventhArray = { 4, 5, 8, 2, 9, 1, 7, 0, 6, 3 };
		// Sort array in descending order
		Arrays.sort(seventhArray, Collections.reverseOrder());
		System.out.println(Arrays.toString(seventhArray));
		System.out.println("----------------------------------------------------------");

		Employee[] empArray = { new Employee("Naveen", 123), new Employee("Harshad", 456), new Employee("Ravi", 345),
				new Employee("Nitin", 234) };

		System.out.println("Sorting based on employee name");
		// Sorting employee object based employee names using lambda expression
		Arrays.sort(empArray, (Employee emp1, Employee emp2) -> emp1.empName.compareTo(emp2.empName));

		for (Employee emp : empArray) {
			System.out.println(emp.empName + ", " + emp.empNumber);
		}

		System.out.println("----------------------------------------------------------");
		System.out.println("Sorting based on employee number");
		// Sorting employee object based employee number using lambda expression
		Arrays.sort(empArray, (Employee emp1, Employee emp2) -> emp1.empNumber - emp2.empNumber);

		for (Employee emp : empArray) {
			System.out.println(emp.empName + ", " + emp.empNumber);
		}

		System.out.println("----------------------------------------------------------");
		System.out.println("Sorting based on employee number without using lambda expression");
		// Sorting employee object based employee number without using lambda expression
		Arrays.sort(empArray, new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.empNumber - emp2.empNumber;
			}
		});

		for (Employee emp : empArray) {
			System.out.println(emp.empName + ", " + emp.empNumber);
		}
		System.out.println("----------------------------------------------------------");
	}
}

/**
 * Employee class contains basic information of employee.
 * 
 * @author hpanmand
 *
 */
class Employee {
	public String empName;
	public int empNumber;

	Employee(String empName, int empNumber) {
		this.empName = empName;
		this.empNumber = empNumber;
	}
}