import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <pre>
 * A collection is an in-memory data structure to hold values and before we
 * start using collection, all the values should have been populated. Whereas a
 * java Stream is a data structure that is computed on-demand.
 * 
 * Java Stream doesn’t store data, it operates on the source data structure
 * (collection and array) and produce pipelined data that we can use and perform
 * specific operations.
 * 
 * Java Stream operations use functional interfaces, that makes it a very good
 * fit for functional programming using lambda expression.
 * 
 * Java 8 Stream support sequential as well as parallel processing, parallel
 * processing can be very helpful in achieving high performance for large
 * collections.
 * 
 * </pre>
 * 
 * @author hpanmand
 *
 */
public class MyStreamClass {
	public static void main(String[] args) {
		// Stream.of() to create a stream using int value.
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
		stream1.forEach(p -> System.out.println(p));
		System.out.println("---------------------------------------");

		// Create Stream using array, NOTE: we have used Integer[] instead of int
		// because it doesn't support auto boxing
		Stream<Integer> stream2 = Stream.of(new Integer[] { 11, 22, 33, 44, 55 });
		stream2.forEach(p -> System.out.println(p));
		System.out.println("---------------------------------------");

		//////////////////////////////////////////////////////
		// stream vs parallelStream
		//////////////////////////////////////////////////////
		List<Integer> intList1 = new ArrayList<>();
		for (int i = 1; i <= 100; i++)
			intList1.add(i);

		// sequential stream
		Stream<Integer> sequentialStream = intList1.stream();
		// filter is Stream's Intermediate Operations
		sequentialStream.filter(p -> p > 90).forEach(p -> System.out.println(p));
		System.out.println("---------------------------------------");

		// sequential stream
		Stream<Integer> parallelStream = intList1.parallelStream();
		parallelStream.filter(p -> p > 90).forEach(p -> System.out.println(p));
		System.out.println("---------------------------------------");

		// Converting Stream to collection.
		Stream<Integer> intStream1 = Stream.of(10, 20, 30, 40, 50);
		List<Integer> intList2 = intStream1.collect(Collectors.toList());
		intList2.forEach(p -> System.out.println(p)); // forEach is stream terminal operation
		System.out.println("---------------------------------------");

		// Converting stream to map
		Stream<Integer> intStream2 = Stream.of(10, 20, 30, 40, 50);
		Map<Integer, Integer> intList3 = intStream2.collect(Collectors.toMap(p -> p, p -> p + 9));
		System.out.println(intList3);
		System.out.println("---------------------------------------");

		// Converting Stream to array.
		Stream<Integer> intStream3 = Stream.of(11, 12, 13, 14, 15);
		Integer[] intArray1 = intStream3.toArray(Integer[]::new);
		System.out.println(Arrays.toString(intArray1));
		System.out.println("---------------------------------------");

		//////////////////////////////////////////////////////
		// Stream intermediate operations
		//////////////////////////////////////////////////////
		// use of map()
		Stream<String> stringStream1 = Stream.of("one", "tWo", "ThReE", "foUR");
		System.out.println(stringStream1.map(p -> p.toUpperCase()).collect(Collectors.toList()));
		System.out.println("---------------------------------------");

		// use of sorted() API
		Stream<String> stringStream2 = Stream.of("one", "tWo", "ThReE", "foUR");
		List<String> reverseString = stringStream2.map(p -> p.toUpperCase()).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(reverseString.toString());
		System.out.println("---------------------------------------");

		// use of flatMap() it is used create a stream from the stream of list
		Stream<List<String>> streamOfList = Stream.of(Arrays.asList("ABC"), Arrays.asList("DEf"), Arrays.asList("GHI"));
		Stream<String> stringStream3 = streamOfList.flatMap(listStream -> listStream.stream());
		stringStream3.forEach(System.out::println);
		System.out.println("---------------------------------------");

		//////////////////////////////////////////////////////
		// Stream terminal operations
		//////////////////////////////////////////////////////
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
		Optional<Integer> intOptional = numbers.reduce((i, j) -> {return i * j;});
		if (intOptional.isPresent())
			System.out.println("Multiplication = " + intOptional.get());
		System.out.println("---------------------------------------");

	}
}
