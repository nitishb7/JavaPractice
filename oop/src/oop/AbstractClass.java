package oop;


abstract class Bank{
	abstract int getRateOfInterest();
}

class chase extends Bank{
	@Override
	int getRateOfInterest() {
		return 6;
	}
}

class Axis extends Bank{
	
	System.out.println("Receipt");
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
