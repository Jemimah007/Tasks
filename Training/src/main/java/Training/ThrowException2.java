package Training;

class DummyException extends Exception {
	
	 DummyException(String msg){
		System.out.println(msg);
	}
}
public class ThrowException2 {
	
	
   public static void main(String[] args)  {
		
		try {
			vote(17);
			
		} catch (Exception e) {
			
			System.out.println("Age must be 18");
		}

}
   public static void vote (int age) throws Exception {
    
	 if(age < 18) {
	    throw new DummyException("Not Eligible for voting");
	}
    else {
    	System.out.println("Eligible for voting");
}
}
	}