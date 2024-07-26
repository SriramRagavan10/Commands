package collections3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamRev {
	public static void main(String[] args) {
		
		// Reverse String
		String a = "Sriram Raji";
		IntStream.iterate(a.length() - 1, i -> i >= 0, i -> i - 1).forEach(x -> a.charAt(x));
		Stream.of(a).map(x -> new StringBuffer(x).reverse()).forEach(x -> System.out.println(x));

		// Common Integers
		int com1[] = { 1, 2, 3, 4 };
		int com2[] = { 5, 4, 3, 6 };
		Stream.concat(Arrays.stream(com1).boxed(), Arrays.stream(com2).boxed())
				.collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).forEach(x->System.out.println(x.getKey()));
//		System.out.println(common);
//		List<Integer> co=common.keySet().stream().filter(x->common.get(x)>1).collect(Collectors.toList());
//		System.out.println(co);

		// Merge two array and sort
		int[] num = Stream.concat(Arrays.stream(com1).boxed(), Arrays.stream(com2).boxed()).mapToInt(Integer::intValue)
				.sorted().toArray();
		System.out.println(Arrays.toString(num));

		// Anagram
		String s1 = "Dog";
		String s2 = "God";

		String s3 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		String s4 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		boolean areAnagrams = s3.equals(s4);

		System.out.println("Are the strings anagrams? " + areAnagrams);

		// Palindrome
		String pal = "madam";
		System.out.println(pal.charAt(2));
		System.out.println(pal.charAt(pal.length() - 2 - 1));
		boolean boo = IntStream.range(0, pal.length() / 2)
				.noneMatch(i -> pal.charAt(i) != pal.charAt(pal.length() - i - 1));
		System.out.println(boo);

		// Odd and Even Num
		List<Integer> in = Arrays.asList(23, 16, 76, 77, 99, 66);
		Map<Boolean, List<Integer>> partitioned = in.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
		System.out.println(partitioned);
		// Get the even numbers
		List<Integer> evenNumbers = partitioned.get(true);
		// Get the odd numbers
		List<Integer> oddNumbers = partitioned.get(false);

		System.out.println("Even numbers: " + evenNumbers);
		System.out.println("Odd numbers: " + oddNumbers);

		// Character 
		String inputString = "Java Concept Of The Day";

		Map<Character, Long> charCountMap = inputString.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(charCountMap);

		int[] a1 = { 1, 5, 6, 8, 9, 5 };
		int[] b1 = { 6, 9, 3, 4 };

		List<Integer> a2 = Arrays.stream(a1).boxed().collect(Collectors.toList());
		List<Integer> b2 = Arrays.stream(b1).boxed().collect(Collectors.toList());

		// Find common elements in both arrays
		a2.stream().filter(b2::contains).forEach(System.out::println);
		
		// Max
		System.out.println(a2.stream().sorted(Comparator.reverseOrder()).findFirst().get());
		
		// Second Max
		System.out.println(a2.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
		
		// Third Max
		System.out.println(a2.stream().sorted(Comparator.reverseOrder()).limit(3).skip(2).collect(Collectors.toList()));
		
		int [] nu = {10, 20, 30, 40};
		
		// Factorial
		int fact=IntStream.rangeClosed(1, 5).reduce(1,(x,y)->x*y);
		System.out.println(fact);
		
		// Final List
		final List<String> re=new ArrayList<>();
		re.add("Sri");
		System.out.println(re);
		
	}

}
