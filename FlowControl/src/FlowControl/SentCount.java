package FlowControl;

public class SentCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello world. How are you? I am fine!";
		int count = 0;
		
		for (int i= 0; i<str.length();i++) {
			char ch = str.charAt(i); 
			if(ch=='.'||ch=='?'||ch=='!') {
				count++;
			}
		}
		System.out.println("Num of characters: " + count);

	}

}
