package FlowControl;

import java.util.Scanner;

public class ArrClassW {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[4];
        for (int i=0;i<num.length;++i){
            System.out.println("Enter the numbers");
            int number = sc.nextInt();
            num[i] = number;
        }
    }
}

