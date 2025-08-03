package interface_abstract_combo;
	
//	Java 8 feature
@FunctionalInterface
public interface CustomFunctionalInterface extends Camera{
	void functionalInterfaceMethod();
	
//	if we try to add more abstract method here, it will throw a compilation error
	
//	But we can have default, static, and method inherited from other classes
	default void getDefaultFunctional() {
		
	}
	
	static void getStaticFunctional() {
		
	}
	
	@Override
	default void record() {
		// TODO Auto-generated method stub
		Camera.super.record();
	}
}
