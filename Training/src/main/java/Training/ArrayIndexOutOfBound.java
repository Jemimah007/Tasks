package Training;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		try {
			int a[] = {10,20,30,40,50};
			
			System.out.println(a[6]);
		} catch (java.lang.Exception e) {
			
			System.out.println("Array not found");
		}

	}

}
