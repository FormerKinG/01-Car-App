package in.arc.modification;

public class PetrolEngine implements IEngine {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+PetrolEngine.class ;
	}
	@Override
	public int start() {
		System.out.println("PetrolEngine.start()");
		return 1;
	}

}
