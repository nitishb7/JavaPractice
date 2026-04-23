package oop;



interface Payment1
{
	void pay(double amt);
	default void transactionInfo(double amt) {
		validate(amt);
		System.out.println("Transaction of the amount "+amt);
		
	}
	private void validate(double amt) {
		if(amt<0) {
			throw new IllegalArgumentException("Invaid Amount");
		}
		System.out.println("Amount validated successfully");
	}
}

class CreditCard implements Payment1{ 
	@Override
	public void pay(double amt) {
		System.out.println("Amount paid through Credit card: "+ amt);
	}
	
	
	
	
	
}
 
class Khalti implements Payment1{
	@Override
	public void pay(double amt) {
		System.out.println("Amount paid through Khalti: "+ amt);
	}
}
//	void pay(double amount);
//	default void transactionInfo(double amount)
//	{
//		validate(amount);
//		System.out.println("Transaction of amount"+amount);
//	}
//	
//	private void validate(double amount)
//	{
//		if(amount<=0)
//		{
//			throw new IllegalArgumentException("Invlaid Amount");
//		}
//		System.out.println("Amount validated successfullly");
//	}
//}
//class CrediCard implements Payment1
//{
// 
//	@Override
//	public void pay(double amount) {
//		// TODO Auto-generated method stub
//		System.out.println("Paid using Credit card"+amount);
// 
//	}
//	
//}
//class UPI implements Payment1
//{
//	@Override
//	public void pay(double amount) {
//		// TODO Auto-generated method stub
//		System.out.println("Paid using UPI card"+amount);
// 
//	}
//}
	
	
public class PaymentEx {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Khalti k = new Khalti();
		CreditCard cr = new CreditCard();
		k.transactionInfo(10000);
		k.pay(5000);
	}
 
}
 
