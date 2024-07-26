package collections3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Hp", 68000, "Silver", 16, "Windows 11", 56);
		Laptop l2 = new Laptop("Dell", 68000, "Black", 8, "Windows 11", 44);
		Laptop l3 = new Laptop("Lenovo", 48000, "Blue", 8, "Windows 11", 76);
		Laptop l4 = new Laptop("Asus", 55000, "Rose", 16, "Windows 9", 88);
		Laptop l5 = new Laptop("Mac", 100000, "White", 8, "Apple", 10);
		Map<Integer, Laptop> laptops = new HashMap<>();
		laptops.put(l1.getModel(), l1);
		laptops.put(l2.getModel(), l2);
		laptops.put(l3.getModel(), l3);
		laptops.put(l4.getModel(), l4);
		laptops.put(l5.getModel(), l5);
		laptops.entrySet().stream().forEach(x->System.out.println(x.getKey()));
		laptops.values().stream().forEach(x -> System.out.println(x));
		System.out.println("\n" + "-" + "\n");

		List<Laptop> l = laptops.keySet().stream().filter(x -> x > 50).map(x -> laptops.get(x))
				.collect(Collectors.toList());
		l.stream().forEach(x -> System.out.println(x));
		System.out.println("\n" + "--" + "\n");

		List<Laptop> lap = laptops.values().stream().filter(x -> x.getOs().equals("Windows 11")).map(s -> s)
				.collect(Collectors.toList());
		lap.forEach(c -> System.out.println(c));
		System.out.println("\n" + "---" + "\n");

		Long lo = laptops.entrySet().stream().filter(x -> x.getValue().getPrice() > 60000).count();
		System.out.println(lo);
		System.out.println("\n" + "----" + "\n");

		List<Laptop> top = laptops.values().stream().peek(x -> x.setColor(x.getColor().toUpperCase()))
				.collect(Collectors.toList());
		top.forEach(x -> System.out.println(x));
		System.out.println("\n" + "-----" + "\n");

		Laptop e = laptops.values().stream().min(Comparator.comparing(Laptop::getPrice)).get();
		System.out.println(e);
		System.out.println("\n" + "------" + "\n");

		System.out.println(laptops.values().stream().max(Comparator.comparing(Laptop::getRam)).get());
		System.out.println("\n" + "-------" + "\n");

		List<String> p = laptops.values().stream().sorted(Comparator.comparing(Laptop::getBrand))
				.map(x -> x.getBrand() + "-" + x.getPrice()).collect(Collectors.toList());
		p.forEach(x -> System.out.println(x));
		System.out.println("\n" + "--------" + "\n");

		List<Integer> sr = laptops.values().stream().map(x -> x.getPrice()).distinct().collect(Collectors.toList());
		sr.forEach(x -> System.out.println(x));
		System.out.println("\n" + "---------" + "\n");

		Map<Integer, Laptop> nr = laptops.keySet().stream().collect(Collectors.toMap(k -> k, y -> laptops.get(y)));
		nr.forEach((x, y) -> System.out.println(x + "=" + y));
		System.out.println("\n" + "----------" + "\n");

		List<Map.Entry<Integer, Laptop>> ml = laptops.entrySet().stream().collect(Collectors.toList());
		ml.forEach(x -> System.out.println(x.getKey()));
		System.out.println("\n" + "-----------" + "\n");

		Map<Integer, Laptop> rp = laptops.entrySet().stream().sorted(Comparator.comparing(x -> x.getValue().getPrice()))
				.collect(Collectors.toMap(x -> x.getKey(), y -> y.getValue()));

		rp.forEach((x, y) -> System.out.println(x + " - " + y));
		System.out.println("\n" + "--------------" + "\n");
		System.out.println(rp);

	}

}
