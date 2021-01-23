package PolyPack;

public class Bird implements Animal{

	@Override
	public void eat() {
		System.out.println("Bird eats corn.");
		
	}

	@Override
	public void run() {
		System.out.println("Birds can't run");
		
	}

	@Override
	public void fly() {
		System.out.println("Birds can fly");
		
	}

	@Override
	public void sleep() {
		
		
	}

}
