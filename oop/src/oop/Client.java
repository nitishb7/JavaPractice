package oop;

class person{
	void role() {
		System.out.println("Person has a role");
	}
}

class Student extends person{
	void role() {
		System.out.println("Person is a Student");
	}
}

class Employee extends person{
	void role() {
		System.out.println("Person is a employee");
	}
}
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p = new Student();
		person e = new Employee();
		p.role();
		e.role();

	}

}
