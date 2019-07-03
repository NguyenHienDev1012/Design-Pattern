package decorator_first;

public class DarkRoast extends Beverage {
      public DarkRoast(){
    	  desciption="Dark Roast Coffee";
      }
	@Override
	public double cost() {
		return 1.2;
	}

}
