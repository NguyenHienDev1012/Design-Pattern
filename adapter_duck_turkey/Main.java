package adapter_duck_turkey;

public class Main {
	public static void main(String[] args) {
		Duck malart=new MallartDuck();
		malart.quack();
		malart.fly();
		
		Turkey wildturkey=new WildTurkey();
		wildturkey.gobble();
		wildturkey.fly();
		
		TurkeyAdapter turkeyAdapter=new TurkeyAdapter(wildturkey);
		turkeyAdapter.quack();
		turkeyAdapter.fly();
		
		DuckAdapter duckAdapter=new DuckAdapter(malart);
		duckAdapter.gobble();
		duckAdapter.fly();
		
	}

}
