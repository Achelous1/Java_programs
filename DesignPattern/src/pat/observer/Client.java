package pat.observer;

public class Client implements Observer {
	
	public Client() {
		
	}
	
	@Override
	public void update(String operation, String record) {
		// TODO Auto-generated method stub
		System.out.println("The client says a " + operation + " operation was performed on " + record);
	}
	
}
