package decorator_fourth;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Dough");
		System.out.println("Adding moz");
	}

	@Override
	public String getDescription() {
		return tempPizza.getDescription()+"Mozzarella";
	}

	@Override
	public double getCost() {
		return tempPizza.getCost()+0.50;
	}

}
