package pat.decorator;

public class Disc extends ComponentDecorator{
	Computer c;
	public Disc(Computer c) {
		this.c = c;
	}
	
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return c.description() + " and Disc";
	}
	
}
