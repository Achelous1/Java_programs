package pat.observer;

public class Boss implements Observer {
	
	@Override
	public void update(String operation, String record) {
		// TODO Auto-generated method stub
		System.out.println("The Boss says a " + operation + " operation was performed on " + record);
	}
}
