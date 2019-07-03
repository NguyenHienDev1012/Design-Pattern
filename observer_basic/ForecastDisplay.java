package observer_basic;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer,Display{
	private float temperature;
	private float humidity;
	private float pressure;
	private Observable observable;
	public ForecastDisplay(Observable observable){
		this.observable=observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData w=(WeatherData)o;
			this.temperature=w.getTemperature();
			this.humidity=w.getHumidity();
			this.pressure=w.getPressure();
		}
		display();
		
	}

	@Override
	public void display() {
		System.out.println("Temperature: "+temperature+"\thumidity: "+humidity+"\tpressure"+pressure);
		
	}

}
