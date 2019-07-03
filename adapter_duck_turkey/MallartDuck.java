package adapter_duck_turkey;

public class MallartDuck implements Duck{

	@Override
	public void quack() {
		System.out.println("Quack quack");
		
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

}
