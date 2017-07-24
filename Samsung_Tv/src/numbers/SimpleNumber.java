package numbers;

public class SimpleNumber {
	int num;
	
	public SimpleNumber(int a){
		
	}
	
	public int hashCode() {
		
		return num%3;
		
	}
	
	public boolean equals(Object obj){
		SimpleNumber comp = (SimpleNumber)obj;
		
		if(comp.num == num){
			
			return true;
			
		} else
			
			return false;
	}
}
