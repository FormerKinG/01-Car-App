package in.arc.modification;

public class DieselEngine implements IEngine {

	@Override
	public int start() {
		System.out.println("DieselEngine.start()");
		return 1;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+DieselEngine.class;
	}

}
