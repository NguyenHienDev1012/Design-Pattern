package decorator_first;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+",Mocha";
	}
	public double cost(){
		return 0.15+beverage.cost();
	}

}
