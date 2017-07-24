package pat.observer;

import java.util.Vector;

public class Database implements Subject {
	private Vector<Observer> observers;
	private String operation;
	private String record;
	
	public Database() {
		
		observers = new Vector<Observer>();
		
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (int loopIndex = 0; loopIndex < observers.size(); loopIndex++) {
			Observer observer = (Observer)observers.get(loopIndex);
			observer.update(operation, record);
		}
	}
	
	public void editRecord(String operation, String record){
		this.operation = operation;
		this.record = record;
		notifyObservers();
	}
}
