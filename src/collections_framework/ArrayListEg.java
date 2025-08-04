package collections_framework;

import java.util.*;

public class ArrayListEg {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.remove(Integer.valueOf(3));
		
		System.out.println(list.contains(2));

		for(Integer l: list) {
			System.out.println(l);
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		System.out.println("iterating through iterator:");
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
