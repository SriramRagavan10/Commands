package collections3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {
	public static void main(String[] args) {
		List<Integer> in = Arrays.asList(1, 2, 3, 4, 5);
//		in.add(7);
		in.set(1,10);
		System.out.println(in);
		List<Integer> out = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
		out.add(11);
		out.add(6, 12);
		System.out.println(out);
		out.forEach(x->System.out.println(x));
	}

}
