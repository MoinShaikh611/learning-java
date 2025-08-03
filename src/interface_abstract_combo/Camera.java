package interface_abstract_combo;


public interface Camera {
	default void record() {
		System.out.println("Recording Video...");
	}
}
