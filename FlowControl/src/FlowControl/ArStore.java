package FlowControl;

import java.util.Scanner;

public class ArStore {

	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		final String str[]= new String[3];
		for(int i=0; i<str.length;++i) {
			System.out.println("Enter your elements: ");
			str[i] = sc.next();
			
		}
		
			System.out.println("Display array elements");
		for(final String s : str){
			System.out.println();
		}

		  }

		}
