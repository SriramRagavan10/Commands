package collections3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDup {
	public static void main(String[] args) {
		String s = "onesoft";
		char[] c = s.toCharArray();
		List<Character> cs = new ArrayList<>();
		for (int i = 0; i < c.length; i++) {
			cs.add(c[i]);
		}
		List<Character> d = cs.stream().filter(i -> Collections.frequency(cs, i) > 1).distinct()
				.collect(Collectors.toList());
		d.forEach(x -> System.out.println(x));
		Map<Character, Long> b = cs.stream().filter(i -> Collections.frequency(cs, i) >= 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		b.forEach((x, y) -> System.out.print(x + "=" + y + " "));
		System.out.println();
		Map<Character, Long> f = cs.stream().filter(i -> Collections.frequency(cs, i) == 1).distinct()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		f.forEach((x, y) -> System.out.print(x + "=" + y + " "));
		System.out.println();
		Map<Character, Long> sr = cs.stream().filter(i -> Collections.frequency(cs, i) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		sr.forEach((x, y) -> System.out.print(x + "=" + y + " "));
		System.out.println();
		List<Character> nr = cs.stream().filter(i -> Collections.frequency(cs, i) == 1).distinct()
				.collect(Collectors.toList());
		nr.forEach(x -> System.out.print(x + " "));
		System.out.println();
		List<Character> nr1 = cs.stream().filter(i -> Collections.frequency(cs, i) > 1).distinct()
				.collect(Collectors.toList());
		nr1.forEach(x -> System.out.print(x + " "));

		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
		listOfNumbers.parallelStream().forEach(number -> System.out.println(number));
	}
}
