package decorator_first;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Soy";
	}

	public double cost() {
		return 0.16+beverage.cost();

	}
}
