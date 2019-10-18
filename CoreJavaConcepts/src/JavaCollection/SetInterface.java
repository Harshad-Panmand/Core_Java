package JavaCollection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		// HashSet does not maintain any order
		// It uses HashMap internally to store it’s elements.
		// It accepts null value
		Set<String> hashSet = new HashSet<>();
		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("Four");
		hashSet.add("Five");
		hashSet.add("Five");
		hashSet.add(null);
		hashSet.stream().forEach(p -> System.out.println(p));
		System.out.println("-------------------------------------");

		// LinkedHashSet maintain insertion order
		// It uses LinkedHashMap internally to store it’s elements.
		// It accepts null value
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("One");
		linkedHashSet.add("Two");
		linkedHashSet.add("Three");
		linkedHashSet.add("Four");
		linkedHashSet.add("Five");
		linkedHashSet.add("Five");
		linkedHashSet.add(null);
		linkedHashSet.stream().forEach(p -> System.out.println(p));
		System.out.println("-------------------------------------");

		// If no comparator used then elements are maintained in ascending order
		// It uses TreeMap internally to store it’s elements.
		// It dose not accepts null value
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("One");
		treeSet.add("Two");
		treeSet.add("Three");
		treeSet.add("Four");
		treeSet.add("Five");
		treeSet.add("Five");
		treeSet.stream().forEach(p -> System.out.println(p));
		System.out.println("-------------------------------------");
		treeSet.stream().sorted(Comparator.reverseOrder()).forEach(p -> System.out.println(p));
		System.out.println("-------------------------------------");

		// Converting collection to array, same way to used in other collections
		String[] stringNumbers = treeSet.toArray(new String[treeSet.size()]);
		for (String number : stringNumbers)
			System.out.println(number);
		System.out.println("-------------------------------------");

		// This works from java 9 onward
		// Immutable Non-Empty Set
		String[] nameArr = { "one", "two", "three" };
		Set<String[]> set = Set.<String[]>of(nameArr);
		set.stream().forEach(p -> {
			for (String str : p) {
				System.out.println(str); // one,two,three
			}
		});
		System.out.println("-------------------------------------");

		// Syntax of Immutable Non-Empty Set
		// static <E> Set<E> of(E... elements)
		Set<String> immutableSet = Set.of("one", "two", "three");
		immutableSet.stream().forEach(p -> System.out.println(p)); // random output

	}
}
