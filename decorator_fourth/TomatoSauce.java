package decorator_fourth;

public class TomatoSauce extends ToppingDecorator{

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Sauce");
	}

	@Override
	public String getDescription() {
		return tempPizza.getDescription()+"TomatoSauce";
	}

	@Override
	public double getCost() {
		return tempPizza.getCost()+.35;
	}
}
