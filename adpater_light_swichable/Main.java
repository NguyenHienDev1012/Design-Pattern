package adapter_light_swichable;

public class Main {
	public static void main(String[] args) {
		
		Light light=new Light();
		LightAdapter a=new LightAdapter(light);
		Button b=new Button(a);
		b.pressOn();
		b.pressOff();
		
		
	}

}
