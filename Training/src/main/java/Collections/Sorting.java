package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("Hello");
		str.add("Jave");
		str.add("World");
		str.add("Guvi");
		
		System.out.println("Before Sorting ="+str);
		
		
		Collections.sort(str);
		System.out.println("After Sorting ="+str);
				
		
		

	}

}
