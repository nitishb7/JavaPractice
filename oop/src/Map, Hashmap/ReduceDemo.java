package oop;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		int sum = list1.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}

}
