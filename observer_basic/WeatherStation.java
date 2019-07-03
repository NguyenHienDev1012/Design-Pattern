package observer_basic;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		ForecastDisplay forecast=new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(10f, 10f, 10f);
		
	}
}
