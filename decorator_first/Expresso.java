package decorator_first;

public class Expresso extends Beverage {
	public Expresso(){
		desciption="Expresso Coffee";
	}

	@Override
	public double cost() {
		return 1.5;
	}

}
