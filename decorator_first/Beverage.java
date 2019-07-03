package decorator_first;

public abstract class Beverage {
	public String desciption ;
	public String getDescription(){
		return desciption;
	}

	public abstract double cost();
	
}
