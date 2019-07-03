package decorator_first;

public class Whip extends CondimentDecorator{

	public Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+ ",Whip";
	}
	public double cost(){
		return 0.57+beverage.cost();
	}

}
