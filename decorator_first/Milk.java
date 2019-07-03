package decorator_first;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+",Milk";
	}
	
	public double cost(){
		return 1+beverage.cost();
	}

}
