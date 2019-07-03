package observer_clock;

public class Main {
	public static void main(String[] args) {
		MyClockComputer cmp = new MyClockComputer();
		Clock main = new Clock(cmp);

	}
}
