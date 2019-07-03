package strategies;

public class DecoyDuck extends Duck {
	public DecoyDuck(){
		flybehavior=new FlyRocketPower();
		quackbehavior=new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("I am DecoyDuck");
	}

}
