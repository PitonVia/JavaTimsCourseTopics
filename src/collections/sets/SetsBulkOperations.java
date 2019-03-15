package collections.sets;

import java.util.*;

public class SetsBulkOperations {

	public static void main(String[] args) {
		
		// Creating 2 HashSets that will be holding squares and cubes of values from 1 to 100
		// We want to perform balk operations on the elements of these sets such as:
		
		// 1. UNION - keep all unique values from both sets: set1.addAll(set2)
		// 2. INTERSECTION - keep only unique values that are present in both sets: set1.retainAll(set2)
		// 3. ASYMMETRIC DIFFERENCE: 
			// a) keep all elements of set1 that are not elements of set2: set1.removeAll(set2);
			// b) keep all elements of set2 that are not elements of set1: set2.removeAll(set1) - hence asymmetric
		// 4. SYMMETRIC DIFFERENCE - remove intersection elements from union. 
		// 5. containsAll() - boolean method to check if is set1 is a superset of set2:  set1.containsAll(set2);
		
		Set<Integer> squares = new HashSet<>();
		Set<Integer> cubes = new HashSet<>();
		
		for (int i=1; i<=100; i++) {
			squares.add(i * i);
			cubes.add(i * i * i);
		}

		// Confirming the total number of squares and cubes elements
		System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes");
		System.out.println();
		
		// 1. - Performing Union operation  - everything from both sets without duplicates.
		
		// Because bulk operations are destructive to the original sets, 
		// First, we will create a new HashSet called union, which will contain all the element from the squares set. 
		// Note - nearly all collections have a 2-nd constructor that can take another collection of elements and populate 
		// the newly declared collection with those elements!!!
		// The 1-st empty constructor allows to create an empty collection.
		Set<Integer> union = new HashSet<>(squares);
		union.addAll(cubes);
		System.out.println("Union contains " + union.size() + " elements");
		System.out.println();
		
		
		// 2. - Performing INTERSECTION operation  - only values that are present in both sets
		Set<Integer> intersection = new HashSet<>(squares);
		intersection.retainAll(cubes);
		System.out.println("UIntersection contains " + intersection.size() + " elements");
		// calculating and retrieving intersecting values:
        for (int i : intersection) {
            System.out.println(i + " is the sqr root of " + Math.sqrt(i) +
                    " and the cube of " + Math.cbrt(i));
        }
		System.out.println();
		
		
		// Example of creating a new set of words with an empty constructor and using asList method
		Set<String> words = new HashSet<>();
        
		String sentence = "one day in the year of the fox";
        
		// Creating a String array that will contain words of sentence split by spaces:
        String[] arrayWords = sentence.split(" ");
        
        // Appending all array elements into the words HashSet and
        // '.asList()' returns array contents in the list format:
        words.addAll(Arrays.asList(arrayWords));
       
        // Printing the contents of the words HashSet
        for (String i : words) {
            System.out.println(i);
        }
        System.out.println();
		
        
        // 3. ASYMMETRIC DIFFERENCE
		
     	// We will use smaller sets of words to reduce processing times
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        // What is the result of asymm diff of setNature from setDivine:
        System.out.println("nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        // Removing all elements of divine Set from diff1 set containing nature elements:
        diff1.removeAll(divine);
        printSet(diff1);
        System.out.println();

        // What is the result of asymm diff of setDivine from setNature:
        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        // Removing all elements of nature Set from diff2 set containing divine elements:
        diff2.removeAll(nature);
        printSet(diff2);
        System.out.println();
		
        
		// 4. SYMMETRIC DIFFERENCE - removing intersection from union
        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        // removes from nature Set all of its elements that are not contained in the
        // divine Set. Only the intersecting elements of the 2 Sets will remain.
        intersectionTest.retainAll(divine);

        System.out.println("symmetric difference");
        // from all elements from both Sets, remove intersecting elements:
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        System.out.println();
        
        // 5. containsAll() - boolean method to test if one set is a superset of another
        // .containsAll() is a non-destructive method as it tests sets
        // and returns boolean of the result.
        if (nature.containsAll(divine)) {
            System.out.println("divine is a subset of nature");
        } else {
            System.out.println("divine is not a subset of nature");
        }

        if (nature.containsAll(intersectionTest)) {
        System.out.println("intersectionTest is a subset of nature");
        }
	}

	// Generic method to print any set
	private static void printSet(Set<String> set) {
		
		for (String element : set) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
