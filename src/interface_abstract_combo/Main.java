package interface_abstract_combo;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartDevice smartPhone = new SmartPhone();
		SmartWatch smartWatch = new SmartWatch();
		
		smartPhone.turnOn();
		smartWatch.showBatteryLevel();
		smartWatch.voiceAssistant();
		
//		Interface default and static
//		You cannot override static methods — they're not polymorphic.

		Voiceable.staticVoiceAssistant();
		smartWatch.defaultVoiceAssistant();
		
		smartWatch.record();
	}

}
