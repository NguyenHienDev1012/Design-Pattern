package strategies;

public class MarllardDuck extends Duck {
	public MarllardDuck() {
		flybehavior=new FlyWithWings();
		quackbehavior=new Quack();

	}

	@Override
	public void display() {
		System.out.println("I'm MarllarDuck");
	}

}