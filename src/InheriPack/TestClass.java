package InheriPack;

public class TestClass {

	public static void main(String[] args) {
		Car c=new Car();
		int TotalSeat=c.NofSeat;
		System.out.println("Total Seat  "+TotalSeat);
		
		PoliceCar pc=new PoliceCar();
		int TotalDoor=pc.NoofDoor;
		System.out.println("Total Door  "+TotalDoor);
		pc.FlashLight();
		
		RacingCar rc=new RacingCar();
		rc.Stop();
		rc.Turbo();
		
		SmartCar sc=new SmartCar();
		sc.nogas();

	}

}
