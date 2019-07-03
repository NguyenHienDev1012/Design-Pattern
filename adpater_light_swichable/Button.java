package adapter_light_swichable;

public class Button {
	Switchable switchAble;
	public Button(Switchable switchAble){
		this.switchAble=switchAble;
	}

	public void pressOn(){
		switchAble.turnOn();
	}
	public void pressOff(){
		switchAble.turnOff();
	}
	
}
