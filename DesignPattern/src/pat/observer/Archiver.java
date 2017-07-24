package pat.observer;

public class Archiver implements Observer {

	@Override
	public void update(String operation, String record) {
		// TODO Auto-generated method stub
		System.out.println("The archiver says a " + operation + " operation was performed on " + record);
	}
	
}
