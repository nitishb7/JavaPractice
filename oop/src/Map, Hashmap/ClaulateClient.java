package oop;

public class ClaulateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition a=()->
		{
			int fno = 200;
			int sno = 200;
			int res = fno +sno;
			System.out.println("sum = "+ res);
		};
		
		a.add();
		
		Subst s=(f, sec)->
		{
			int result = f-sec;
			System.out.println("reault of substraction = "+ result);
		};
		s.substract(400, 200);

	}

}
