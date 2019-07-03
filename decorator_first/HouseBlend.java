package decorator_first;

public class HouseBlend  extends Beverage{
     public HouseBlend(){
    	 desciption="HouseBlend Coffee";
     }
	@Override
	public double cost() {
		return 1.6;
	}

}
