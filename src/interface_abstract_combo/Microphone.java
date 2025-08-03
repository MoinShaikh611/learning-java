package interface_abstract_combo;

public interface Microphone {
	default void record() {
		System.out.println("Recording Audio...");
	}
}
