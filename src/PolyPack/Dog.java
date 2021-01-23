package PolyPack;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Dog eats meat");
		
	}

	@Override
	public void run() {
		System.out.println("Dog can run");
		
	}

	@Override
	public void fly() {
		System.out.println("Dog can't fly");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

}
