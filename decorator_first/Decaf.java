package decorator_first;

public class Decaf extends Beverage {
	public Decaf() {
		desciption = "Decaf Coffee";
	}

	@Override
	public double cost() {
		return 1.4;
	}

}
