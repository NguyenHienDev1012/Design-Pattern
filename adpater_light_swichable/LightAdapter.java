package adapter_light_swichable;

public class LightAdapter implements Switchable {
	Light light;
 
	public LightAdapter(Light light){
		this.light=light;
	}
	@Override
	public void turnOn() {
		light.on();
	}
	@Override
	public void turnOff() {
		light.off();
		
	}
}
