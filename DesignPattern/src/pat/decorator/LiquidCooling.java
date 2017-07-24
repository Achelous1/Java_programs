package pat.decorator;

public class LiquidCooling extends ComponentDecorator{
	Computer c;
	public LiquidCooling(Computer c){
		this.c = c;
	}
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return c.description() + " and a Liquid cooling system";
	}
}