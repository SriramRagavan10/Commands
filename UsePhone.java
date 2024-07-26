package collections3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsePhone {
	public static void main(String[] args) {
		Phone phone1=new Phone("OnePlus", 40000, "Blue", 7.7f, 2022);
		Phone phone2=new Phone("Redmi", 20000, "Gray", 7.6f, 2021);
		Phone phone3=new Phone("OnePlus", 48000, "Blue", 8.8f, 2021);
		Phone phone4=new Phone("Vivo", 25000, "Red", 3.7f, 2019);
		Phone phone5=new Phone("Apple", 96000, "White", 9.0f, 2021);
//		List<Phone>phones=new ArrayList<>();
//		phones.add(phone1);
//		phones.add(phone2);
//		phones.add(phone3);
//		phones.add(phone4);
//		phones.add(phone5);
		List<Phone>phones=Arrays.asList(phone1, phone2, phone3, phone4, phone5);
		phones.stream().forEach(x->System.out.println(x));//Normal Output
		System.out.println();
		
		phones.stream().filter(x->x.getPrice()>30000 && x.getPrice()<60000).forEach(s->System.out.println(s));//Filter Output
		Long c=phones.stream().filter(s->s.getColor().equals("Blue")).count();// count with filter output
		System.out.println("\n"+c+"\n");
		
		List<Phone>p=phones.stream().filter(s->s.getRating()>5.0f).collect(Collectors.toList());
		p.forEach(x->System.out.println(x));//Filter with Collect Output
		System.out.println();
		
		List<String>brands=phones.stream().map(x->x.getBrand()).collect(Collectors.toList());
		System.out.println(brands);//map Output
		System.out.println();
		
		List<Float>rat=phones.stream().filter(s->s.getPrice()<30000).map(x->x.getRating()).collect(Collectors.toList());
		rat.forEach(x->System.out.println(x));
		System.out.println(rat+"\n");// Map with Filter Output
		
		List<Phone>det=phones.stream().filter(n->n.getEditionYear()>2020).map(r->{
			r.setPrice(r.getPrice()+2000);
			return r;
			}).collect(Collectors.toList());
		for(Phone d:det) {
			System.out.println(d);// Map with Set method Output
		}
		
		//Peek method
		System.out.println();
		List<Phone>o=phones.stream().filter(x->x.getPrice()>50000).peek(x->x.setBrand(x.getBrand().toUpperCase())).collect(Collectors.toList());
		o.forEach(s->System.out.println(s));
		System.out.println();
		
		//Aescending
		List<Phone>sr=phones.stream().sorted(Comparator.comparing(Phone::getPrice)).collect(Collectors.toList());
		sr.forEach(r->System.out.println(r));
		System.out.println();
		
		//Descending
		List<Phone>srl=phones.stream().sorted(Comparator.comparing(Phone::getRating).reversed()).collect(Collectors.toList());
		srl.forEach(r->System.out.println(r));
		System.out.println();
		
		//Find Minimum
		System.out.println(phones.stream().min(Comparator.comparing(Phone::getEditionYear)).get()+"\n");
		
		//Find Maximum
		System.out.println(phones.stream().max(Comparator.comparing(Phone::getRating)).get());
		System.out.println();
		
		//
		List<Phone>lim=phones.stream().limit(2).collect(Collectors.toList());
		lim.forEach(x->System.out.println(x));
		System.out.println();
		
		//
		List<Phone>skip=phones.stream().skip(2).collect(Collectors.toList());
		skip.forEach(sk->System.out.println(sk));
		System.out.println();
		
		//
		List<String>dup=phones.stream().map(x->x.getBrand()).distinct().collect(Collectors.toList());
		dup.forEach(du->System.out.println(du));
		System.out.println();
		
		//
		List<Integer>dup1=phones.stream().map(x->x.getEditionYear()).distinct().collect(Collectors.toList());
		dup1.forEach(du->System.out.println(du));
		System.out.println();
		
		int total=phones.stream().collect(Collectors.summingInt(Phone::getPrice));
		System.out.println(total);
		System.out.println();
		
		Map<Integer,List<Phone>> grp=phones.stream().collect(Collectors.groupingBy(Phone::getEditionYear));
		grp.forEach((x,y)->System.out.println(x+"="+y));
		System.out.println();
		grp.values().stream().forEach(x->System.out.println(x));
		
		System.out.println();
		List<Phone> p1=phones.stream().limit(2).toList();
		p1.forEach(x->System.out.println(x));
		System.out.println(p1.size());
		
		List<String>brand=phones.stream().map(x->x.getBrand()).filter(x->x.startsWith("O")).toList();
		System.out.println(brand);//map Output
		System.out.println();
	}
	
}
