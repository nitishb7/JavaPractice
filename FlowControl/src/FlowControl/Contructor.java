package FlowControl;

public class Contructor {
	
	int i = 1000;
	int j = 400;
	static int k = 900;
	void disp(int i) {
		
		System.out.println("Before this");
		System.out.println(i +"\t"+j+"\t"+k);
		System.out.println("After this");
		System.out.println(this.i +"\t"+this.j+"\t"+this.k);
	}
	
//	public Contructor(int i) {
//		i =100;
//		System.out.println("Default value"+ i);
//	}

	public static void main(String[] args) {
		Contructor t = new Contructor();
		t.disp(10);
		
		
			
	}

}
