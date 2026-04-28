package oop;

import java.util.Arrays;
import java.util.List;

public class EmployyeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employees> empList = Arrays.asList(
				new Employees("manasa", 35000), 
				new Employees("john", 25000),
				new Employees("manasa", 15000)
 
		);
		empList.stream().filter(emp->emp.salary> 30000).map(emp->emp.name).forEach(System.out::println);

	}

}
