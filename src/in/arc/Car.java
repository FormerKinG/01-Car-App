package in.arc;
//1st scenario using IS-A relation i.e., inheritance
public class Car {//extends Engine {
	
	public void drive() {
		//1st scenario
		
//		int status = super.start();
		//2nd Scenario Composition
		Engine engine= new Engine();
		int status = engine.start();
		if(status>=1) {
			System.out.println("Engine Started");
		}else {
			System.out.println("Engine Not Started");
		}
		
		
	}

}
