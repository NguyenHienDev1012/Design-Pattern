package observer_clock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import java.util.Observable;

import javax.swing.Timer;

public class MyClockComputer extends Observable {
	private String time;
	private Timer timer;
	public MyClockComputer() {
		startClock();

	}
	public void startClock() {
		if (timer == null) {
			timer = new Timer(1000, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					setChanged();
					notifyObservers();
				}
			});
			timer.setInitialDelay(0);
			timer.start();
		}
	}

	public String getTime() {
		String time = "";

		GregorianCalendar calendario = new GregorianCalendar();
		int h = calendario.get(GregorianCalendar.HOUR_OF_DAY);
		int m = calendario.get(GregorianCalendar.MINUTE);
		int s = calendario.get(GregorianCalendar.SECOND);
		time += ((h < 10) ? "0" : "") + h + ":"+((m < 10) ? "0" : "") + m + ":";
		//time += ((m < 10) ? "0" : "") + m + ":";
		time += ((s < 10) ? "0" : "") + s;

		return time;
	}

}
