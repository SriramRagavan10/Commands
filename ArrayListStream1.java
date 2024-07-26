package collections3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListStream1 {
	public static void main(String[] args) {
		List<String>names=new ArrayList<>();
		names.add("Arunmozhi");
		names.add("Maghizaal");
		names.add("Mozhiyaal");
		names.add("Suban");
		names.add("Rythan");
		names.stream().forEach(x-> System.out.println(x));
		System.out.println();
		names.stream().filter(s->s.startsWith("M")).forEach(a->System.out.println(a));
		System.out.println("\n");
		long a=names.stream().count();
		System.out.println(a);
		System.out.println("\n");
		List<String> name=names.stream().collect(Collectors.toList());
		name.forEach(s->System.out.println(s));
		List<String> n=names.stream().filter(s -> s.endsWith("n")).collect(Collectors.toList());
		for(String x:n) {
			System.out.println("\n"+x);
		}
		System.out.println("--");
		names.stream().filter(x->x.matches("Suban")).forEach(x->System.out.println(x));
		
//		int in = IntStream.rangeClosed(0, 4).reduce(0, (x,y) -> x+y);
//		System.out.println(in);
		
	}

}
