package Collections;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		Stack<String> name = new Stack<String>();
		
		name.push("Colleen");
		name.push("Jemimah");
		name.push("Daphny");
		
		name.pop();
		System.out.println("After removing by LIFO"+name);
		
		LinkedList<String> newname = new LinkedList<String>();
		newname.add("A");
		newname.add("B");
		newname.add("C");
		
		newname.remove();
		
		System.out.println("After removing by FIFO"+newname);
		
		TreeMap<Integer,String> mymap = new TreeMap<Integer,String>();
		
		mymap.put(1, "Colleen");
		mymap.put(2, "Jemimah");
		mymap.put(3, "Daphny");
		
		mymap.remove(2);
		
		System.out.println("After removing by TreeMap"+mymap);
			

	}

}
