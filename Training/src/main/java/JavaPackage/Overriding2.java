package JavaPackage;

public class Overriding2 extends Overriding1 {

	public void swim()
	{
		System.out.println("You love swimming");
	}
	public static void main(String[] args) {
		
		Overriding2 obj = new Overriding2();
				obj.swim();

	}

}
