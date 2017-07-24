package pat.decorator;

public class Monitor extends ComponentDecorator{
	Computer c;
	public Monitor(Computer c) {
		this.c = c;
	}
	
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return c.description() + " and a Monitor";
	}
}