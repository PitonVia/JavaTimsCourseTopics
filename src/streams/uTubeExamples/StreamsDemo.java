package streams.uTubeExamples;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {

	// Streams are very useful and powerful when working with collections, arrays, Strings, ints etc. 

	// Streams consist of: 

//	 	1.) Source:  					people.stream() 							 // e.g. List can be a source 
//	 	2.) Intermediate operation(s):	.filter(lambda) OR .skip() OR .sorted() 	 // they return a stream
//	 	3.) Terminal operation:			.forEach(lambda); OR .collect() OR .count(); // return void or a non-stream result 

	// For large arrays ParallelStreams can be used to enable multiple threads.
	
	public static void main(String[] args) throws IOException {
		
		// 1. Integer Stream
		IntStream
			.range(1, 10)
			.forEach(System.out::print); // using method reference
		System.out.println("\n");
		
		// 2. Integer Stream with skip
		IntStream
			.range(1, 10)
			.skip(5)  // return stream after discarding the first '5' elements of the stream
			.forEach(i -> System.out.print(i)); // using a lambda expression
		System.out.println("\n");
		
		// 3. Integer Stream with sum
		System.out.println(
		IntStream
			.range(1, 5)
			.sum()); // returns the sum of integers from 1 to 4.
		System.out.println("");
		
		// 4. StreamOf strings sorted and findFirst - finds the first sorted element
		Stream.of("Ava", "Aneri", "Alberto")
			.sorted()  // if we used objects (instead of strings), we could have implemented the Comparable with a lambda.
			.findFirst() // Returns an Optional describing the 1-st element or an empty Optional if the stream is empty.
			.ifPresent(System.out::println); 
		System.out.println();

		// 5. StreamOf string array sorted, filtered and printed
		String[] names = {"Al", "Ankit", "Kushal", "Sun", "Sunil", "Shiva", "Domir"};
		Arrays.stream(names)  // same as Stream.of(names)
			.filter(s -> s.startsWith("S")) // filtering elements starting with "S" 
			.sorted()
			.forEach(System.out::println); 
		System.out.println();

		// 6. Average of squares of an int array
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
			.map(x -> x * x) // mapping for any element to be equal to its square
			.average()
			.ifPresent(System.out::println); 
		System.out.println();
		
		// 7. Stream from List filter and print
		List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Sun", "Sunil", "Shiva", "Domir");
		people.stream()
			.map(String::toLowerCase) // same as: s -> s.toLowerCase()
			.filter(s -> s.startsWith("a"))
			.sorted()
			.forEach(System.out::println); 
		System.out.println();
		
		// 8. Stream rows from text file filter, sort and print (had to add the StandardCharsets.ISO_8859_1 param)
		Stream<String> bands = Files.lines(Paths.get("./src/streams/uTubeExamples/bands.txt"), StandardCharsets.ISO_8859_1);
		bands
			.filter(s -> s.length() > 30)
			.sorted()
			.forEach(System.out::println);
		bands.close();  // remember to close() the file
		System.out.println();
		
		// 9. Stream rows from text file and save to a list, then print the list
		List<String> bands2 = Files.lines(Paths.get("./src/streams/uTubeExamples/bands.txt"), StandardCharsets.ISO_8859_1)
			.filter(s -> s.contains("ack"))
			.sorted()
			.collect(Collectors.toList()); // adding elements to the List bands2
		
		bands2.forEach(System.out::println); // printing all elements of List bands2
		System.out.println();
		
		// 10. Stream good rows from csv file and returns their count
		// For each row, cvs values will be read, and entered into array. If row doesn't have data, it will be ignored.
		Stream<String> rows = Files.lines(Paths.get("./src/streams/uTubeExamples/data.txt"));
		int rowCount = (int) rows
			.map(s -> s.split(",")) // returns an array of Strings split by ","
			.filter(x -> x.length == 3) // picks arrays that have 3 elements (no bad rows) 
			.count(); 
		System.out.println("There are: " + rowCount + " good rows.");
		rows.close();  // remember to close() the file
		System.out.println();
		
		// 10+. Stream good rows from csv file and returns a list of arrays containing good rows
		List<String[]> rows2 = Files.lines(Paths.get("./src/streams/uTubeExamples/data.txt"))
			.map(s -> s.split(",")) // returns an array of Strings split by ","
			.filter(x -> x.length == 3) // picks arrays that have 3 elements (no bad rows)
			.collect(Collectors.toList()); // adds the arrays to the rows2 List
		
		for (String[] row : rows2) {  // iterates through the rows2 List
			Stream.of(row)
			.forEach(r -> System.out.print(r + " ")); // prints each element of String[] with spaces 
			System.out.println(); // adds a line after values of each String[] are printed
		}
		System.out.println();
		
		// 11. Stream good rows from csv file, parse data from rows and prints result
		Stream<String> rows3 = Files.lines(Paths.get("./src/streams/uTubeExamples/data.txt"));
		rows3
			.map(s -> s.split(",")) // returns an array of Strings split by ","
			.filter(x -> x.length == 3) // picks arrays that have 3 elements (no bad rows)
			.filter(x -> Integer.parseInt(x[1]) > 15) // pick 2-nd elements that are > 15 and parse them to int
			.forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
		rows3.close();  // remember to close() the file
		System.out.println();
		
		// 12. Stream good rows from csv file, parse data from rows into a HashMap and print result
		Stream<String> rows4 = Files.lines(Paths.get("./src/streams/uTubeExamples/data.txt"));
		Map<String, Integer> map = new HashMap<>();
		map = rows4
			.map(s -> s.split(",")) // returns an array of Strings split by ","
			.filter(x -> x.length == 3) // picks arrays that have 3 elements (no bad rows)
			.filter(x -> Integer.parseInt(x[1]) > 15) // pick 2-nd elements that are > 15 and parse them to int
			.collect(Collectors.toMap(
					x -> x[0],  // 1-st element is parsed to key
					x -> Integer.parseInt(x[1]))); // 2-nd element is parsed to value 
		rows4.close();  // remember to close() the file
		
		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
		System.out.println();
		
		// 13. Reduction - summary statistics (work only with Integers)
		// Returns count, sum, min, average and max of the stream of Integers. 
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
			.summaryStatistics();
		System.out.println(summary + "\n");
					
	}
}
