package JavaPackage;

public class Abstract2 extends Abstract1 {

	public static void main(String[] args) {
		
		Abstract2 obj = new Abstract2();
				obj.a();
		        obj.eat();

	}

	@Override
	void eat() {
		System.out.println("I am eating");
		
	}

}
