package strategies;

public abstract class Duck {
	FlyBehavior flybehavior;
	QuackBehavior quackbehavior;
	
	public void performFly(){
		flybehavior.fly();
		
	}
	public void performQuack(){
		quackbehavior.quack();
		
	}
	public void swim(){
		
	}
	public abstract void display();
	public FlyBehavior getFlybehavior() {
		return flybehavior;
	}
	public void setFlybehavior(FlyBehavior flybehavior) {
		this.flybehavior = flybehavior;
	}
	public QuackBehavior getQuackbehavior() {
		return quackbehavior;
	}
	public void setQuackbehavior(QuackBehavior quackbehavior) {
		this.quackbehavior = quackbehavior;
	}
	public static void main(String[] args) {
		Duck mar=new MarllardDuck();
		mar.display();
		mar.performFly();
		mar.performQuack();
		
		Duck decoy=new DecoyDuck();
		decoy.display();
		decoy.performFly();
		decoy.performQuack();
		
		
	}
	
}
