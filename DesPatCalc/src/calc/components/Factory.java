package calc.components;

public class Factory {
	protected String type;
	
	public Factory(String t) {
		type = t;
	}
	
	public Calculation createCalculation(String type) throws ArithmeticException, Exception {
		
		if(type == "+")
				return new AddCalculation();
		else if(type == "-")
				return new SubCalculation();
		else if(type == "*" || type == "x" || type == "X")
				return new MultCalculation();
		else if(type == "/")
				return new DivCalculation();
		else 
			throw new Exception("not a valid formula");
		
	}
	
}