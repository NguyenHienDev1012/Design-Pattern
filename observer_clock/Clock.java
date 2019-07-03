package observer_clock;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Clock extends MyFrame implements Observer {
	private String time;
	JLabel label;
	JPanel p;
	Observable oservable;
	
	
	public Clock(Observable observable){
		this.oservable=observable;
		observable.addObserver(this);
		setTitle("Clock Observer");
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof MyClockComputer) {
			MyClockComputer clockcmp=(MyClockComputer)o;
			time=clockcmp.getTime();
			label=new JLabel();
			label.setFont(new Font("Arial", Font.ITALIC, 25));
			p=new JPanel();
			p.setBackground(Color.LIGHT_GRAY);
			p.add(label);
			add(p,BorderLayout.CENTER);
			label.setText(time);
			
			

		}
	}

}
