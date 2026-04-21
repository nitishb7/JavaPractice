package firstProjecct;

import java.util.Scanner;

public class ClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter 1st number: ");
//		int a = sc.nextInt();
//		System.out.print("Enter 2nd number: ");
//		int b = sc.nextInt();
//		
//		int addit = a + b;
//		int subs = a - b;
//		int mul = a * b;
//		int div = a / b;
//		int mod = a % b;
//		
//		System.out.println("Addition: "+addit);
//		System.out.println("Substraction: "+subs);
//		System.out.println("multiplication: "+mul);
//		System.out.println("division: "+div);
//		System.out.println("reminder: "+mod);
		
		
		//2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int a = sc.nextInt();
		int b = a++;
//		int c = ++a;
//		int d = a--;
//		int e = --a;		
//		
		System.out.println("post increment: "+ b + ", " + a);
//		System.out.println("pre-increment: "+ c + ", " + a);
//		System.out.println("post decrement: "+ d);
//		System.out.println("pre-increment: "+ e);
		
	}

}
