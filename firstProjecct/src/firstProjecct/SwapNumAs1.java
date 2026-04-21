package firstProjecct;

public class SwapNumAs1 {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("value after swapping: "+a+"\t"+b);
	}

}
