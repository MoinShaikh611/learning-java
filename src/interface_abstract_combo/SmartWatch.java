package interface_abstract_combo;

public class SmartWatch extends SmartDevice implements Voiceable,Camera,Microphone{
	@Override
	public void showBatteryLevel() {
		// TODO Auto-generated method stub
		System.out.println("Smart watch battery level is 75%");
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Smart watch gets on");
	}
	@Override
	public void voiceAssistant() {
		System.out.println("Smart watch can support voice assistant.");
	}
	
//	If two interfaces have same method name, the class must override it
	@Override
	public void record() {
		Camera.super.record();
		Microphone.super.record();
	}

	
}
