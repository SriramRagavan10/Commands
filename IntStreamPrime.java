package collections3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamPrime {
	public static void main(String[] args) {
		int n = 44;
		boolean a = IntStream.range(2, n).noneMatch(x -> (n % x == 0));
		System.out.println(a);
		List<Integer> n1 = Arrays.asList(22, 47, 59, 43);

		List<Integer> primeNumbers = n1.stream().filter(
				num -> num > 1 && IntStream.rangeClosed(2, (int) num / 2).noneMatch(x -> num % x == 0))
				.collect(Collectors.toList());

		System.out.println("Prime numbers: " + primeNumbers);

	}

}
