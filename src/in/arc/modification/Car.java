package in.arc.modification;

public class Car {
//3rd using field injection //2&3
	private IEngine engine;
//1st scenario using constructor injection //2
	public Car(IEngine engine) {
		this.engine = engine;
	}
//2nd scenario using setter injection //1
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		int status = engine.start();
		if (status >= 1) {
			System.out.println("Car.drive() started using "+engine.toString());
		} else {
			System.out.println("Car.drive() not started");
		}
	}
}
