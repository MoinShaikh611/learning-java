package collections_framework;

import java.util.*;

public class StackEg {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		
		st.push("Lion");
		st.push("Monkey");
		st.push("tiger");
		
		System.out.println(st.peek());
		
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
	}
}
