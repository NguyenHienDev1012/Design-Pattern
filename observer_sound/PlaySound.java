package observer_sound;

import java.util.Observable;
import java.util.Observer;

public class PlaySound implements Observer {
	private Observable observable;
	private float volume = 0f;

	public PlaySound(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);

	}

	@Override
	public void update(Observable o, Object arg) {
     if(o instanceof ControlSound)	{
    	 ControlSound controlSound=(ControlSound)o;
    	 volume=controlSound.getVolume();
    	 ControlSound.gainControl.setValue(volume);
    	 System.out.println(volume);
     }
	}
	

}
