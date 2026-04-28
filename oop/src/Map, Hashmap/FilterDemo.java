package oop;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Predicate;

public class FilterDemo {

	public static void main(String[] args) {
		// consumer, predicate
//		Consumer<String> c = name -> System.out.println("Welcome: "+ name);
//		c.accept("Nitish");
//		
//		Predicate<Integer> p = el -> el%2==0;
//		System.out.println(p.test(10));
		
		//Filter
		List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
        list.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);

        List<String> name = Arrays.asList("Raja", "Ram", "Nitish", "Baidya", "Rita", "Safalta");
        name.stream()
            .filter(n -> n.startsWith("R"))
            .forEach(System.out::print);
        
        //Map
        List<String> name1 = Arrays.asList("Raja", "Ram", "Nitish", "Baidya", "Rita", "Safalta");
        name1.stream()
        .map(n -> n.toUpperCase())
        .forEach(System.out::println);
    
        
    }
}