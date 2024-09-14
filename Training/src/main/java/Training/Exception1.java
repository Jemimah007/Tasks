package Training;

public class Exception1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		System.out.println("Program Started");
		try {
	
		
	System.out.println(a/b);
		}
		
		catch (ArithmeticException ae) {
			//System.out.println("Exception occurs");
			
			ae.printStackTrace();
		}
	System.out.println("Progarm finished");

	}

}
