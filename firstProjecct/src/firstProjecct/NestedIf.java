package firstProjecct;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter age: ");
int age = sc.nextInt();
if(age >=21) {
	Scanner sc2 = new Scanner(System.in);
	System.out.print("Enter weight: ");
	int wei = sc2.nextInt();
	if(wei>=54) {
		System.out.print("You are eligable fopr blood donation");

	}else {
		System.out.print("you are not eligable ");

	}
	
}else {
	System.out.print("You are underaged ");

}
	}

}
