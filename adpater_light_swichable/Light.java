package adapter_light_swichable;

public class Light {
	public boolean on;
	public void on(){
		System.out.println("DEN SANG");
		on=true;
	}
   
	public void off(){
		System.out.println("DEN TAT");
		on=false;
	}
}
