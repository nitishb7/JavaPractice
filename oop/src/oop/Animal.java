package oop;

class calculator {
	void sound() {
		System.out.println("Aniamal is making sound");
	}
	
}
class dog extends calculator{
	void sound() {
		System.out.println("dog is making sound");
	}
}
public class Animal{
	public static void main (String[] args) {
		dog a = new dog();
		a.sound();
	}
}
