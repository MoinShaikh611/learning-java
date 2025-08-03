package interface_abstract_combo;

public class SmartPhone extends SmartDevice {
	@Override
	public void showBatteryLevel() {
		// TODO Auto-generated method stub
		System.out.println("Smart phone battery level is 25%");
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Smart phone gets on!");
	}
}
