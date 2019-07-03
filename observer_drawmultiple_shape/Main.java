package observer_drawmultiple_shape;

public class Main {
	public static void main(String[] args) {
		UserChange u=new UserChange();
		LineView line=new LineView(u.s);
		OvalView oval=new OvalView(u.s);
		RectangleView rec=new RectangleView(u.s);
		//u.s.setMeasurements(10, 30, 100, 110);

	}

}
