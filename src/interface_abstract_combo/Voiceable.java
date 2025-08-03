package interface_abstract_combo;

public interface Voiceable {
	void voiceAssistant();
	
	static void staticVoiceAssistant(){
		System.out.println("Smart watch can support static voice assistant.");
	}
	
	default void defaultVoiceAssistant() {
		System.out.println("Siri is default voice assistant");
	}
	
	
}
