package PolyPack;

public class Cat implements Animal {


	@Override
	public void eat() {
		System.out.println("Cat can eat");
		
	}

	@Override
	public void run() {
		System.out.println("Cat can run");
		
	}

	@Override
	public void fly() {
		System.out.println("Cat can't fly");
		
	}

	@Override
	public void sleep() {
		System.out.println("Cat can sleep");
		
	}

}
