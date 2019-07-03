package decorator_first;

public class Test {
	public static void main(String[] args) {
		Beverage darkRoast = new DarkRoast();
		System.out.println(darkRoast.getDescription());

		Milk milkDarkRoast = new Milk(darkRoast);
		System.out.println(milkDarkRoast.getDescription()
				+ milkDarkRoast.cost());

		Beverage milkSoyWhip = new Milk(new Soy(darkRoast));

		System.out.println(milkSoyWhip.getDescription() + milkSoyWhip.cost());

	}

}
